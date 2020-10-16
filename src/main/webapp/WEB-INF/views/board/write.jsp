<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>게시글 작성</title>
</head>
<body>
<h2>게시글 작성</h2>
<form name="form1" method="post" action="${path}/board/insert.do">
<div>
제목
<input name="title" id="title" placeholder="제목을 입력해주세요">
</div>
<div>
내용
<textarea name="content" id="content" rows="4" cols="80" placeholder="내용을 입력해주세요"></textarea>
</div>
<div>
이름
<input name="writer" id="writer" placeholder="이름을 입력해주세요">
</div>
<div style="width:650 ; text-align:center">
<button type="button" id="btnSave">확인</button>
<button type="reset">취소</button>
</div>
</form>

</body>
</html>
