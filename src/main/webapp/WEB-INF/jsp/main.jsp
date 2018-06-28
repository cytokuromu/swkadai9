<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>つだぞん.com</title>
        <link rel="stylesheet" type="text/css" href="/AD170104/css/body.css">
    </head>
    <body>
        <div class="title">つだぞん.com</div>  
        <c:if test="${result!=true}">
            <div class="link3">
                <a href="/LoginServlet">ログインする</a> &nbsp; &nbsp; <a href="/RegisterServlet">会員登録する</a><br>
            </div>
        </c:if>
        
        <p><h1>${month}月のおすすめは　${goods}　です</h1></p>
<!--  
        <c:if test="${not empty cartList}">
            <p>
                カートの中身<br>
                <c:forEach var="cart" items="${cartList}">
                    <c:out value="${cart.productname}" /><br>
                </c:forEach>
                合計金額：<c:out value="${total}" /><br><br>

                <a href="/BuyServlet">購入する</a>
            </p>
        </c:if>
        <c:forEach var="product" items="${productList}">
            <p><h3>[ <c:out value="${product.productname}" /> ]</h3>
            <img border="1" src="${product.productnomber}.png" width="128" height="128" alt="${product.productname}" style="background-color:white;"><br>
            価格：<c:out value="${product.price}" />円</p>
        <form action="/ReviewServlet" method="get">
            <input type="hidden" name="productnomber" value="${product.productnomber}">
            <input type="hidden" name="productname" value="${product.productname}">
            <input type="submit" value="レビューへ">
        </form>
        <form action="/AD170104/CartServlet" method="post"> 
            <input type="hidden" name="productname" value="${product.productname}">
            <input type="hidden" name="price" value="${product.price}">
            <input type="submit" value="カートに入れる">
        </form>
    </c:forEach>
    -->
    <br><br>
    <div class="link">
        <a href="/WelcomeServlet">TOPへ</a><br>
        <c:if test="${result==true}">
            <a href="/Logout">ログアウトする</a>
        </c:if>

    </div>
</body>
</html>
