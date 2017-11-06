<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/WEB-INF/jsp/common/taglibs.jsp" %>
<html>
		<head>
				<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
				<%@ include file="/WEB-INF/jsp/common/resource.jspf"%>
				<style type="text/css">
					.td{width: 80px;}
				</style>				
		<title>测试系统</title>
		</head>

		<body>	
			<table border="1">
				<c:forEach items="${list}" var="item" varStatus="status">
					<tr>
						<td class="td">${status.count}</td>
						<c:forEach items="${item}" var="it">
						<td class="td">
						<c:choose>
							<c:when test="${fn:startsWith(it,'a')}">
							<font color="red"><c:out value="${it}"/></font>	
							</c:when>
							<c:when test="${fn:startsWith(it,'c')}">
							<font color="blue"><c:out value="${it}"/></font>	
							</c:when>							
							<c:otherwise>
							<font color="green"><c:out value="${it}"/></font>	
							</c:otherwise>			
						</c:choose>	
						</td>
						</c:forEach>				
					</tr>			
				</c:forEach>		
			</table>
		</body>
</html>