package com.javaex.dao;

import java.util.List;

import com.javaex.vo.EmaillistVo;

public class DaoTest {
	public static void main(String[] args) {
		EmaillistVo vo = new EmaillistVo(1, "À¯", "Àç¼®", "youjs@naver.com");
		EmaillistDao dao = new EmaillistDao();
		//dao.insert(vo);
		
		List<EmaillistVo> emailList = dao.getList();
		for(int i =0; i < emailList.size(); i++) {
			System.out.println(emailList.get(i).toString());
		}
		
	}
}
