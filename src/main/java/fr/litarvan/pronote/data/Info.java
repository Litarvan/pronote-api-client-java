package fr.litarvan.pronote.data;

public class Info
{
    private long time;
    private String title;
    private String teacher;
    private String content;
    private FileUpload[] files;

    public Info()
    {
    }

    public Info(long time, String title, String teacher, String content, FileUpload[] files)
    {
        this.time = time;
        this.title = title;
        this.teacher = teacher;
        this.content = content;
        this.files = files;
    }

    public long getTime()
    {
        return time;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTeacher()
    {
        return teacher;
    }

    public String getContent()
    {
        return content;
    }

    public FileUpload[] getFiles()
    {
        return files;
    }
}
