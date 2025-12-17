package com.alessandro.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publication {
	
	private String text;
	private LocalDateTime time;
	private int likes;
	
	private static final String DATE_TIME_FORMATTER ="dd/MM/yyyy HH:mm:ss";
	
	
	public void show () {
		System.out.println(this.text);
		System.out.println(this.time);
		System.out.println(this.likes);
	}
	
	public String getText() {
		return text;
	}
	// Constructor 
	public Publication(String text) {
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
	
	
   private String formatearHora( ) {
	  return this.time.format(DateTimeFormatter.ofPattern(DATE_TIME_FORMATTER));
	
  }
   
   
   public static void main(String[] args) {
	   Publication p = new Publication("hola mundo");
	   System.out.println(p.formatearHora());
   }
   
}
