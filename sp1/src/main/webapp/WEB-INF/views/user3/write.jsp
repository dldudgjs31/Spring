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
<h3>입력란</h3>
<form action="${pageContext.request.contextPath}/user3/request" method="POST">
	<p> 이름 : <input type="text" name="name"> </p>
	<p> 과목 : <input type="text" name="subject"> </p>
	<p> 성적 : <input type="text" name="score"> </p>
	<p> <button type="submit">확인</button> </p>
</form>

</body>
</html>