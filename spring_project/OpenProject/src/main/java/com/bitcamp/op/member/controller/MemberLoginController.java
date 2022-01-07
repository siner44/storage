package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.op.member.domain.MemberLoginRequest;

@Controller
@RequestMapping("/member/login")
public class MemberLoginController {
	
	@GetMapping
	public String getLoginForm() {
		return "member/loginform";
	}
	
	@PostMapping
	public void login(MemberLoginRequest loginRequest, HttpSession session, HttpServletResponse response) {
		// System.out.println(loginRequest);
		
		// service의 메소드는 view의 정보를 반환
		// 실패했을 때 view 
		
		// 성공했을 때 view : redirect
	}
}
