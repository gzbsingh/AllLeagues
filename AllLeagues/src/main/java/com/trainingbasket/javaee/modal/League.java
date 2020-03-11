package com.trainingbasket.javaee.modal;

public class League 
{
	static int tempID;
	int id;
	int year;
	String title;
	String season;
	 
	 
	 public League(int year, String title, String season) 
		{
			super();
			this.id = ++tempID;
			this.year = year;
			this.title = title;
			this.season = season;
		}

		public League() 
		{
			
		}
	 

		public int getId() 
		{
			return this.id;
		}
		
		public void setId(int id) 
		{
			this.id = id;
		}
		
	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getSeason() 
	{
		return season;
	}

	public void setSeason(String season) 
	{
		this.season = season;
	}

	
	@Override
	public String toString()
	{
		return "<td>" + title + "</td>" + " <td>" + season + "</td><td>" + year + "</td>\n";

	}

}
