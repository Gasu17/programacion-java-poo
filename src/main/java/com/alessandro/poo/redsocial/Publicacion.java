package com.alessandro.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	
	private String text;
	private LocalTime time;
	private int likes;
	
	
	public void show () {
		System.out.println(this.text);
		System.out.println(this.time);
		System.out.println(this.likes);
	}
	
	public void giveLike () {
		this.likes ++;
	}
	
	public int showLikes() {
		return likes;
		
	}

}
