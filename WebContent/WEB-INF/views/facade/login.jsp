<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src= "${js}/app.js"></script>
</head>
<body>
<div id="wrapper" style="width: 100%; height:100%">
<img src="${img}/soccer_intro.jpg" alt="" />
<form id="login_form">
	<h2 style="width:300px; margin:0px auto">축협 관리 시스템</h2>
	<table border="1" style="width:300px; height:200px; margin:300px auto">
		<tr>
			<td style="width:300px">
			아이디 <input type="text" name="playerId" style="width:100%"/>
			</td>
			<td rowspan="2" style="width:300px">
			<input type="submit" value="로그인" style="width:100%; height:100%"/>
			</td>
		</tr>
		<tr>
			<td>
			패스워드<input type="text" name="solar" style="width:100%"/>
			</td>
		</tr>
		</table>
		<input type="hidden" name="action" value="login" style="width:100%; height:100%"/>
		<input type="hidden" name="page" value="home" style="width:100%; height:100%"/>
</form>
	<h3 style="width:300px; margin:0px auto"><a id="a_join" href="#">회원가입</a></h3>
</div>
<script>
app.init();
</script>
</body>

</html>