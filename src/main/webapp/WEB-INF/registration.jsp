<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 07.12.2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaRush Quest</title>
</head>
<body>

<div style="text-align: center;">
    <img src="https://cdn-images-1.medium.com/max/1200/1*mfiMqDO0luxpPLO_ZMnnFg.png" height="100" alt="2">
    <h1>REGISTRATION</h1>
    <p><b>What is your name?:</b><br></p>
    <br>
    <form action="reg" method="POST">
        <label>
            <input type="text" name="name" size="40">
        </label>
        <button onclick="window.location='/quest'" type="submit">Submit</button>
    </form>
</div>

</body>
</html>
