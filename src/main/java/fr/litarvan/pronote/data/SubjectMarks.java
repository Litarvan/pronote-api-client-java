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

public class SubjectMarks
{
    private String name;
    private float average;
    private float studentClassAverage;
    private float maxAverage;
    private float minAverage;
    private Mark[] marks;

    public SubjectMarks()
    {
    }

    public SubjectMarks(String name, float average, float studentClassAverage, float maxAverage, float minAverage, Mark[] marks)
    {
        this.name = name;
        this.average = average;
        this.studentClassAverage = studentClassAverage;
        this.maxAverage = maxAverage;
        this.minAverage = minAverage;
        this.marks = marks;
    }

    public String getSubject()
    {
        return name;
    }

    public float getAverage()
    {
        return average;
    }

    public float getStudentClassAverage()
    {
        return studentClassAverage;
    }

    public float getMaxAverage()
    {
        return maxAverage;
    }

    public float getMinAverage()
    {
        return minAverage;
    }

    public Mark[] getMarks()
    {
        return marks;
    }
}
