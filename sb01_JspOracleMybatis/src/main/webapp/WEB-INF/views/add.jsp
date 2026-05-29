<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix = "c" uri="jakarta.tags.core"%>
<%@ taglib prefix = "fmt" uri="jakarta.tags.fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
<link rel="icon" href="data:;base64,iVBORw0KGgo=">
<link rel="stylesheet" href="${pageContext.request.contextPath }/dist/css/main.css">
 <script type="text/javascript">
 	function sendOk() {
 		const f = document.memberForm;
 		
 		let str = f.name.value.trim();
 		if (!str) {
 			alert("이름을 입력하세요");
 			f.name.focus();
 			return;
 		}
 		str = f.tel.value.trim();
 		if(!str){
 			alert("번호를 입력하세요");
 			f.tel.focus();
 			return;
 			
 		}
 		f.action = "${pageContext.request.contextPath}/member/add"; // 컨트롤러 
 		f.submit();
 	}
 
 
 </script>
</head>
<body>


 <div>
 	<h1>회원 데이터 입력</h1>
 	<hr>
 </div>
 
<div>
	<form name="memberForm" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" class="txt">
				</td>				
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<input type="text" name="tel" class="txt">
				</td>				
			</tr>
			<tr>				
				<td colspan="2">
					<button type="button" class="btn" onclick="sendOk()"
					style="width: 300px; padding: 5px;">등록</button>
				</td>				
			</tr>						
			
		
		</table>
	
	</form>
</div>
</body>
</html>