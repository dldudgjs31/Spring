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
<form action="${pageContext.request.contextPath}/anno5/request" method="post">
	<p>이름 : <input type="text" name="name"> </p>
	<p>
		과목 : 
		<select name="subject">
			<c:forEach var="s" items="${subjects}">
				<option value="${s}">${s}</option>
			</c:forEach>
		</select>
	</p>
	<p>나이 : <input type="text" name="age"> </p>
	<!-- type : submit 디폴트 -->
	<p><button type="submit">등록</button>  </p>
</form>
</body>
</html>