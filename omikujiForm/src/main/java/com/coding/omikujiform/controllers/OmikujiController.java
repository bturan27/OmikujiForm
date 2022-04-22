package com.coding.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//you go to this page.tower in for airplane.
@Controller
public class OmikujiController {
	
	// request map on the controller, they are GET METHOD!
	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp" ;

	}
	///this part you saved your information from form into session!!!!!
	@PostMapping("/omikuji/processing")
	public String processing(
			HttpSession session,
			@RequestParam(value="random") Integer random, 
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="living")String living ,
			@RequestParam(value="nice") String nice
			) {
		//it is like dictionary think about like that.LOOK AT THE AS DICTIONARY
		session.setAttribute("random", random );
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		return  "redirect:/omikuji/show";
	}
	/// sessionda always Objecte doner unutma begum!!!!! Sukanya told me evertyhing in same
	
	@RequestMapping("/omikuji/show")
	public String result(Model model, HttpSession session) {
	//you need to pull the info from session
		Integer random= (Integer)session.getAttribute("random");
		String city= (String)session.getAttribute("city");
		String person= (String) session.getAttribute("person");
		String hobby= (String)session.getAttribute("hobby");
		String living= (String)session.getAttribute("living");
		String nice= (String)session.getAttribute("nice");
	// you need to send the info to the jsp (jinja)
		model.addAttribute("random", random );
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("living", living);
		model.addAttribute("nice", nice);
		return "result.jsp" ;
	
	}
}
