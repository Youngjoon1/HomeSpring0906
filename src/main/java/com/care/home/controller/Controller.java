package com.care.home.controller;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.home.dto.MDto;
import com.care.home.service.MService;


@org.springframework.stereotype.Controller
public class Controller {
	MService ser;
	public Controller() {
		ser = new MService();
	}
	
	@GetMapping("loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@GetMapping("joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	
	@PostMapping("join")
	public String join(MDto dto) {
		ser.memberJoin(dto);
		return "redirect:loginForm";
	}
	
	@GetMapping("member_list")
	public String member_list(Model model) {
		model.addAttribute("list",ser.list());
		return "member/member_list";
	}
	
	@GetMapping("info")
	public String info(@RequestParam String id,Model model) {
		model.addAttribute("user",ser.user(id));
		return "member/info";
	}
	
	@PostMapping("loginCK")
	public String loginCK(@RequestParam String id,@RequestParam String pwd,Model model) {
		System.out.println(ser.loginCK(id, pwd));
		model.addAttribute("result",ser.loginCK(id, pwd));
		
		return "member/loginCK";
	}
	
	
}
