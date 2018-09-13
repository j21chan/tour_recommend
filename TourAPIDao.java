package com.dankook.Study_JAVA.myTest;

import java.io.IOException;

public class TourAPIDao {

	private UrlBuilder urlBuilder = new UrlBuilder();
	private UrlRequest urlRequest = new UrlRequest();
	
	// 위치 기반 리스트 조회
	public String getLocationBasedList(String numOfRows, String pageNo, String arrange,
									   String contentTypeId, String mapX, String mapY, String radius) {
		// DTO담을 리스트 생성
		String jsonString = null;
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.locationBasedListURLBuild(numOfRows, pageNo, arrange,
											   										contentTypeId, mapX, mapY, radius));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return jsonString;
	}
}
