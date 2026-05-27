/*===========================
 	MemberMapper.java
 	- 매퍼 인터페이스 구성
 ===========================*/


package com.doit.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.doit.app.domain.Member;

@Mapper
public interface MemberMapper {
	public void insertMember(Member dto) throws Exception;
	public List<Member> listMember() throws Exception;
	public int dataCount() throws Exception;
	

}
