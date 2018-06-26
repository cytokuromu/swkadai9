<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログインページ</title>
        <link rel="stylesheet" type="text/css" href="/AD170104/css/body.css">
    </head>
    <body>
        <div class="title2">つだぞん.com</div>
        <h1>ログインページ</h1>
    <c:if test="${not empty errorMsg}">
        <h4><font color="tomato">${errorMsg}</font></h4>
    </c:if>
    <form action="/LoginServlet" method="post">
        ID:<input type="text" name="Id"><br>
        パスワード:<input type="password" name="pass"><br>
        <input type="submit" value="ログイン">
    </form>
    <div class="link"><a href="/WelcomeServlet">TOPへ</a></div>
</body>
</html>