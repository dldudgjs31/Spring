<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>어노테이션 예제</h3>
<form action="${pageContext.request.contextPath}/anno2/request" method="post">
	<p> 이름 : <input type="text" name="name"> </p>
	<p> 출신도: <input type="text" name="city"> </p>
	<p> 취미 : 
		<input type="checkbox" name="hobby" value="게임">게임 
		<input type="checkbox" name="hobby" value="영화">영화 
		<input type="checkbox" name="hobby" value="노래">노래 
		<input type="checkbox" name="hobby" value="춤">춤 
		<input type="checkbox" name="hobby" value="여행">여행 
	</p>
	<p> <button type="submit">확인</button> </p>

</form>

</body>
</html>