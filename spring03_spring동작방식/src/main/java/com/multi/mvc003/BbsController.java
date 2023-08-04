package com.multi.mvc003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//싱글톤 + 상속(Controller)
@Controller
public class BbsController {

	@Autowired
	BbsDAO dao; // di

// crud요청 기능 처리
	// 멤버변수 + 멤버메서드
	@RequestMapping("bbs_insert")
	public void insert(BbsDTO bag, Model model) {
		System.out.println("컨트롤러에서 받은 bag>>" + bag);
		int result = dao.insert(bag);
		String text = "게시물 등록에 실패하셨습니다.";
		if (result != 0) {
			text = "게시물 등록에 성공했습니다.";
		}
		model.addAttribute("text", text);
	}

	@RequestMapping("bbs_update")
	public void update(BbsDTO bag, Model model) {
		System.out.println("컨트롤러에서 받은 bag >>" + bag);
		int result = dao.update(bag);
		String text = "게시물 수정에 실패하셨습니다.";
		if (result == 1) {
			text = "게시물 수정에 성공하셨습니다.";
		}
		model.addAttribute("text", text);
		model.addAttribute("title", bag.getTitle());
		model.addAttribute("content", bag.getContent());
	}

	@RequestMapping("bbs_delete")
	public void delete(BbsDTO bag, Model model) {
		System.out.println("컨트롤러에서 받은 bag >>" + bag);
		int result = dao.delete(bag);
		String text = "삭제 실패 했습니다";
		if (result == 1) {
			text = "게시물 삭제 성공했습니다";
		}
		model.addAttribute("text", text);
	}

	@RequestMapping("bbs_one")
	public void one(BbsDTO bag, Model model) throws Exception {
		System.out.println(bag);
		BbsDTO bag2 = dao.one(bag);
		model.addAttribute("bag", bag2);

	}
}