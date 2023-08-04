package com.multi.mvc003;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //싱글톤 + 컨트롤러 등록
public class ProductController {

	@Autowired
	ProductDAO dao; //di
	
	
	@RequestMapping("list3")
	public void list(Model model) throws Exception {
		ArrayList<ProductDTO> list = dao.list();
		model.addAttribute("list", list);
		//list ==> [bag, bag, bag, bag, bag]
	}
	
	//요청하나당 함수하나 정의해주세요.
	@RequestMapping("one3")
	public void one(String id, 
					Model model 
			) throws Exception {
		System.out.println("컨트롤러에서 받은 " + id);
		ProductDTO bag = dao.one(id); //orm
		//처리 결과를 넣어줄 views에 bag에 있는 내용을 전달하자.
		model.addAttribute("bag", bag);
//		modelAndView.addObject(attributeName, attributeValue)
//		modelAndView.setViewName(viewName);
	}
}
