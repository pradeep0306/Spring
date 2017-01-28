package com.projectTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.projectTest.Model.Users;

@Controller
public class UsersController {

	@RequestMapping("/users")
	public ModelAndView getUsers()
	{
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "";
		Users user = restTemplate.getForObject(url, Users.class);
		return new ModelAndView("usersPage","result",user.getName());
	}
	
}
