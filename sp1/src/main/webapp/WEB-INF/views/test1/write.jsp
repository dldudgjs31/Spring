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

	<form action="${pageContext.request.contextPath}/test1/request" method="POST">
		<p>
			이름 : <input type="text" name="name">
		</p>
		<p>
			나이 : <input type="text" name="age">
		</p>
		<p>
			<button type="submit">등록</button>
		</p>
	</form>
</body>
</html>