<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
String path = request.getContextPath(); 
%>

<body>
<form action="<%=path%>/User/login" method="post">
	用户名:<input type="text" name="userName" id="userName">
	密码:<input type="text" name="passWord" id="passWord">
	<input type="submit" value="登录">
	${error}
</form>

</body>
</html>