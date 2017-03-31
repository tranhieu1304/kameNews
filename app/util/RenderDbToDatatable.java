package util;

import java.math.BigInteger;
import java.security.SecureRandom;

import models.Contact;

public  class RenderDbToDatatable {

	private static SecureRandom sRandom = new SecureRandom();

	public Contact randomContact() {
		String[] peoples = { "Bob", "Jill", "Tom", "Brandon", "Kame", "Napa", "Sol", "Dung", "Katsun" };
		String[] title = { "Mr. Temperament", "Detective", "Illustrator", "Anthropomorphic dog", "Mickeys Dog",
				"Archaeologist", "Grandma", "Lucky guy", "Beatnik" };
		Contact con = new Contact();
		con.name = peoples[0 + (int) (Math.random() * 8)] + (0 + (int) (Math.random() * 200) );
		con.title = title[0 + (int) (Math.random() * 8)] + (0 + (int) (Math.random() * 100) ) +peoples[0 + (int) (Math.random() * 8)];
		con.email = nextSessionId() + "@kame.identity";
		return con;
	}

	private static String nextSessionId() {
		return new BigInteger(130, sRandom).toString(32);
	}
}
