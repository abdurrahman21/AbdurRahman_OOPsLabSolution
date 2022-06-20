package com.greatLearning.email.service;

import com.greatLearning.email.model.Employee;

public interface credentialService {
	
	public String generateEmailAddress(Employee emp, String departmentName);
	
	public char[] generatePassword();
	
	public void showCredential(Employee emp, String email, char[] generatePassword);

}
