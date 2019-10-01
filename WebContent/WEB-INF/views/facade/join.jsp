<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="../common/head.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src= "${js}/app.js"></script>
</head>
<body>
회원가입 화면
 <form id="join_form">
	<div id="join_tab" >
			<div id="join_tab_item_1" >
				PLAYERID  <input class="input_text" type="text" name="playerId"/>
			</div>
			<div id="join_tab_item_2">
				PLAYERNAME  <input class="input_text" type="text" name="playerName"/>
			</div>  
			<div id="join_tab_item_3">
				PASSWORD  <input class="input_text" type="text" name="solar">
			</div>
			<div id="join_tab_item_4">
				TEAMID  <input class="input_text" type="text" name="teamId">
			</div>
			<div id="join_tab_item_5">
				POSITION  <input class="input_text" type="text" name="position">
			</div>
			<div id="join_tab_item_6">
				BACKNO  <input class="input_text" type="text" name="backNo">
			</div>
			<div id="join_tab_item_7">
				NATION  <input class="input_text" type="text" name="nation">
			</div>
			<div id="join_tab_item_8">
				BIRTHDATE  <input class="input_text" type="text" name="birthDate">
			</div>
			<div id="join_tab_item_9">
				HEIGHT  <input class="input_text" type="text" name="height">
			</div>
			<div id="join_tab_item_10">
				WEIGHT  <input class="input_text" type="text" name="weight">
			</div>
			<div id="join_tab_item_11">
				<input id="join_submit" type="submit" value="회원가입" /> <h3><a id="a_return" href="#">뒤로가기</a></h3>
			</div>  
	</div>
	<input type="hidden" name="action" value="login" />
	<input type="hidden" name="page" value="home" />
 </form>

<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>