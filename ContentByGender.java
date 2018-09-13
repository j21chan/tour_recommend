package com.dankook.Study_JAVA.myTest;

public class ContentByGender {
	private String gender;
	private int tour;
	private int culture;
	private int festival;
	private int reports;
	private int shopping;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	private int food;
	
	public ContentByGender(String gender, int tour, int culture, int festival, int reports, int shopping, int food) {
		this.gender = gender;
		this.tour = tour;
		this.culture = culture;
		this.festival = festival;
		this.reports = reports;
		this.shopping = shopping;
		this.food = food;
	}
	
	
}
