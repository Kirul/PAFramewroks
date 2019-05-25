package com.kirul.badde.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kirul.badde.beans.User;
import com.kirul.badde.beans.UserRegistration;

@Controller
public class UserRetrieverController {

	@RequestMapping (method = RequestMethod.GET, value="/users/allusers")
	
	@ResponseBody
	public List<User> getAllUsers(){
		return UserRegistration.getInstance().getUserRecords();
		
	}
}
