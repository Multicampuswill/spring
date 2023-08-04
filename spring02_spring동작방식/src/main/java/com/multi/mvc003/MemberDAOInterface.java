package com.multi.mvc003;

public interface MemberDAOInterface {

	// row 1개 검색
	MemberDTO one(MemberDTO bag);

	int insert(MemberDTO dto);

	int update(MemberDTO dto);

	boolean login(MemberDTO dto) throws Exception;

}