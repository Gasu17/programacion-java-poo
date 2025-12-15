package com.alessandro.poo.redsocial;

import java.time.LocalDateTime;

public class Publication {
	
	private String text;
	private LocalDateTime time;
	private int likes;
	
	
	public void show () {
		System.out.println(this.text);
		System.out.println(this.time);
		System.out.println(this.likes);
	}
	
	public String getText() {
		return text;
	}
	// Constructor 
	public Publication(String text, int Likes, LocalDateTime time) {
		super();
		this.text = text;
		this.likes=0;
		this.time=LocalDateTime.now();
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void giveLike () {
		this.likes ++;
	}
	
	public int showLikes() {
		return likes;
	}
	public void showTime() {
		System.out.printf(" [ %s ] %s ( %d likes) %n" );
	}
	
	
	 // private String formatearHora( ) {
		//  return this.time.format(DATE_TIME_FORMATTER);
	
	

}
}
