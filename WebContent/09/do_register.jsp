<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理录入信息</title>
</head>
<body>
	<%	String skills = "";
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
	    String[] skillArr= request.getParameterValues("skills");
	    if(skillArr!=null && skillArr.length>0){
	    	for(String s:skillArr){
	    		skills+=s;
	    	}
	    	
	    }
	    request.setAttribute("userName", userName);
	    request.setAttribute("skills", skills);
	    out.println(userName);
	    out.println(skills);
	%>
	
</body>
<jsp:forward page="welcome.jsp"></jsp:forward></html>