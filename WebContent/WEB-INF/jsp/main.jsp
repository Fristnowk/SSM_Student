<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统主页</title>
</head>
<body>
    当前用户：${USER_SESSION.username}  
    <a href="${pageContext.request.contextPath }/logout">退出</a>  
    
    <h1 style="text-align:center">学生管理系统</h1>
	<form action="${pageContext.request.contextPath}/findStuByName.action" method="get">
	菜品名称:<input type="text"  name="name" id="name" placeholder="输入姓名">
	<input type="submit" value="搜索">
	</form>
	<table class="table table-bordered table-hover"  align="center">
		<thead>
			<tr bgcolor="#ff0">
				<th width="5%">编号</th>
				<th width="10%">姓名</th>
				<th width="10%">专业</th>
				<th width="25%">年龄</th>
				<th width="15%">性别</th>
				<th width="10%">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.profession}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td><a href="${pageContext.request.contextPath}/editStudent.action?param=0&id=${student.id}">编辑</a>
					<a href="${pageContext.request.contextPath}/delete.action?id=${student.id}">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/>
	<div align="center">
	<br/><br/>
	<p >添加学生</p>
	<form id="cform" action="addStudent.action" method="post">
		学生姓名:<input type="text" name="name">
		专业:<input type="text" name="profession">
		年龄:<input type="text" name="age">
		性别:<input type="text" name="gender">
		<span id="usernameInfo"></span>
		<input id="submit" type="submit" value="提交"> <input type="reset" value="重置">
	</form>
	</div>
</body>
</html>
