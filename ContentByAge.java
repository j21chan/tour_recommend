package com.dankook.Study_JAVA.myTest;

public class ContentByAge {
	private String age;
	private int tour;
	private int culture;
	private int festival;
	private int reports;
	private int shopping;
	private int food;
	
	public ContentByAge(String age, int tour, int culture, int festival, int reports, int shopping, int food) {
		this.age = age;
		this.tour = tour;
		this.culture = culture;
		this.festival = festival;
		this.reports = reports;
		this.shopping = shopping;
		this.food = food;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getTour() {
		return tour;
	}

	public void setTour(int tour) {
		this.tour = tour;
	}

	public int getCulture() {
		return culture;
	}

	public void setCulture(int culture) {
		this.culture = culture;
	}

	public int getFestival() {
		return festival;
	}

	public void setFestival(int festival) {
		this.festival = festival;
	}

	public int getReports() {
		return reports;
	}

	public void setReports(int reports) {
		this.reports = reports;
	}

	public int getShopping() {
		return shopping;
	}

	public void setShopping(int shopping) {
		this.shopping = shopping;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}
	
}
