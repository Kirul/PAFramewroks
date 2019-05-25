package com.kirul.badde.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kirul.badde.beans.User;
import com.kirul.badde.beans.UserRegistration;
import com.kirul.badde.beans.UserRegistrationReply;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

	@RequestMapping (method = RequestMethod.POST, value="/user")
	
	@ResponseBody
	public UserRegistrationReply registerUser(@RequestBody User user) {
		System.out.println("In registerUser");
		
		UserRegistrationReply usrregreply = new UserRegistrationReply();
		UserRegistration.getInstance().add(user);
		
		usrregreply.setName(user.getName());
		usrregreply.setAge(user.getAge());
		usrregreply.setRegistrationNumber(user.getRegistrationNumber());
		usrregreply.setRegistrationStatus("Successful");
		
		return usrregreply;
	}
	
}
