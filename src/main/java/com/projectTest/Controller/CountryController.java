package com.projectTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CountryController {

	@RequestMapping("/countries")
	public ModelAndView getCountries()
	{
		return new ModelAndView("countriespage","result","data");
	}
}
