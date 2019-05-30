<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8"%>
<title>sunflower</title>
    <link rel="stylesheet" type="text/css" href="/static/file/index.css">
</head>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<body class="index">
<h1>this is index.jsp</h1>
<span>${ctx}</span>
    <ul>
        <li>
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserRelname}">
            <input type="text" value="${sessionScope.user.fUserNick}">
        </li>
        <li>
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserRelname}">
            <input type="text" value="${sessionScope.user.fUserNick}">
        </li>
        <li>
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserRelname}">
            <input type="text" value="${sessionScope.user.fUserNick}">
        </li>
        <li>
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserPhone}">
            <input type="text" value="${sessionScope.user.fUserRelname}">
            <input type="text" value="${sessionScope.user.fUserNick}">
        </li>

    </ul>
</body>
</html>