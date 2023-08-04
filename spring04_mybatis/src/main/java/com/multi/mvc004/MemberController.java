package com.multi.mvc004;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;
	
	@GetMapping("insert")
	public void insert(MemberDTO dto) {
		int result = dao.insert(dto);
		System.out.println(result);
		System.out.println(dto);
	}
	
	@GetMapping("insert11")
	public void insert11(MemberDTO dto, Model model) {
		int result = dao.insert(dto);
		System.out.println(result);
		System.out.println(dto);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("update")
	public void update(MemberDTO dto, Model model) {
		int result = dao.update(dto);
		System.out.println(result);
		model.addAttribute("dto",dto);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		MemberDTO dto = dao.one(id);
		System.out.println(dto);
		model.addAttribute("dto",dto);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MemberDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	
	
}
