package com.dankook.Study_JAVA.myTest;

public class ConvertAge {
	public static String convert(int age) {
		String ageName = "";
		
		if(age >= 60) {
			ageName = "60대";
		}
		else if(age >= 50) {
			ageName = "50대";
		}
		else if(age >= 40) {
			ageName = "40대";
		}
		else if(age >= 30) {
			ageName = "30대";
		}
		else if(age >= 20) {
			ageName = "20대";
		}
		else if(age >= 10) {
			ageName = "10대";
		}
		else {
			ageName = "무응답";
		}
		
		return ageName;
	}
}
