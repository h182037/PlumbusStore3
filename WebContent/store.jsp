<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>
		<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="store">
		<c:forEach items="${products}" var="product">
        <img src="images/${product.getImageFile()}">
        <p>${product.localDescriptionText(locale)} </p>	
		</c:forEach>
		
	</fmt:bundle>
	

</body>
</html>