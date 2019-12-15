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
package fr.litarvan.pronote.data;

public class Homework
{
    private String subject;
    private String content;
    private long since;
    private long until;
    private boolean toGive;
    private FileUpload[] files;

    public Homework()
    {
    }

    public Homework(String subject, String content, long since, long until, boolean toGive, FileUpload[] files)
    {
        this.subject = subject;
        this.content = content;
        this.since = since;
        this.until = until;
        this.toGive = toGive;
        this.files = files;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getContent()
    {
        return content;
    }

    public long getSince()
    {
        return since;
    }

    public long getUntil()
    {
        return until;
    }

    public boolean isToGive()
    {
        return toGive;
    }

    public FileUpload[] getFiles()
	{
		return files;
	}
}
