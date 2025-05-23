<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="b1" modelAttribute="b1Dto" method="post">
    Name: <form:input path="name" />
    <form:errors cssStyle="color: red" path="name" cssClass="error" />

    <br/>Email: <form:input path="email" />
    <form:errors cssStyle="color: red" path="email" cssClass="error" />

    <br/>Phone: <form:input path="phone" />
    <form:errors cssStyle="color: red" path="phone" cssClass="error" />

    <br/>Status: <form:checkbox path="status" />
    <form:errors cssStyle="color: red" path="status" cssClass="error" />

    <br/><input type="submit" value="Submit" />
</form:form>

</body>
</html>
