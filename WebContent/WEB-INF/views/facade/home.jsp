<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
		<h2>2.포지션 종류보기</h2>
		<a id = "btn2" href=#>2. 포지션 종류보기</a>
		<h2>4.팀아이디로 포지션 찾기</h2>
			<form id = "btn4" action="<%=request.getContextPath()%>/player.do">
			팀아이디 <input type="text" name = "teamId"/><br/>
			포지션  <input type="text" name = "position"/><br/>
			<input type="hidden" name = "action" value="find4"/><br/>
			<input type="hidden" name = "page" value="4_find_by_teamId_position"/><br/>
			<input type="submit" value = "전송"/>
			</form>
		<h2>5.수원팀(K02)에서 키가 170이상, 성이 고씨인 선수</h2>
			<form id = "btn5" action="<%=request.getContextPath()%>/player.do">
			팀아이디 <input type="text" name="teamId"/><br/>
			신장<input type="text" name="height"/><br/>
			선수이름<input type="text" name="playerName"/><br/>
			<input type="hidden" name = "action" value="find5"/><br/>
			<input type="hidden" name = "page" value="5_find_by_teamId_height_name"/><br/>
			<input type="submit" value = "전송"/>
			</form>
<script>
$('#btn2').click(function(){
	alert('클릭');
	location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions')
});
$('#btn4').submit(function(){
	alert('클릭');
});
$('#btn5').submit(function(){
	alert('클릭');
});
</script>
</div>
</body>
</html>