<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>

<body>
		<p><jsp:include page="chooseLanguage.jsp" /></p>
	
	<fmt:bundle basename="no.hib.dat152.Messages">
		<h3>
			<fmt:message key="home" />
		</h3>
		<img src="Images/the_plumbus_1.jpg" style="width:129px;height:128px;"> <br>
		<p>
			<fmt:message key="message1" />
			<a href="Store"> <fmt:message key="store"/> </a>
		</p>
	</fmt:bundle>

</body>
</html>
