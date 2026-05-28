/* =========================
 	NoticeService.java
 	- Service 계층 구성
 	- 인터페이스 구성
=========================== */



package com.doit.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.doit.app.model.Notice;

public interface NoticeService {
	
	public void insertNotice(Notice dto) throws Exception;
	public void updateNotice(Notice dto) throws Exception;
	public void deleteNotice(long num) throws Exception;
	
	public int dataCount(Map<String, Object> map); // 페이징처리할떄!!, 검색타입필요!! 
	public List<Notice> listNoticeTop();
	public List<Notice> listNotice(Map<String, Object> map);
	
	public void updateHitCount(long num) throws Exception;
	public Notice findById(long num);
	public Notice findByPrev(Map<String, Object> map);
	public Notice findByNext(Map<String, Object> map);
	
	public List<Notice> listNoticeFile(long num);
	public Notice findByFileId(long fileNum);
	public void deleteNoticeFile(Map<String, Object> map) throws Exception;
	
	public ResponseEntity<?> downloadUploadFile(long fileNum) throws Exception;
	public boolean deleteUpdateFile(String fileName) throws Exception;
	
	/* ====================================================================================
	  ※  ResponseEntity<?> 
	     - HTTP 응답 전체를 직접 만들어서 반환하겠다는 의미
	      즉, downloadUploadFile() 메소드는 단순히 문자열이나 객체 하나를 반환하는 것이 아니라
	      HTTP 응답 구성 요소 전체를 반환할 수 있도록 구성한다는 것이다. 
	      (HTTP 상태 코드, HTTP 헤더, HTTP 본문 body)
	      
	     - ResponseEntity
	       Spring에서 제공하는 클래스. 
	       일반적인 컨트롤러의 메소드는 보통
	       return notice/list와 같은 형식으로 값을 반환하거나 
	       JSON 데이터를 return notice와 같은 형식으로 반환할 수 있다. 
	       하지만, 파일 다운로드처럼 응답을 세밀하게 제어해야 할 경우
	       ResponseEntity 객체를 사용한다. 
	       → 기본적인 사용 형식 및 구조
	       return ResponseEntity.ok()
	       				.headers(headers)
	       				.contentLength(resource.contentLenghth())
	       				.body(resource);
	     - 상태 코드 : OK (200)
	       헤더 : 다운로드 관련 헤더
	       본문 : 실제 파일 Resource
	       
	       
	     -  <?>
	       → 제네릭 와일드 카드 
	       → 타입을 특정하지 않음.★
	       
	==================================================================================== */
	
	

}
