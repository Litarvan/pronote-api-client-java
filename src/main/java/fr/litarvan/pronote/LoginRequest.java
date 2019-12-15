package fr.litarvan.pronote;

public class LoginRequest extends Request
{
    public LoginRequest(String username, String password, String url)
    {
        super("login", username, password, url, "none");
    }

    public LoginRequest(String username, String password, String url, String cas)
    {
        super("login", username, password, url, cas);
    }
}
