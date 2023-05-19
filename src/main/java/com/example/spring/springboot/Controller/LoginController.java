package com.example.spring.springboot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring.springboot.Entity.Register;
import com.example.spring.springboot.Entity.User;
import com.example.spring.springboot.Repo.UserRepo;
import com.example.spring.springboot.Service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("userName") String userName, @RequestParam("password") String password,
			Model model) {
		User u = null;
		try {
			u = userRepo.findByName(userName);
			
		} catch (Exception e) {
			System.out.println("User Not Found !!!");

		}
		if (u != null) {
			model.addAttribute("UserName", userName);
			return "homePage";
		}
		model.addAttribute("error", "user Not found, Reggister user!!");
		return "login";
	}
	

	@RequestMapping("/Register")
	public String createuser() {
		return "Register";
	}
	
	  @RequestMapping("/SaveReg") 
	  public String Registeroneuser(@ModelAttribute("register")Register register, ModelMap model) {
		  		userService.SaveUser(register);
	 
	  model.addAttribute("msg" , "User Details Saved."); 
	  return "login"; 
	  }
	 
}

