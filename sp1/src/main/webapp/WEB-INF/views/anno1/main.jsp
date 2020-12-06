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
<p><a href="${pageContext.request.contextPath}/anno1/request1?age=17">요청1</a> </p>
<p><a href="${pageContext.request.contextPath}/anno1/request1?age=18&g=M">요청1-1</a> </p>

<p><a href="${pageContext.request.contextPath}/anno1/request2?age=17">요청2</a> </p>
<p><a href="${pageContext.request.contextPath}/anno1/request2?age=18&g=M">요청2-2</a> </p>

<p><a href="${pageContext.request.contextPath}/anno1/request3?age=17">요청3</a> </p>
<p><a href="${pageContext.request.contextPath}/anno1/request3?age=18&g=M">요청3-3</a> </p>
</body>
</html>