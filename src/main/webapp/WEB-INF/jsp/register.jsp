<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会員登録</title>
        <link rel="stylesheet" type="text/css" href="/css/body.css">
    </head>
    <body>
        <div class="title2">つだぞん.com</div>
        <div class="title3">会員登録</div>
        <br>
        全てご記入ください<br>
        <c:if test="${not empty errorMsg}">
            <p>
                ${errorMsg}</p>
            </c:if>

        <form action="/RegisterServlet" method="post">

            *名前*<input type="text" name="name" value="${name}"><br>
            *ID*<input type="text" name="Id" value="${Id}"><br>
            *Eメールアドレス*<input type="text" name="mail" value="${mail}"><br>
            *パスワード*<input type="password" name="pass" value="${pass}"><br>
            *電話番号*<input type="text" name="phone" value="${phone}"><br>
            *住所*<input type="text" name="address" value="${address}"><br>
            <input type="submit" value="会員登録">
        </form>
        <br>
        <div class="link"><a href="/WelcomeServlet">TOPへ</a></div>
    </body>
</html>