<%--
  Created by IntelliJ IDEA.
  User: Win10
  Date: 5/7/2019
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Example</title>
  </head>
  <body>
  <h1>JAX-RS @BeanParam Example</h1>

  <form action="msg/jackson?count=10" method="post">
    <label for="name">Name: </label>
    <input id="name" type="text" name="name" />
    <input type="submit" value="Submit" />
  </form>

  </body>
</html>