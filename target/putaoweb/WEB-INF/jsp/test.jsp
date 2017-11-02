<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/WEB-INF/jsp/common/taglibs.jsp" %>
<html>
<head>
		<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
		<%@ include file="/WEB-INF/jsp/common/resource.jspf"%>
		
<title>测试系统1</title>
</head>
<script type="text/javascript">
	setInterval('showtime("showtime")', 1000);
</script>
<body>	
	<span>${time}</span>	
	<span id="showtime"></span>
	<br>
	<span><c:out value="${data}"></c:out></span>
</body>
</html>