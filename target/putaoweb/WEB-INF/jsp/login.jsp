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
	
	<script type="text/javascript" src="${ctx}/resources/js/md5.js"></script>
	<script type="text/javascript">
		function register(){
			$('#login').attr("action","${ctx}/register");
			$('#login').submit();
		}
	
		function doEncryptLogin(){
			var encryPsw = hex_md5($("#password").val());
			$("#encryPsw").val(encryPsw);
		}
		
		$(function(){
			$("#errMsg").hide();
			if ("${res}") {
				 $("#errMsg").show();
			}
		});	
	</script>
	
	<body>
		<form action="${ctx}/login" method="post" id="login" onsubmit="doEncryptLogin()">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td>
						<input type="password" type="password">
						<input type="encryPsw" name="password" type="hidden">
					</td>					
				</tr>		
				<tr>
					<td><button type="submit">登录</button></td>
					<td><button onclick="register()">注册</button></td>					
				</tr>
				<tr id="errMSg">
					<td colspan="2"><font color="red">${res.data}</font></td>
				</tr>		
			</table>
		</form>
	</body>
</html>