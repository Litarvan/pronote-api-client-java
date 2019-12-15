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

public class CompleteFileUpload extends FileUpload
{
	private long time;
	private String subject;

	public CompleteFileUpload()
	{
		super();
	}

	public CompleteFileUpload(String name, String url, long time, String subject)
	{
		super(name, url);

		this.time = time;
		this.subject = subject;
	}

	public long getTime()
	{
		return time;
	}

	public String getSubject()
	{
		return subject;
	}
}
