<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="date" class="java.util.Date"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>レビュー</title>
        <link rel="stylesheet" type="text/css" href="/css/body.css">
    </head>
    <body>
        <div class="title2">つだぞん.com</div>
        <h3>[<c:out value="${productname}" />]</h3>
        <img border="1" src="${productnomber}.png" width="256" height="256" alt="${productname}" style="background-color:white;"><br>
        <form action="/ReviewServlet" method="post">
            <input type="comment" name="comment"><br>
            <input type="hidden" name="productnomber" value="${productnomber}">
            <input type="hidden" name="productname" value="${productname}">
            <input type="hidden" name="Id" value="${Id}">
            <input type="hidden" name="pass" value="${pass}">
            <c:if test="${not empty errorMsg}">
                <h3>${errorMsg}</h3>
            </c:if>
            <input type="submit" value="レビューを書く">
        </form>
        <p>レビュー</p>
        <c:if test="${empty reviewList}">
            <h4>レビューがありません。</h4>
        </c:if>

        <c:if test="${not empty reviewList}">
            <c:forEach var="review" items="${reviewList}" varStatus="status">  
                コメント<c:out value="${status.index+1}"/>：<c:out value="${review.comment}" />   <<c:out value="${review.posted}" />></p>
            </c:forEach>
        </c:if>
    <div class="link">
        <form action="/CartServlet" method="post">
            <input type="hidden" name="productname" value="${product.productname}">
            <input type="hidden" name="price" value="${product.price}">
            <input type="submit" value="カートに入れる">
        </form>
        <a href="/Main">商品一覧画面へ</a><br>
    </div>
</body>
</html>