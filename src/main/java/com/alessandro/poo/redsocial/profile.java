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

	public void addPublication(String text, int likes, LocalDateTime time) {
		Publication publication = new Publication(text, likes, time);
		posts.add(publication);

	}

	public void showPublications() {
		for (Publication publication : posts) {
			// estoy intentando llamar a al metodo SHOW que esta en publication pero no me deja
			System.out.println(show());
		}
	}
}
