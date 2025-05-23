<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Đánh giá sản phẩm</title>
</head>
<body>
<div>
  <h2>Đánh giá sản phẩm</h2>

  <% if (request.getAttribute("successMessage") != null) { %>
  <span><%= request.getAttribute("successMessage") %></span>
  <% } %>

  <form:form modelAttribute="reviewDTO" action="/review" method="post">
    <!-- Tên -->
    <div>
      <label for="name">Tên</label>
      <form:input path="name" id="name"/>
      <form:errors path="name"/>
    </div>

    <!-- Email -->
    <div>
      <label for="email">Email</label>
      <form:input path="email" id="email"/>
      <form:errors path="email"/>
    </div>

    <!-- Đánh giá -->
    <div>
      <label for="rating">Đánh giá (1-5 sao)</label>
      <form:input path="rating" id="rating" type="number"/>
      <form:errors path="rating"/>
    </div>

    <!-- Bình luận -->
    <div>
      <label for="comment">Bình luận</label>
      <form:textarea path="comment" id="comment"/>
      <form:errors path="comment"/>
    </div>

    <button type="submit">Gửi đánh giá</button>
  </form:form>
</div>
</body>
</html>