<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head><title>Connect to Facebook</title></head>
 <body>
  <h3>Connect to Facebook</h3>
  <form action="/connect/facebook" method="POST">
   <input type="hidden" name="scope" value="read_stream" />
   <div><p>You aren't connected to Facebook yet.</p></div>
   <p><button type="submit">Login With Facebook</button></p>
  </form>
 </body>
</html>