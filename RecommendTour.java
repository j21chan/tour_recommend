package com.dankook.Study_JAVA.myTest;

import java.util.ArrayList;

public class RecommendTour {
	
	public RecommendTour() {
		
	}
	
	public ArrayList<LocationBasedList> recommend(ArrayList<Content> rankTourList, String mapx, String mapy) {
		
		ArrayList<LocationBasedList> resultList = new ArrayList<LocationBasedList>();
		mapx = "126.981106";
		mapy = "37.568477";
		
		for(Content tempContent : rankTourList) {
			ArrayList<Object> tempList = new ArrayList<Object>();
			String jsonString = null;
			
//			System.out.println("\ntemp Content : " + tempContent.getContentName());
			
			String tourContentType = tempContent.getContentName();
			
			if(tourContentType.equals("tour")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "12", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			else if(tourContentType.equals("culture")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "14", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			else if(tourContentType.equals("festival")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "15", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			else if(tourContentType.equals("reports")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "28", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			else if(tourContentType.equals("shopping")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "38", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			else if(tourContentType.equals("food")) {
				jsonString = new TourAPIDao().getLocationBasedList("30", "1", "B", "39", mapx, mapy, "2000");
				tempList = new LocationBasedListJsonParser().parse(jsonString);
			}
			
			if(tempList != null) {
				for(Object tempLocation : tempList) {
					resultList.add((LocationBasedList) tempLocation);
				}
			}
		}
		
		return resultList;
	}
}
