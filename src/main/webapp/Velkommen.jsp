<%--
  Created by IntelliJ IDEA.
  User: Marks
  Date: 01-03-2020
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Velkommen du er nu logget ind</h1>

Du er logget ind med navnet : ${requestScope.minAtribut}

<br>
<br>

Her kommer en liste af de hårde drenge :

<br>

<c:forEach var="element" items="${requestScope.rockerListe}">

    ${element}
    <br>

</c:forEach>

<br>
<br>
<br>

Så skal vi have lys i lagkagen :

<br>
<br>

<c:forEach var="element" items="${requestScope.mapRockere}">

    ${element.key} skal have ${element.value} lys i lagkagen!!
    <br>

</c:forEach>

<br>
<br>

her kommer der lige et set med rockere :
<br>

<c:forEach var="element" items="${requestScope.setRockere}">

    ${element}
    <br>

</c:forEach>

</body>
</html>
