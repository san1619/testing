<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <form action= "test" method="post">
      <%!int a = 10; %>
      <%=request.getAttribute("msg") %> <br/>
      UserName:<input type= "text" name="username" /> <br/>
      Password:<input type="password" name="password"/> <br/>
      <input type="submit" name= "submit">
      <input type="hidden" value=""/>
      
          </form>

</body>
</html>