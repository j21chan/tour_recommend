package com.dankook.Study_JAVA.myTest;

import java.util.ArrayList;
import java.util.Collections;

public class TourCalculator {
	
	public TourCalculator() {
		
	}
	
	public ArrayList<Content> calculate(ArrayList<Content> conByCountry, ArrayList<Content> conByGender,ArrayList<Content> conByAge) {
		
		ArrayList<Content> resultList = new ArrayList<Content>();
		
		int tour  = 	(int) ((conByCountry.get(0).getScore()*0.6) + (conByGender.get(0).getScore()*0.3) + (conByAge.get(0).getScore()*0.1));
		int culture = 	(int) ((conByCountry.get(1).getScore()*0.6) + (conByGender.get(1).getScore()*0.3) + (conByAge.get(1).getScore()*0.1));
		int festival = 	(int) ((conByCountry.get(2).getScore()*0.6) + (conByGender.get(2).getScore()*0.3) + (conByAge.get(2).getScore()*0.1));
		int reports = 	(int) ((conByCountry.get(3).getScore()*0.6) + (conByGender.get(3).getScore()*0.3) + (conByAge.get(3).getScore()*0.1));
		int shopping = 	(int) ((conByCountry.get(4).getScore()*0.6) + (conByGender.get(4).getScore()*0.3) + (conByAge.get(4).getScore()*0.1));
		int food = 		(int) ((conByCountry.get(5).getScore()*0.6) + (conByGender.get(5).getScore()*0.3) + (conByAge.get(5).getScore()*0.1));
		
		Content con1 = new Content("tour", tour);
		Content con2 = new Content("culture", culture);
		Content con3 = new Content("festival", festival);
		Content con4 = new Content("reports", reports);
		Content con5 = new Content("shopping", shopping);
		Content con6 = new Content("food", food);
		
		resultList.add(con1);
		resultList.add(con2);
		resultList.add(con3);
		resultList.add(con4);
		resultList.add(con5);
		resultList.add(con6);
		
		Collections.sort(resultList);
		
		return resultList;
	}
	
	public ArrayList<Content> calculate(ArrayList<Content> conByCountry, ArrayList<Content> conByGender) {
		
		ArrayList<Content> resultList = new ArrayList<Content>();
		
		int tour  = 	(int) ((conByCountry.get(0).getScore()*0.6) + (conByGender.get(0).getScore()*0.4));
		int culture = 	(int) ((conByCountry.get(1).getScore()*0.6) + (conByGender.get(1).getScore()*0.4));
		int festival = 	(int) ((conByCountry.get(2).getScore()*0.6) + (conByGender.get(2).getScore()*0.4));
		int reports = 	(int) ((conByCountry.get(3).getScore()*0.6) + (conByGender.get(3).getScore()*0.4));
		int shopping = 	(int) ((conByCountry.get(4).getScore()*0.6) + (conByGender.get(4).getScore()*0.4));
		int food = 		(int) ((conByCountry.get(5).getScore()*0.6) + (conByGender.get(5).getScore()*0.4));
		
		Content con1 = new Content("tour", tour);
		Content con2 = new Content("culture", culture);
		Content con3 = new Content("festival", festival);
		Content con4 = new Content("reports", reports);
		Content con5 = new Content("shopping", shopping);
		Content con6 = new Content("food", food);
		
		resultList.add(con1);
		resultList.add(con2);
		resultList.add(con3);
		resultList.add(con4);
		resultList.add(con5);
		resultList.add(con6);
		
		Collections.sort(resultList);
		
		return resultList;
	}
}
