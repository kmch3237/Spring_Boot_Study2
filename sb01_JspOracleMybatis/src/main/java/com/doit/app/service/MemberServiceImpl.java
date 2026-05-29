/* ======================================================
 	MemberServiceImpl.java
 	Service 계층의 구현 클래스
 	→ MemberMapper를 이용해서 DB 작업을 호출하고,
 	   Controller 와 Mapper 사이에서 비즈니스 로직 수행.
====================================================== */


package com.doit.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doit.app.domain.Member;
import com.doit.app.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;
// 롬복(lombok)의 @RequiredArgsConstructor를 사용하기 위한 import
// → final 필드를 매개변수로 받는 생성자 자동 생성.

import lombok.extern.slf4j.Slf4j;
// 롬복의 @SLf4j를 사용하기 위한 import.
// SLF4J는 Simple Logging Facade for Java의 약자
// → 로그를 출력할 수 있는 log 객체를 자동 생성.

@Service
@RequiredArgsConstructor
@Slf4j // 로그처리
public class MemberServiceImpl implements MemberService{

	// private Membermapper mapper; = setter injection
	// private final MemberMapper mapper; 생성자 injection 더 안정적!!! 그래서 final을 써야 좋음
	private final MemberMapper mapper;

	@Override
	public void insertMember(Member dto) throws Exception {
		
		try {
			mapper.insertMember(dto);
			
		} catch (Exception e) {
			log.info("insertMember : " , e);
			
			//log.error(); > 실무에서 많이 씀
			// throw e;
		}
		
	}

	@Override
	public List<Member> listMember() throws Exception {
		
		List<Member> list = null;
		
		try {
			list = mapper.listMember();
			
		} catch (Exception e) {
			log.info("listMember : " , e);
		}
		
		return list;
		
	}

	@Override
	public int dataCount() throws Exception {
		
		int result = 0;
		
		try {
			result = mapper.dataCount();
		} catch (Exception e) {
			log.info("dataCount : " , e);
		}
		
		return result;
		
	}
	
	
	
}
