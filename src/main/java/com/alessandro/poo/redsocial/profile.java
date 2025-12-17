package com.alessandro.poo.redsocial;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String username;
	private String displayName;
	private String biography;
	private String location;
	private int followers;
	private int post;
	private boolean verifiedAccount;
	private ProfileStatus status;
	List<Publication> posts = new ArrayList<>();


	public Profile() {
		super();
		this.posts = new ArrayList<>();
	}
	public Profile(String username, String biography, String location) {
		super();
		this.username = username;
		this.biography = biography;
		this.location = location;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public void showInfo() {
		System.out.println(this.username);

	}

	public void addFollowers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de seguidores");
		int amount = 0;
		try {
			amount = sc.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Introduce un formato valido ");
		}
		followers = followers + amount;
	}

	public void profileStatus(String Status) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el estado deseado");
		String value = sc.nextLine();
		try {
			this.status = ProfileStatus.valueOf(value.toUpperCase());
		} catch (IllegalArgumentException e) {
			System.out.println("Estado no valido. Usa: ACTIVE, INACTIVE o BANNED");
		}

	}

	public boolean checkStatus() {
		return this.status == ProfileStatus.ACTIVE;
	}

	public void changeStatus() {
		if (this.status == ProfileStatus.ACTIVE) {
			this.status = ProfileStatus.INACTIVE;
		} else {
			this.status = ProfileStatus.ACTIVE;
		}

	}

	public void addPublication(String text) {
		Publication publication = new Publication(text);
		posts.add(publication);

	}

	public void showPublications() {
		for (Publication publication : posts) {
			
			publication.show();
		}
	}
}
