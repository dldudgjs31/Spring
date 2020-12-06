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
<h3>${dto.userName}님의 블로그</h3>
<p> 블로그 주제 : ${dto.subject}</p>
<p> 블로그 이름 : ${dto.blogName}</p>
<p> <a href="${pageContext.request.contextPath}/blog/main">돌아가기</a> </p>

</body>
</html>