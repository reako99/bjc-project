<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>
<div class="registerForm">
    <form action="register" method="post">
        <input type="text" name="id" placeholder="아이디" required /><button id="idCheck">중복확인</button><br>
        <input type="password" name="pw" placeholder="비밀번호" required /><br>
        <input type="passwordCheck" name="pwCk" placeholder="비밀번호 확인" required /><br>
        <input type="submit" value="회원가입">
    </form>
    <button id="previousView">이전 페이지</button>
</div>
</body>
</html>
