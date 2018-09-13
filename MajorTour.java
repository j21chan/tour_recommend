package com.dankook.Study_JAVA.myTest;

public class MajorTour {
	private String local_area;
	private String rank1;
	private String rank2;
	private String rank3;
	private String rank4;
	private String rank5;
	private String rank6;
	private String rank7;
	private String rank8;
	private String rank9;
	private String rank10;
	
	public MajorTour(String local_area, String rank1, String rank2, String rank3, String rank4, String rank5,
			String rank6, String rank7, String rank8, String rank9, String rank10) {
		this.local_area = local_area;
		this.rank1 = rank1;
		this.rank2 = rank2;
		this.rank3 = rank3;
		this.rank4 = rank4;
		this.rank5 = rank5;
		this.rank6 = rank6;
		this.rank7 = rank7;
		this.rank8 = rank8;
		this.rank9 = rank9;
		this.rank10 = rank10;
	}
	
	public String toString() {
		return "[" + local_area + ", " + rank1 + ", " + rank2 + ", "+ rank3 + ", " + rank4 + ", " + rank5 + ", " + rank6 + ", " + rank7 + ", " + rank8 + ", " + rank9 + ", " + rank10 + "]";
	}
	
	public String getLocal_area() {
		return local_area;
	}
	public void setLocal_area(String local_area) {
		this.local_area = local_area;
	}
	public String getRank1() {
		return rank1;
	}
	public void setRank1(String rank1) {
		this.rank1 = rank1;
	}
	public String getRank2() {
		return rank2;
	}
	public void setRank2(String rank2) {
		this.rank2 = rank2;
	}
	public String getRank3() {
		return rank3;
	}
	public void setRank3(String rank3) {
		this.rank3 = rank3;
	}
	public String getRank4() {
		return rank4;
	}
	public void setRank4(String rank4) {
		this.rank4 = rank4;
	}
	public String getRank5() {
		return rank5;
	}
	public void setRank5(String rank5) {
		this.rank5 = rank5;
	}
	public String getRank6() {
		return rank6;
	}
	public void setRank6(String rank6) {
		this.rank6 = rank6;
	}
	public String getRank7() {
		return rank7;
	}
	public void setRank7(String rank7) {
		this.rank7 = rank7;
	}
	public String getRank8() {
		return rank8;
	}
	public void setRank8(String rank8) {
		this.rank8 = rank8;
	}
	public String getRank9() {
		return rank9;
	}
	public void setRank9(String rank9) {
		this.rank9 = rank9;
	}
	public String getRank10() {
		return rank10;
	}
	public void setRank10(String rank10) {
		this.rank10 = rank10;
	}
	
}
