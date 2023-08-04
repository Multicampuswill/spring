package com.multi.mvc003;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	// row 1개 검색
		public MemberDTO one(MemberDTO bag) {
			ResultSet table = null;
			MemberDTO bag2 = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 드라이버 설정 성공"); // <---> System.in :기본입력장치로 키보드

				String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password); // Connection
				System.out.println("2. db연결 성공");

				String sql = "select * from member where id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, bag.getId());
				System.out.println("3. sql문 생성 성공");

				table = ps.executeQuery();
				System.out.println("4. sql문 전송 성공");
				//table에서 꺼내어 가방을 만들어 넣자.!!!
				//System.out.println("결과가 있는지 확인>>" + table.next());
				if(table.next()) {
					bag2 = new MemberDTO();
					bag2.setId(table.getString("id"));
					bag2.setPw(table.getString("pw"));
					bag2.setName(table.getString("name"));
					bag2.setTel(table.getString("tel"));
				}
				ps.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return bag2;
		}

		
	public int insert(MemberDTO dto)  {
		int result = my.insert("member.insert", dto);
		return result;
	}
	
	public int update(MemberDTO dto)  {
		int result = 0;
		try {
		// 1.드라이버(커넥터) 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.ok----------");

		// 2.DB연결(url, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.ok----------");

		// 3.SQL문 결정/생성
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTel());
		ps.setString(2, dto.getId());
		System.out.println("3.ok----------");

		// 4.DB로 SQL문 전송
		result = ps.executeUpdate();
		System.out.println("4.ok----------");
		}catch(Exception e) {
			System.out.println("에러가 발생함.");
		}
		return result;

	}
	
	public boolean login(MemberDTO dto) throws Exception {
		
		
		// 1.드라이버(커넥터) 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.ok----------");

		// 2.DB연결(url, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.ok----------");

		// 3.SQL문 결정/생성
		String sql = "select id from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		System.out.println("3.ok----------");

		// 4.DB로 SQL문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4.ok----------");
		boolean result = false;
		if(rs.next()) {
			result = true;
		}
		return result;
	}
	
}
