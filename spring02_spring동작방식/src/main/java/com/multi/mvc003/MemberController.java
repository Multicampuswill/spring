package com.multi.mvc003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//상속(Controller) + 싱글톤 
@Controller
public class MemberController {
	//crud요청 기능 처리
	
	@Autowired //램에 어디있는지 자동으로 주소를 찾아서 
					//	(이 클래스로 만들어진 객체를 찾아)
					// 아래변수인 dao에 넣어주세요.!! 
					// MemberDAO m = new MemberDAO();
					//@Inject (객체의 이름을 가지고 찾음.)
					//MemberDAO dao = new MemberDAO();
	//Dependency Injection(DI) : 부품이 있는 ram의 주소를 자동으로 찾아서 변수에 주입 
	MemberDAO dao; //램에 이미 만들어져서 들어가 있어요. //100번 주소!
	
	//스프링 프로젝트는 전체 프로젝트의 제어를 프로그래머가 아니라 스프링 프레임워크가 하고 있음.
	//제어가 역전/역행(Inversion of Control, IoC)
	
	//멤버변수 + 멤버메서드 
	@RequestMapping("insert")
	public void insert(MemberDTO bag) { //프로토타입!
		System.out.println(dao);
		System.out.println("컨트롤러에서 받은 bag>> " + bag);
		dao.insert(bag);
	}
	
	
	@RequestMapping("login")
	public String login(MemberDTO bag, 
						Model model
			) throws Exception {
		System.out.println(dao);
		System.out.println("컨트롤러에서 받은 데이터>> " + bag);
		boolean result = dao.login(bag);
		String text = "로그인 실패";
		//views로 가지않고 webapp로 다시 가고 싶은 경우
		//방향을 다시 돌려서 가야함. redicrect!
		String page = "redirect:login.jsp";
		if(result) {
			text = "로그인 성공";
			page = "yes";
		}
		//views/아래까지만 값을 전달하고 die!
		model.addAttribute("text", text);
		return page;
	}
	
	@RequestMapping("one")
	public void one(MemberDTO bag, 
					Model model) {
		System.out.println(dao);
		System.out.println(bag);
		MemberDTO bag2 = dao.one(bag);
		//Views/one.jsp까지 bag2의 값을 전달하세요.!
		//model.addAttribute(이름, 값);
		model.addAttribute("bag", bag2);
	}
	
	@RequestMapping("update")
	public void update(	MemberDTO bag,  
						Model model) {
		System.out.println(dao);
		//벽돌 --> 벽돌틀 벽돌1 = new 벽돌틀(); //프로토타입 
		//지역변수
		System.out.println(bag);
		int result = dao.update(bag);
		String text = "업데이트 실패";
		if(result == 1) {
			text = "업데이트 성공";
		}
		model.addAttribute("text", text);
		model.addAttribute("tel", bag.getTel());
	}
	
	@RequestMapping("delete")
	public void delete() {
		
	}
	
	
}
