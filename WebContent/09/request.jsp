<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method = "post">
		<input type="text" name="userName"/>
		<input type ="submit" value ="submit"/>
	</form>
	<% request.setCharacterEncoding("UTF-8"); %>
	请求方法名<%= request.getMethod() %><br/>
	请求的资源<%= request.getRequestURI() %><br/>
	请求使用的协议<%= request.getProtocol() %><br/>
	请求的服务器IP<%= request.getServerName() %><br/>
	请求的端口号<%= request.getServerPort() %><br/>
	客户端的IP地址<%= request.getRemoteAddr()%><br/>
	客户端的主机地址<%= request.getRemoteHost()%><br/>
	客户端的用户名<%= request.getParameter("userName")%><br/>
</body>
</html>