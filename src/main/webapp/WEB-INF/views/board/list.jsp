<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- forEach 사용하려면 JSTL/core 라이브러리 필요 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!-- fmt 사용하려면 JSTL/fmt 라이브러리 필요 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 목록</h2>
<button type="button" id="btnWrite">글쓰기</button>
<table border="1" width="600px">
<tr>
<th>번호</th>
<th>제목</th>
<th>이름</th>
<th>작성일</th>
<th>조회수</th>
</tr>
<c:forEach var="var" items="${list}">
<tr>
<td>${var.id}</td>
<td>${var.title}</td>
<td>${var.writer}</td>
<td><fmt:formatDate value="${var.write_date}" pattern="yyyy-mm-dd HH:mm:ss"/></td>
<td>${var.view_count}</td>
</tr>
</c:forEach>
</table>
</body>
</html>