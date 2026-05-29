/* ==============
 	Member.java
 	- DTO 구성 
============== */
package com.doit.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Member {
	
	// 주요 속성 구성 
	private int num;
	private String name, tel;
	
	

}
