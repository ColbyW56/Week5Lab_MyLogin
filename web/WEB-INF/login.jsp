<%-- 
    Document   : login
    Created on : Oct 9, 2022, 8:51:28 PM
    Author     : colby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="login" method="post">
            <h2>Username: <h2> <input type="text" name="username" value="${username}">
            <h2>Password: </h2> <input type="text" name="password" value="${password}">
            <input type="submit" value="Log in">
        </form>
        
        <p>${message}</p>
    </body>
</html>
