<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
  <div class="container">
  <h1>Register Account</h1>
  <form action="Register" method="post">
  <p> user name</p>
  <input type="text" placeholder="username" name="name" required>
  <p> Mail id </P>
   <input type="text" placeholder="usermail" name="email" required>
   <p> password </P>
   <input type="password" placeholder="password" name="password" required>
   <input type="submit" value="register">
   <a href="index.jsp">Already have account</a>
  </form>
  </div>
</body>
</html>