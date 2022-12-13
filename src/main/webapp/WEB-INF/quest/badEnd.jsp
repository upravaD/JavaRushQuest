<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.quest.model.Quest" %>
<html>
<head>
    <title>YOU LOSE!!!</title>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>

<body>
    <div style="text-align: center;">
        <img src="https://images.kinorium.com/movie/shot/127171/w1500_49030662.jpg" height="350" alt="2">
        <h1><c:out value="<%=Quest.getInstance().getStartQuestion().getQuestion()%>"/></h1>
        <h1><c:out value="<%=Quest.getInstance().getCurrentQuestion().getQuestion()%>"/></h1>
        <br>
        <form action="start" method="POST">
            <button onclick="window.location ='/start'" type="submit">RESTART</button>
        </form>
    </div>
</body>
</html>
