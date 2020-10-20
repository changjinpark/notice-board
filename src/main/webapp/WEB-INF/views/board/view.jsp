<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!-- fmt 사용하려면 JSTL/fmt 라이브러리 필요 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
<h2>게시글 보기</h2>
<form name="form1" method="post">
<div>
작성일자 : <fmt:formatDate value="${vo.write_date}" pattern="yyyy-mm-dd a HH:mm:ss"/>
</div>
<div>
조회수 : ${vo.view_count}
</div>
<div>
제목 
<input name="title" id="title" size="80" value="${vo.title}" placeholder="제목을 입력해주세요">
</div>
<div>
내용
<textarea name="content" id="content" rows="4" cols="80" placeholder="내용을 입력해주세요">${vo.content}</textarea> 
</div>
<div>
이름
<input name="writer" id="writer" value="${vo.writer}" placeholder="이름을 입력해주세요">
</div>
<div style="width:650px; text-align: center;">
<button type="button" id="button_update">수정</button>
<button type="button" id="button_delete">삭제</button>
</div>
</form>
</body>
</html>