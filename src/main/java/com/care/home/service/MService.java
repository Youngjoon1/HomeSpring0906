package com.care.home.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.care.home.dao.MDao;
import com.care.home.dto.MDto;

@Service
public class MService {
	MDao dao;
	public MService() {
		dao = new MDao();
	}
	
	public MDto memberJoin(MDto DTO) {
		return dao.memberJoin(DTO);
	}
	
	public ArrayList<MDto> list () {
		return dao.memberlist();
	}
	
	public MDto user(String id) {
		return dao.memberInfo(id);
	}
	
	public int loginCK(String id,String pwd) {
		return dao.loginCK(id, pwd);
	}
	
}
