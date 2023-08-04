package com.multi.mvc004;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my; //100번 주소!
	
	public int insert(MemberDTO dto) {
		//JDBC4단계!!코딩해주었음.
		return my.insert("member.insert", dto);
	}
	public int update(MemberDTO dto) {
		return my.update("member.update", dto);
	}
	public MemberDTO one(String id) {
		return my.selectOne("member.one", id);
	}
	public List<MemberDTO> list() {
		return my.selectList("member.all");
	}
	
	
	
}
