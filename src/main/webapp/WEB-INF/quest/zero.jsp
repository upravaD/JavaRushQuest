<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 08.12.2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.ZonedDateTime" %>
<%@ page import="com.quest.model.Question" %>
<%@ page import="com.quest.model.Quest" %>
<html>
<head>
    <title>JavaRush Quest</title>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<p>User name: <%=Quest.getInstance().getUserName()%></p>
<p>Time:      <%=ZonedDateTime.now()%></p>
<br>
<div style="text-align: center;">
    <h1><c:out value="<%=Question.ZERO.getQuestion()%>"/></h1>
    <h2><c:out value="<%=Question.CHOOSE.getQuestion()%>"/></h2>
    <br>
    <p>
        <label><input type="radio" name="choose"></label><c:out value="<%=Question.ONE.getQuestion()%>"/>
        <label><input type="radio" name="choose"></label><c:out value="<%=Question.DRUNK.getQuestion()%>"/>
    </p>
    <button onclick="window.location ='/quest'" type="submit">NEXT</button>
</div>
</body>
</html>
