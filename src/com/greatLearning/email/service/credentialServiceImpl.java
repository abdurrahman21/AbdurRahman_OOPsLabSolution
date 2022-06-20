package com.greatLearning.email.service;

import java.util.Random;

import com.greatLearning.email.model.Employee;

public class credentialServiceImpl implements credentialService {

	@Override
	public String generateEmailAddress(Employee emp, String departmentName) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + departmentName + "."
				+ "greatlearning.com";
	}

	@Override
	public char[] generatePassword() {
		Random random = new Random();

		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacter = "~!@#$%^&*_?<>";
		String concatValue = capLetter + smallLetter + numbers + specialCharacter;

		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = concatValue.charAt(random.nextInt(concatValue.length()));
		}
		return password;
	}

	@Override
	public void showCredential(Employee emp, String email, char[] generatedPassword) {
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Password ---> ");
		stringBuilder.append(generatedPassword);
		System.out.println(stringBuilder.toString());
	}

}
