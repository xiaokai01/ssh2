<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/userAction_add" method="post">
		用户名：<input type="text" name="username" /> <br/> 
		密&nbsp&nbsp&nbsp码：<input type="password" name="password" /> <br/> 
		<input type="submit" value="添加" />
	</form>
	<a href="${pageContext.request.contextPath}/userAction_add">delete</a>
</body>
</html>