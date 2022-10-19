<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body background="${pageContext.request.contextPath}/images/background.jpg">
    ${msg}
    
    <div align="center" >
    <font style="font-size:22px" face="宋体">欢迎使用学生管理系统</font>
    <hr size="5px" color="grey">
	<form action="${pageContext.request.contextPath }/login" 
            method="POST">
		用户名：<input type="text" name="username"/><p />
		密&nbsp;&nbsp;&nbsp;码：
                 <input type="password" name="password"/><p />
		<input type="submit" value="登录" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" />
	</form>
	</div>
</body>
</html>
