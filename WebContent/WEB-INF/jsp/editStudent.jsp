<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改学生信息</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="SSH">
</head>
<body>
                  编辑学生信息
    <form action="editStudent.action" method="get">
    ID:<input type="text" name="id" value="${student.id}" readonly="readonly"><br/>
        学生姓名:<input type="text" name="name" value="${student.name}"><br/>
    专业:<input type="text" name="price" value="${student.profession}"><br/>
    年龄:<input type="text" name="msg" value="${student.age}"><br/>
      性别:<input type="text" name="msg" value="${student.gender}"><br/>
    
    <input type="hidden" name="param" value="1"/>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
    </form>
</body>
</html>