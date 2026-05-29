/*===============================
 	Notice.java
 	- 모델 객체 구성
================================ */

package com.doit.app.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Notice {
	
	// 테이블명 : NOTICE
	private long num;
	private int notice, hitCount; // notice = 공지사항 등록 여부 (0,1) 확정성때문 check!
	private String name, subject, content;
	private String regDate;
	
	
	// 테이블명 : NOTICEFILE
	private List<MultipartFile> selectFile;
	
	private long fileNum, fileSize;
	private String saveFilename, originalFilename;
	private int fileCount;
	
	
	private long gap;

}
