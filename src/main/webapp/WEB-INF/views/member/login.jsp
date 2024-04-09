<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<div class="loginForm">
    <form action="login" method="post">
        <input type="text" name="id" placeholder="아이디" required /><br>
        <input type="password" name="pw" placeholder="패스워드" required /><br>
        <input type="submit" value="로그인">
    </form>
    <button id="register">회원가입</button>
</div>
</body>
</html>
