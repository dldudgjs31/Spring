<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>redirect 예제 - 리다이렉트에서 파라미터 넘기기</h3>
	<p>page : ${page}</p>
	<p>col : ${col}</p>
	<p>
		<a href="${pageContext.request.contextPath}/redir/insert">확인</a>
	</p>
</body>
</html>