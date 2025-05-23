<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: enlov
  Date: 5/23/2025
  Time: 8:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="b2" modelAttribute="user" method="post">
    Name: <form:input path="name" />
    <form:errors cssStyle="color: red" path="name" cssClass="error" />

    <br/>Email: <form:input path="email" />
    <form:errors cssStyle="color: red" path="email" cssClass="error" />

    <br/>Password: <form:input path="password" />
    <form:errors cssStyle="color: red" path="password" cssClass="error" />

    <br/><input type="submit" value="Submit" />
</form:form>

</body>
</html>
