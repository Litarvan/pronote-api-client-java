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

public class Report
{
	private int period;
	private ReportSubject[] subjects;
	private Averages averages;
	private Comment[] comments;

	public Report()
	{
	}

	public Report(int period, ReportSubject[] subjects, Averages averages, Comment[] comments)
	{
		this.period = period;
		this.subjects = subjects;
		this.averages = averages;
		this.comments = comments;
	}

	public int getPeriod()
	{
		return period;
	}

	public ReportSubject[] getSubjects()
	{
		return subjects;
	}

	public Averages getAverages()
	{
		return averages;
	}

	public Comment[] getComments()
	{
		return comments;
	}

	public static class ReportSubject
	{
		private String name;
		private float average;
		private float studentClassAverage;
		private float maxAverage;
		private float minAverage;
		private String comment;
		private float coefficient;

		public ReportSubject()
		{
		}

		public ReportSubject(String name, float average, float studentClassAverage, float maxAverage, float minAverage, String comment, float coefficient)
		{
			this.name = name;
			this.average = average;
			this.studentClassAverage = studentClassAverage;
			this.maxAverage = maxAverage;
			this.minAverage = minAverage;
			this.comment = comment;
			this.coefficient = coefficient;
		}

		public String getName()
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

		public String getComment()
		{
			return comment;
		}

		public float getCoefficient()
		{
			return coefficient;
		}
	}

	public static class Comment
	{
		private String title;
		private String value;

		public Comment()
		{
		}

		public Comment(String title, String value)
		{
			this.title = title;
			this.value = value;
		}

		public String getTitle()
		{
			return title;
		}

		public String getValue()
		{
			return value;
		}
	}
}
