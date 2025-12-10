package com.alessandro.poo.redsocial;

import java.util.Scanner;

public class Profile {

	private String username;
	private String displayName;
	private String biography;
	private String location;
	private int followers;
	private int post;
	private boolean verifiedAccount;
	private ProfileStatus status;

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
	public boolean checkStatus () {
		if (this.status == ProfileStatus.ACTIVE) {
			return true;

		} else {
			return false;
		}
		
	}
	public boolean changeStatus(checkStatus) {
		
	}

}
