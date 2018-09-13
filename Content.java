package com.dankook.Study_JAVA.myTest;

public class Content implements Comparable<Content> {
	private String contentName;
	private int score;
	
	public Content(String contentName, int score) {
		this.contentName = contentName;
		this.score = score;
	}
	
	public String getContentName() {
		return this.contentName;
	}
	public int getScore() {
		return this.score;
	}
	
	public String toString() {
		return "[" + this.contentName + ", " + this.score + "]";
	}
	
	public int compareTo(Content con) {
		return -Integer.compare(this.score, con.getScore());
	}
}
