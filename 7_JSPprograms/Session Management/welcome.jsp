/*Build a Session Management using JSP program set with one minute session expiry time to get
your name through text box and press submit to display the message by greeting Hello your name!.
Check the expiry of the session after one minute.*/

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome Page</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    if (name != null && !name.trim().isEmpty()) {
        session.setAttribute("user", name);
        session.setMaxInactiveInterval(60); // session expiry in 60 seconds
%>
        <h2>Welcome, <%= name %>!</h2>
        <p>Your name has been stored in a session object.</p>
        <p>Session will expire in <strong>1 minute</strong>.</p>
        <p><a href="display.jsp">Click here to display session value</a></p>
<%
    } else {
%>
        <h3 style="color:red;">Invalid name. Please go back and enter your name.</h3>
<%
    }
%>
</body>
</html>
