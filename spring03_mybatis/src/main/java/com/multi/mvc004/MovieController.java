package com.multi.mvc004;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //싱글톤 + 컨트롤러로 스프링 등록 
public class MovieController {

	//요청하나당 함수하나!!!
	@RequestMapping("movie")
	public String movie(String movie) {
	//public void movie(@RequestParam("movie") String item) {
		System.out.println(movie);
		//처리
		// 주소 랜더링: 결과담을 뷰를 해결해준다.
		//              뷰해결사(view resolver)
		// /WEB-INF/views/파일명.jsp
		String fileName = "redirect:movie.jsp";
		if(movie.equals("action")) {
			fileName = "action";
		}else if (movie.equals("drama")) {
			fileName = "drama";
		}else if (movie.equals("comic")) {
			fileName = "comic";
		}
		//결과를 담아줄 views아래로 넘어갑니다.!!
		//내가 흐름을 변경하지 않는 한!!!
		//요청한 movie이름을 가진 movie.jsp를 찾음.
		return fileName;
	}
}
