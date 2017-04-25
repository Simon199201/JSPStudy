<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page buffer="10kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("simon");
	out.println("wang");
	out.newLine();
	out.println("<br/>");
	out.flush();//强制输出
	//out.clear();
	//out.clearBuffer();//清空buffer
	out.println("获取当前缓冲区大小："+out.getBufferSize());
	out.println("<br/>");
	out.println("获取剩余缓冲区大小："+out.getRemaining());
	 %>
</body>
</html>