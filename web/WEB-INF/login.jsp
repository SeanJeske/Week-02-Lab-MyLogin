<%-- 
    Document   : login
    Created on : Sep 19, 2017, 12:36:26 PM
    Author     : Sean Jeske
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
      
        <h1>Login</h1>
        <div>
            <form action="login" method="POST">
               Username: <input type="text" name="username" value= ${userName}>
               <br />
               Password: <input type="password" name="password"  value= ${password}>
               <br />
                <input type="submit" value="login">
            </form>
            
        </div>
        ${errorMessage}
    </body>
</html>