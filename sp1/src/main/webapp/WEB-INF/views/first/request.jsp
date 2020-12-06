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
	<h3>간단한 계산기</h3>
	<form action="${pageContext.request.contextPath}/first/calc"
		method="post">
		<p>
			<input type="text" name="num1">
		</p>
		<p>
			<select name="oper">
				<option value="+">더하기</option>
				<option value="-">빼기</option>
				<option value="/">나누기</option>
				<option value="*">곱하기</option>
			</select>
		</p>
		<p>
			<input type="text" name="num2">
		</p>
		<p>
			<button type="submit">결과</button>
		</p>
	</form>
</body>
</html>