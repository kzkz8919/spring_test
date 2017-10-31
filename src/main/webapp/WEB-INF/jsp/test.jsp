<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>测试系统</title>
</head>
<script type="text/javascript" 
		src="${pageContext.request.contextPath}/resources/js/common.js"></script>
<script type="text/javascript">
	setInterval('showtime("showtime")', 1000);
</script>
<script type="text/javascript" 
		src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.min.js"></script>
<body>
	<span>Hello world!</span>
	<span id="showtime"></span>
</body>
</html>