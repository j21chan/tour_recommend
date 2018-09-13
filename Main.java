package com.dankook.Study_JAVA.myTest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	// mapx, mapy => 하드코딩
	// 나이 => 하드코딩
	
	
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		String tourArea = "";
		String country = "";
		String gender = "";
		int age = 10;
		
		System.out.println("#### Tour API Test Module ####\n\n");
		
		System.out.println("#### 케이스를 입력하시오 ####");
		System.out.println("#   1. 관광 도시 [입력 X]   #");
		System.out.println("#   2. 국적, 성별, 나이     #");
		System.out.println("#   3. 국적, 성별           #");
		System.out.println("#   4. 국적                 #");
		System.out.println("#   5. 입력 안함            #");
		System.out.println("#############################");
		
		System.out.printf("\n케이스 입력 : ");
		int userCase = scan.nextInt();
		
		switch(userCase){
		case 1:
			System.out.println("[서울, 인천, 경기, 강원, 충청, 전라, 경상, 제주]");
			System.out.printf("관광 도시 : ");
			tourArea = scan.next();
			
			// 관광지 추천
			System.out.println(new RankTour().getDefaultTourList(tourArea).toString());
			break;
			
		case 2:
			System.out.printf("국적 : ");
			country = scan.next();
			
			System.out.printf("성별 [남, 여] : ");
			gender = scan.next();
			
			System.out.printf("나이 : ");
			age = scan.nextInt();
			
			System.out.println("");
			
			// 관광지 순위
			ArrayList<Content> tempList = new RankTour().getTourList(country, gender, age);
			for(Content tempContent : tempList) {
				System.out.println(tempContent.toString());
			}
			
			System.out.println("");
			
			// 관광지 추천
			ArrayList<LocationBasedList> recommendList = new RecommendTour().recommend(tempList, "", "");
			for(LocationBasedList tempRec : recommendList) {
				System.out.println(tempRec.toString());
			}
			
			break;
			
		case 3:
			System.out.printf("국적 : ");
			country = scan.next();
			
			System.out.printf("성별 [남, 여] : ");
			gender = scan.next();
			
			System.out.println("");

			
			// 관광지 순위
			ArrayList<Content> tempList1 = new RankTour().getTourList(country, gender);
			for(Content tempContent : tempList1) {
				System.out.println(tempContent.toString());
			}

			System.out.println("");
			
			// 관광지 추천
			ArrayList<LocationBasedList> recommendList1 = new RecommendTour().recommend(tempList1, "", "");
			for(LocationBasedList tempRec : recommendList1) {
				System.out.println(tempRec.toString());
			}
			
			break;
			
		case 4:
			System.out.printf("국적 : ");
			country = scan.next();
			
			System.out.println("");
			
			// 관광지 순위
			ArrayList<Content> tempList2 = new RankTour().getTourList(country);
			for(Content tempContent : tempList2) {
				System.out.println(tempContent.toString());
			}
			
			System.out.println("");
			
			// 관광지 추천
			ArrayList<LocationBasedList> recommendList2 = new RecommendTour().recommend(tempList2, "", "");
			for(LocationBasedList tempRec : recommendList2) {
				System.out.println(tempRec.toString());
			}
			
			break;
			
		default:
			
			break;
		}
	}
}
