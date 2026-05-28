/* ============================
 	NoticeMapper.java
 	매퍼 인터페이스
=============================== */


package com.doit.app.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.doit.app.model.Notice;


@Mapper
public interface NoticeMapper {

	public void insertNotice(Notice dto) throws SQLException;
	public void updateNotice(Notice dto) throws SQLException;
	public void deleteNotice(long num) throws SQLException;
	
	public int dataCount(Map<String, Object> map); // 페이징처리할떄!!, 검색타입필요!! 
	public List<Notice> listNoticeTop();
	public List<Notice> listNotice(Map<String, Object> map);
	
	public void updateHitCount(long num) throws SQLException;
	public Notice findById(long num);
	public Notice findByPrev(Map<String, Object> map);
	public Notice findByNext(Map<String, Object> map);
	
	public List<Notice> listNoticeFile(long num);
	public Notice findByFileId(long fileNum);
	public void deleteNoticeFile(Map<String, Object> map) throws SQLException;
	

	
}
