<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Facebook Feed Data</title>
</head>
<body>
	<h3>
		Hello, <span> ${facebookProfile.name} Some User</span>!
	</h3>

	<h4>Here is your home feed:</h4>
	<div>
		<c:forEach var="post" items="${feed}">
			<b>${post.from.name} from</b> wrote:
			<p> ${post.message} message text</p>
			<img src="${post.picture}" style="width: 100px; height: 100px;" />
		</c:forEach>

		<hr />
	</div>
</body>
</html>