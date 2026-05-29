<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix = "c" uri="jakarta.tags.core"%>
<%@ taglib prefix = "fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<link rel="icon" href="data:;base64,iVBORw0KGgo=">
<link rel ="stylesheet" type="text/css" href="${pageContext.request.contextPath }/dist/css/main.css">
<style type="text/css">
	 td { text-align: center;}
</style>


<%-- ※ ${pageContext.request.contextPath }
		  pageContext
			-JSP 내장 객체 중 하나로, 현재 JSP 페이지의 모든 정보를 담고 있는 객체
		  request
		    -HTTP 요청 정보를 담고 있는 객체
		  contextPath
		    -서버에서 이 웹 어플리케이션을 구분하기 위한 식별 경로 → Root Path
		    -내 프로젝트 이름이 sb01이라면 
		     이 코드는 실행 시 브라우저에서 /sb01이라는 문자열로 치환된다.
		     루트 경로일 경우 빈 문자열이 된다.
		     
		    -상황1. 내 컴퓨터에서 작업할 때
		       주소 : http://localhost:3306/list
		       경로 : /dist/css/main.css → 정상 작동 → 루트 바로 아래에 있기 때문에
		       
		    -상황2. 실제 서버에 올릴 때 → 운영 환경
		      실무에서는 서버 한 대에 여러 프로젝트를 올리기 때문에
		      사용하게 되는 주소가 『http://www.doit.com/sb01/list』가 될 수 있다.
		      이때, 경로를 /dist/... 라고만 적으면
		      브라우저는 http://www.doit.com/dist/...에서 파일을 찾으려고 하기 때문에
		      에러 발생하게 된다. → 404 에러 → css 깨짐   
		      (실제 파일은 http://www.doit.com/sb01/dist/,,에 존재하는 상황 )
		      
		      
		      ==> <%@ taglib prefix = "c" uri="jakarta.tags.core"%>이 있는상태
		      
		      		<c: set var="path" value="${pageContext.request.contextPath}"/>
		      		<link rel="stylesheet" href="${path}/dist/css/main.css">
  --%>	

</head>
<body>


<div>
	<h1>회원 리스트</h1>
	<br>
</div>

<div>
	<span>전체 회원 수 : ${dataCount} 명</span>
	<button type="button" class="btn" onclick="location.href='${pageContext.request.contextPath}/member/add'">회원 등록</button>
	<br><br>
	
	<table class="table table-border table-list">
		<thead>
			<tr>
				<th class="num">번호</th>
				<th class="name">이름</th>
				<th class="tel">전화번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${memberList}">
				<tr>
					<td>${dto.num}</td>
					<td>${dto.name}</td>
					<td>${dto.tel}</td>
				
				</tr>
						
			</c:forEach>
			<!-- <tr>
				<td>1</td>
				<td>안진모</td>
				<td>010-1212-3434</td>
			</tr>
			<tr>
				<td>2</td>
				<td>양호열</td>
				<td>010-5656-7878</td>
			</tr>
			
			<tr>
				<td>3</td>
				<td>유현선</td>
				<td>010-1111-2222</td>
			</tr>						 -->
		</tbody>
	
	</table>
</div>

</body>
</html>