<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.quest.model.Question" %>
<%@ page import="com.quest.model.Quest" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<html>
<head>
    <title>JavaRush Quest</title>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<div style="text-align: end;">
    <p>SessionID: <%=request.getRequestedSessionId()%></p>
    <p>User name: <%=request.getSession().getAttribute("name")%></p>
    <p>Date:      <%=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy" + "г"))%></p>
    <p>Time:      <%=LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))%></p>
    <p>Address:   <%=request.getLocalName()%></p>
    <p>Port:      <%=request.getLocalPort()%></p>
    <br>
</div>

<div style="text-align: center;">
    <h1><c:out value="<%=Quest.getInstance().getStartQuestion().getQuestion()%>"/></h1>
    <h2><c:out value="<%=Question.CHOOSE.getQuestion()%>"/></h2>
    <br>
    <form action="quest" method="POST">
        <label><input type="radio" name="choose" value="<%=Quest.getInstance().getCurrentQuestion()%>"></label><%=Quest.getInstance().getCurrentQuestion().getQuestion()%>
        <label><input type="radio" name="choose" value="<%=Question.DRUNK%>"></label><%=Question.DRUNK.getQuestion()%>
        <br>
        <h2><button onclick="window.location ='/quest'" type="submit">NEXT</button></h2>
    </form>
</div>

</body>
</html>
