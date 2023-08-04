package com.multi.mvc003;

import org.springframework.stereotype.Repository;

//@@@@싱글톤 설정
@Repository
public class PayDAO {

	public int pay(int total) {
		return (int)(total * 0.9);
	}
}
