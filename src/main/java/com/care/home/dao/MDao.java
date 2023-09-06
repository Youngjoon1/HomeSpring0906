package com.care.home.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.home.dto.MDto;

@Repository
public class MDao {
	ArrayList<MDto> DB;
	public MDao() {
		DB = new ArrayList<MDto>();
	}
	
	public MDto memberJoin(MDto dto) {
		DB.add(dto);
		return dto;
	}
	
	public ArrayList<MDto> memberlist() {
		return DB;
	}
	
	public MDto memberInfo(String id) {
		MDto dto = new MDto();
		for(int i=0; i< DB.size(); i++) {
			if(DB.get(i).getId().equals(id)) {
				dto = DB.get(i);
				break;
			}
		}
		return dto;
	}
	
	public int loginCK(String id,String pwd) {
		int result = 0;
		for(int i=0; i< DB.size(); i++) {
			if(DB.get(i).getId().equals(id) && DB.get(i).getPwd().equals(pwd)) {
				result = 1;
				break;
			}else {
				result = 0;
			}
		}
		return result;
	}
	
}
