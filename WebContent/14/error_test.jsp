<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录异常提示界面</title>
</head>
<body>
登录失败<br/>
错误提示:<%
    	Object obj = request.getParameter("msg");
        if(null==obj) {
        	out.println("无");
        }else{
        	out.println(obj.toString());
        }
    %>
    <br/>
    用户名:<%=request.getParameter("userName") %><br/>
    密码:<%=request.getParameter("password") %><br/>
    <a href="<%=request.getContextPath() %>/14/login_test.jsp">重新登录</a>
</body>
</html>