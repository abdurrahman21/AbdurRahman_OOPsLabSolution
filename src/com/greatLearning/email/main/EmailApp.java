package com.greatLearning.email.main;

import java.util.Scanner;

import com.greatLearning.email.model.Employee;
import com.greatLearning.email.service.credentialService;
import com.greatLearning.email.service.credentialServiceImpl;

public class EmailApp {

	public static void main(String args[]) {

		credentialService credential = new credentialServiceImpl();

		Scanner sc = new Scanner(System.in);

		int selectDep;
		String departmentName;
		String firstName;
		String lastName;
		String generateEmail;
		char[] generatedPassword;

		System.out.println("Enter the firstName");
		firstName = sc.next();
		System.out.println("Enter the LastName");
		lastName = sc.next();
		Employee emp = new Employee(firstName, lastName);

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		selectDep = sc.nextInt();

		switch (selectDep) {

		case 1:
			departmentName = "tech";
			generateEmail = credential.generateEmailAddress(emp, departmentName);
			generatedPassword = credential.generatePassword();
			credential.showCredential(emp, generateEmail, generatedPassword);
			break;

		case 2:
			departmentName = "admin";
			generateEmail = credential.generateEmailAddress(emp, departmentName);
			generatedPassword = credential.generatePassword();
			credential.showCredential(emp, generateEmail, generatedPassword);
			break;

		case 3:
			departmentName = "hr";
			generateEmail = credential.generateEmailAddress(emp, departmentName);
			generatedPassword = credential.generatePassword();
			credential.showCredential(emp, generateEmail, generatedPassword);
			break;

		case 4:
			departmentName = "legal";
			generateEmail = credential.generateEmailAddress(emp, departmentName);
			generatedPassword = credential.generatePassword();
			credential.showCredential(emp, generateEmail, generatedPassword);
			break;
			
		default:
			System.out.println("Please select correct option");

		}

	}

}
