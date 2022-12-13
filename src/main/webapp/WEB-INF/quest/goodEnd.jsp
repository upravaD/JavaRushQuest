<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.quest.model.Quest" %>
<html>
<head>
    <title>YOU WIN!!!</title>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>

<body>
    <div style="text-align: center;">
        <img src="https://cdn.javarush.com/images/article/cf1f70df-6b66-4622-b811-f42d0bbc5913/original.jpeg" height="350" alt="2">
        <h1><c:out value="<%=Quest.getInstance().getCurrentQuestion().getQuestion()%>"/></h1>
        <br>
        <form action="start" method="POST">
            <button onclick="window.location ='/start'" type="submit">RESTART</button>
        </form>
    </div>
</body>
</html>
