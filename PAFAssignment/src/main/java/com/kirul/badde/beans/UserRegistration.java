package com.kirul.badde.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {

private List<User> userRecords;
	
	private static UserRegistration usrregd = null;
	
	private UserRegistration() {
		userRecords = new ArrayList<User>();
	}
	
	public static UserRegistration getInstance() {
		if(usrregd == null) {
			usrregd = new UserRegistration();
			return usrregd;
		}
		else {
			return usrregd;
		}
	}
	
	public void add (User usr) {
		userRecords.add(usr);
	}
	
	public String updateUser(User usr) {
		
		for(int i=0; i<userRecords.size(); i++) {
			
			User usr1 = userRecords.get(i);
			if(usr1.getRegistrationNumber().equals(usr.getRegistrationNumber())) {
				userRecords.set(i,usr); //update new record
				return "Updated successfully";
				}
		}
		return "Not Updated";
	}
	
	public String deleteUser(String registrationNumber) {
		
		for(int i=0; i<userRecords.size(); i++) {
			
			User usr1 = userRecords.get(i);
			if(usr1.getRegistrationNumber().equals(registrationNumber)) {
				userRecords.remove(i); //delete record
				return "Deleted Successfully";
			}
		}
		return "Not Deleted";
	}
	
	public List<User> getUserRecords(){
		return userRecords;
	}
}
