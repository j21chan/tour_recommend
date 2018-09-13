package com.dankook.Study_JAVA.myTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;



public class RankTour {
	
	public RankTour() {
		
	}
	
	public MajorTour getDefaultTourList(String tourArea) throws SQLException {
		String sql = "select * from major_tour where local_area = ? ";
		PreparedStatement preStatement = null;
		Connection conn = new MySQLConnector().getConn();
		ResultSet rs = null;
		MajorTour mt = null;
		
		preStatement = conn.prepareStatement(sql);
		preStatement.setString(1, tourArea);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			String rank1 = rs.getString("rank1");
			String rank2 = rs.getString("rank2");
			String rank3 = rs.getString("rank3");
			String rank4 = rs.getString("rank4");
			String rank5 = rs.getString("rank5");
			String rank6 = rs.getString("rank6");
			String rank7 = rs.getString("rank7");
			String rank8 = rs.getString("rank8");
			String rank9 = rs.getString("rank9");
			String rank10 = rs.getString("rank10");
			
			mt = new MajorTour(tourArea, rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8, rank9, rank10);
			
		}
		
		preStatement.close();
		conn.close();
		
		return mt;
	}
	
	public ArrayList<Content> getTourList(String country, String gender, int age) throws SQLException {
		String ageName = ConvertAge.convert(age);
		String sql1 = "select * from content_by_country where country = ? ";
		String sql2 = "select * from content_by_gender where gender = ? ";
		String sql3 = "select * from content_by_age where age = ? ";

		PreparedStatement preStatement = null;
		Connection conn = new MySQLConnector().getConn();
		ResultSet rs = null;
		ArrayList<Content> contentByCountryList = new ArrayList<Content>();
		ArrayList<Content> contentByGenderList = new ArrayList<Content>();
		ArrayList<Content> contentByAgeList = new ArrayList<Content>();

		// 국적에 따른 선호도
		preStatement = conn.prepareStatement(sql1);
		preStatement.setString(1, country);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentByCountryList.add(con1);
			contentByCountryList.add(con2);
			contentByCountryList.add(con3);
			contentByCountryList.add(con4);
			contentByCountryList.add(con5);
			contentByCountryList.add(con6);
		}
		
		
		// 성별에 따른 선호도
		preStatement = conn.prepareStatement(sql2);
		preStatement.setString(1, gender);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentByGenderList.add(con1);
			contentByGenderList.add(con2);
			contentByGenderList.add(con3);
			contentByGenderList.add(con4);
			contentByGenderList.add(con5);
			contentByGenderList.add(con6);
		}
		
		
		// 나이에 따른 선호도
		preStatement = conn.prepareStatement(sql3);
		preStatement.setString(1, ageName);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentByAgeList.add(con1);
			contentByAgeList.add(con2);
			contentByAgeList.add(con3);
			contentByAgeList.add(con4);
			contentByAgeList.add(con5);
			contentByAgeList.add(con6);
		}
		
		
		
		preStatement.close();
		conn.close();
		
		return new TourCalculator().calculate(contentByCountryList, contentByGenderList, contentByAgeList);
	}
	
	public ArrayList<Content> getTourList(String country, String gender) throws SQLException {
		
		String sql1 = "select * from content_by_country where country = ? ";
		String sql2 = "select * from content_by_gender where gender = ? ";

		PreparedStatement preStatement = null;
		Connection conn = new MySQLConnector().getConn();
		ResultSet rs = null;
		ArrayList<Content> contentByCountryList = new ArrayList<Content>();
		ArrayList<Content> contentByGenderList = new ArrayList<Content>();

		// 국적에 따른 선호도
		preStatement = conn.prepareStatement(sql1);
		preStatement.setString(1, country);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentByCountryList.add(con1);
			contentByCountryList.add(con2);
			contentByCountryList.add(con3);
			contentByCountryList.add(con4);
			contentByCountryList.add(con5);
			contentByCountryList.add(con6);
		}
		
		
		// 성별에 따른 선호도
		preStatement = conn.prepareStatement(sql2);
		preStatement.setString(1, gender);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentByGenderList.add(con1);
			contentByGenderList.add(con2);
			contentByGenderList.add(con3);
			contentByGenderList.add(con4);
			contentByGenderList.add(con5);
			contentByGenderList.add(con6);
		}
		
		preStatement.close();
		conn.close();
		
		return new TourCalculator().calculate(contentByCountryList, contentByGenderList);
	}
	
	public ArrayList<Content> getTourList(String country) throws SQLException {
		String sql = "select * from content_by_country where country = ? ";
		PreparedStatement preStatement = null;
		Connection conn = new MySQLConnector().getConn();
		ResultSet rs = null;
		ArrayList<Content> contentList = new ArrayList<Content>();
		
		preStatement = conn.prepareStatement(sql);
		preStatement.setString(1, country);
		
		rs = preStatement.executeQuery();
		
		while(rs.next()) {
			int tour = rs.getInt("tour");
			int culture = rs.getInt("culture");
			int festival = rs.getInt("festival");
			int reports = rs.getInt("reports");
			int shopping = rs.getInt("shopping");
			int food = rs.getInt("food");
			
			Content con1 = new Content("tour", tour);
			Content con2 = new Content("culture", culture);
			Content con3 = new Content("festival", festival);
			Content con4 = new Content("reports", reports);
			Content con5 = new Content("shopping", shopping);
			Content con6 = new Content("food", food);
		
			contentList.add(con1);
			contentList.add(con2);
			contentList.add(con3);
			contentList.add(con4);
			contentList.add(con5);
			contentList.add(con6);
		}
		
		Collections.sort(contentList);
		
		preStatement.close();
		conn.close();
		
		return contentList;
	}
}
