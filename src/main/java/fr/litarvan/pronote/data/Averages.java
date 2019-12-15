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

public class Averages
{
    private float student;
    private float studentClass;
    private int period;

    public Averages()
    {
    }

    public Averages(float student, float studentClass, int period)
    {
        this.student = student;
        this.studentClass = studentClass;
        this.period = period;
    }

    public float getStudent()
    {
        return student;
    }

    public float getStudentClass()
    {
        return studentClass;
    }

    public int getPeriod()
    {
        return period;
    }
}
