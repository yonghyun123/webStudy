package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.connect.mvcexam.dto.User;

@Controller
public class UserController {

	@RequestMapping(path="/userform", method=RequestMethod.GET)
	public String userForm(){
		return "userform";
	}
	
	@RequestMapping(path="/regist", method=RequestMethod.POST)
	public String regist(@ModelAttribute User user){
		
		System.out.println("사용자가 입력한 user 정보입니다.");
		System.out.println(user);
		
		return "regist";
	}
}
