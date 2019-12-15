package fr.litarvan.pronote;

public class FetchRequest extends Request
{
    public FetchRequest(String username, String password, String url)
    {
        super("login", username, password, url, "none");
    }

    public FetchRequest(String username, String password, String url, String cas)
    {
        super("fetch", username, password, url, cas);
    }
}
