package com.greatLearning.email.test;

import java.util.Random;

public class TestPasword {
	
	public static void main(String args[]) {
		Random random = new Random();
		
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = capLetter.toLowerCase();
		String numbers = "0123456789";
		String specialCharacter = "~!@#$%^&*_?<>";
		String concatValue = capLetter + smallLetter + numbers + specialCharacter;
		
		char[] password = new char[8];
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < password.length; j++) {
				password[i] = concatValue.charAt(random.nextInt(concatValue.length()));
			}
		}
		
	} 

}
