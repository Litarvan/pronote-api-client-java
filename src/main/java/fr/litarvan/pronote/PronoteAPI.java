/*
 *  Copyright (c) 2017-2019 Adrien 'Litarvan' Navratil
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package fr.litarvan.pronote;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * <h2>Pronote API</h2>
 *
 * You must have an <a href="https://github.com/Litarvan/pronote-api">API server</a> setup.
 * Then, use it like this :
 * <pre>
 *     PronoteAPI api = new PronoteAPI("http://127.0.0.1:21727/");
 *
 *     try {
 *         api.login(new LoginRequest("username", "password", "pronote url", "cas");
 *     } catch (RequestException e) {
 *         // ...
 *     }
 *
 *     FetchResponse response = api.fetch(new FetchResponse("username", "password", "pronote url", "cas");
 *     System.out.println(String.format("Welcome %s !", response.getName()));
 * </pre>
 *
 * The "cas" field is optional, it is necessary only if your Pronote server redirects you to a regional-specific
 * interface to login, then chose the right one (ex: "ac-lyon"), see the API server README.
 *
 * @author Adrien 'Litarvan' Navratil
 * @version 1.0.0
 * @since 1.0.0
 */
public class PronoteAPI
{
    public static final String VERSION = "1.0.0";
    private static final Gson gson = new Gson();

    private String url;

    /**
     * @param url URL of the <a href="https://github.com/Litarvan/pronote-api">API server</a>
     */
    public PronoteAPI(String url)
    {
        this.url = url;
    }

    /**
     * Login the user (does not fetch any data).
     * This request is optional, doing fetch without "login" will first do login
     *
     * @param request The request data
     *
     * @return Nothing
     *
     * @throws IOException If the HTTP connection or I/O failed
     * @throws RequestException If the "error" field is not empty, throw an exception with its content
     */
    public LoginResponse login(LoginRequest request) throws IOException, RequestException
    {
        return request(request, LoginResponse.class);
    }

    /**
     * Fetch the data. If login wasn't done before, login the user first
     *
     * @param request The request data
     *
     * @return The fetched data (some fields can be empty if not present on the server)
     *
     * @throws IOException If the HTTP connection or I/O failed
     * @throws RequestException If the "error" field is not empty, throw an exception with its content. If this happen on a fetch
     * request with login having been done, it means there's an issue with the API. Please open an issue on Github.
     */
    public FetchResponse fetch(FetchRequest request) throws IOException, RequestException
    {
        return request(request, FetchResponse.class);
    }

    private <R extends Response> R request(Object request, Class<?> responseClass) throws IOException, RequestException
    {
        URL url = new URL(this.url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setDoInput(true);
        connection.setDoOutput(true);

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");

        try (DataOutputStream out = new DataOutputStream(connection.getOutputStream()))
        {
            out.write(gson.toJson(request).getBytes(StandardCharsets.UTF_8));
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8)))
        {
            String line;

            while ((line = in.readLine()) != null)
            {
                content.append(line).append(System.lineSeparator());
            }
        }

        connection.disconnect();

        R response = (R) gson.fromJson(content.toString(), responseClass);
        if (response.getError() != null)
        {
            throw new RequestException(new Exception(response.getError()));
        }

        return response;
    }

    public String getUrl()
    {
        return url;
    }
}
