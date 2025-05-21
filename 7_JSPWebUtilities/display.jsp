<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display Session Value</title>
</head>
<body>
    <h2>Session Value Display</h2>
<%
    String name = (String) session.getAttribute("user");
    if (name == null) {
%>
        <p style="color:red;">Sorry, the session has ended or no session was started.</p>
<%
    } else {
%>
        <p style="color:green;">Hello <strong><%= name %></strong>, welcome back!</p>
<%
    }
%>
</body>
</html>
