package com.multi.mvc003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Movie2Controller {

	//@@@@@DAO를 DI하세요.
	@Autowired
	PayDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model) {
		//컨트롤러에서 받은 값들을 프린트 
		System.out.println(title + ", " + price);
		//관람료가 10000원이상이면 pay.jsp로 감!
		//관람료가 10000원 이상이 아니면 webapp/movie2.jsp로 감.
		//title, price에 5000원 더 한 값을 model의 속성으로 지정 
		String page = "redirect:movie2.jsp";
		if(price >= 10000) {
			page = "pay";
		}
		model.addAttribute("title", title);
		model.addAttribute("price", price + 5000);
		return page; //프론트컨트롤러에게 views아래 파일명을 리턴
	}
	
	@RequestMapping("pay2.do")
	public void pay(int total, Model model) {
		System.out.println(total);
		int result = dao.pay(total);
		model.addAttribute("result", result);
		//views/pay.jsp를 호출하여 최종 계산 금액 출력 
	}
}
