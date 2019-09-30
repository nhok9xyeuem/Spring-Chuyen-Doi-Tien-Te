<%--
  Created by IntelliJ IDEA.
  User: nhok9xyeuem
  Date: 9/28/19
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="amount" method="post">
    <input type="number" placeholder="Amount" name="amount">

    <select name="input">
        <option  value="1">USD</option>
        <option  value="23000">VND</option>
    </select>
    <select name="output">
        <option value="1" >USD</option>
        <option value="23000">VND</option>
    </select>

</form>
</body>
</html>
