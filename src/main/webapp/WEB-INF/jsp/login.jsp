<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp" %>
<html>
	<head>
		<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
		<%@ include file="/WEB-INF/jsp/common/resource.jspf"%>			
		<title>测试系统</title>
	</head>
	<body>
		<form action="${ctx}/login" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password"></td>
				</tr>		
				<tr>
					<td colspan="2"><button type="submit">登录</button></td>
				</tr>		
			</table>
		</form>
	</body>
</html>