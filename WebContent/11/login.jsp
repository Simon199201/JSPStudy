<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录表单</title>
</head>
<body>
	<form action="do_login.jsp" method="post">
		username:<input type = "text" name="userName"/>
		password:<input type = "password" name="password"/>
		<input type = "submit" name="submit"/>
		<input type = "reset" name="reset "/>
	</form>
</body>
</html>