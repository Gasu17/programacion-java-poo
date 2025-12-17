package com.alessandro.poo.redsocial;

public class ProfileGenerator {

	public static Profile createProfileTest(String username) {
		Profile ptest = new Profile();
		ptest.setUsername(username);
		ptest.setBiography("test");
		ptest.setLocation("madrid");
		;
		return ptest;
	}

	public static Profile createProfileTestPublications(int numpost) {
		Profile ptestp = createProfileTest("ptestp");
		for (int i = 0; i < numpost; i++) {
			ptestp.addPublication("test");
		}

		return ptestp;
	}
}
