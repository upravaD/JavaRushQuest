<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.quest.model.Question" %>

<!DOCTYPE html>
<html>

<head>
    <title>JavaRush Quest</title>
    <link href="WEB-INF/static/main.css" rel="stylesheet">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>

<body>

<div style="text-align: center;">
    <img src="https://javarush.com/assets/images/site/lectures/covers/level-11.gif" height="350" alt="2">
    <h1>
        <c:out value="<%=Question.WELCOME.getQuestion()%>"/>
    </h1>
    <br>
    <button onclick="window.location='/reg'">Start</button>

</div>

</body>

</html>
