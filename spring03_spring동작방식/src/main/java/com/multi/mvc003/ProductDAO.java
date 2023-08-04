package com.multi.mvc003;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	Connection con; 
	//DAO객체를 쓸 때는 무조건 jdbc1-2단계를 꼭 하는 것 같아요!
	public ProductDAO() throws Exception {
		// 1-2단계를 붙여보자!
		//객체 생성시 new ProductDAO()
		//클래스이름과 동일한 메서드는 자동호출됨.
		//객체생성시 자동호출되는 메서드라고 해서 생성자 (메서드)
		// 1.드라이버(커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.ok----------");

		// 2.DB연결(url, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.ok----------");
	}
	
	
	public ArrayList<ProductDTO> list() throws Exception {
		return null;
	}

	
	public ProductDTO one(String id) throws Exception {
		return null;
	}
}
