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

import java.util.Calendar;

public class Mark
{
    private String subject;
    private String title;
    private float value;
    private boolean away;
    private float max;
    private float average;
    private float higher;
    private float lower;
    private float coefficient;
    private int period;
    private long time;

    public Mark()
    {
    }

    public Mark(String subject, String title, float value, boolean away, float max, float average, float higher, float lower, float coefficient, int period, long time)
    {
        this.subject = subject;
        this.title = title;
        this.value = value;
        this.away = away;
        this.max = max;
        this.average = average;
        this.higher = higher;
        this.lower = lower;
        this.coefficient = coefficient;
        this.period = period;
        this.time = time;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getTitle()
    {
        return title;
    }

    public float getValue()
    {
        return value;
    }

    public boolean isAway()
    {
        return away;
    }

    public float getMax()
    {
        return max;
    }

    public float getAverage()
    {
        return average;
    }

    public float getHigher()
    {
        return higher;
    }

    public float getLower()
    {
        return lower;
    }

    public float getCoefficient()
    {
        return coefficient;
    }

    public int getPeriod()
    {
        return period;
    }

    public long getTime()
    {
        return time;
    }
}
