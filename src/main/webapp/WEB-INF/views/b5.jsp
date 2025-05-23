<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<form:form modelAttribute="user" method="post">
    <p>Tên:</p>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>

    <p>Email:</p>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/>

    <p>Vai trò:</p>
    <form:select path="role">
        <form:option value="">-- Chọn vai trò --</form:option>
        <form:option value="admin">Admin</form:option>
        <form:option value="user">Người dùng</form:option>
    </form:select>
    <form:errors path="role" cssClass="error"/>

    <p>Mã Admin:</p>
    <form:input path="adminCode"/>
    <form:errors path="adminCode" cssClass="error"/>

    <input type="submit" value="Đăng ký"/>
</form:form>
