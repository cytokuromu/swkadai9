<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>つだぞんログイン</title>
        <link rel="stylesheet" type="text/css" href="/AD170104/css/body.css">
    </head>
    <body>
        <div class="title2">つだぞん.com</div>
        <p><c:out value="${Id}" />さん、つだぞん.comへようこそ</p>
        <div class="link">
            <a href="/AD170104/Main">商品を閲覧</a><br>
            <a href="/AD170104/WelcomeServlet">TOPへ</a>
        </div>
    </body>
</html>