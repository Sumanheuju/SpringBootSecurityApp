<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Boot</title>
</head>
<body>
	<h1>Products Page with JSP !!</h1>
	
	<form action="${pageContext.request.contextPath}/admin/products" method="post">
		Product Name: <input type="text" name="name"/>
		Product Price: <input type="text" name="price"/>
		Product Description: <input type="text" name="description"/>
		Product Manufacturer: <input type="text" name="manufacturer"/>
		
		<button type="submit"> Save</button>
	</form>

</body>
</html>