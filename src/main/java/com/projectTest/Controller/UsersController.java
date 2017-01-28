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
		String url = "https://jsonplaceholder.typicode.com/users";
		Users[] user = restTemplate.getForObject(url, Users[].class);
		//String user=restTemplate.getForObject(url, String.class);
		//for(Users record:user)
		//{
		//	record.getName();
		//}
		
		return new ModelAndView("usersPage","result",user[2].getEmail());
	}
	
}
