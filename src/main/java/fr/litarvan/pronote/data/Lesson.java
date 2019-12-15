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

public class Lesson
{
    private String subject;
    private String teacher;
    private String room;

    private long from;
    private long to;

    private boolean away;
    private boolean cancelled;

    public Lesson()
    {
    }

    public Lesson(String subject, String teacher, String room, long from, long to, boolean away, boolean cancelled)
    {
        this.subject = subject;
        this.teacher = teacher;
        this.room = room;
        this.from = from;
        this.to = to;
        this.away = away;
        this.cancelled = cancelled;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getTeacher()
    {
        return teacher;
    }

    public String getRoom()
    {
        return room;
    }

    public long getFrom()
    {
        return from;
    }

    public long getTo()
    {
        return to;
    }

    public boolean isAway()
    {
        return away;
    }

    public boolean isCancelled()
    {
        return cancelled;
    }
}
