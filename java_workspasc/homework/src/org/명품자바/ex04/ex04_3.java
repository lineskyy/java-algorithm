package org.java.ex04;

class Song{
	private String title,artist,country;
	private int year;
	public Song() {}
	public Song(int year,String country,String artist,String title) {
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}

	public String gettitle() {return title;}
	public String getartist() {return artist;}
	public int getyear() {return year;}
	public String getcountry() {return country;}
	
	public void show() {
		System.out.println(getyear()+" 년 "+getcountry()+" 국적의 "+getartist()+" 가 부른 "+gettitle());

	}
}

public class ex04_3 {
	public static void main(String[] args) {
		Song song = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		song.show();
	}
}
