<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>5.수원팀(K02)에서 키가 170이상, 성이 고씨인 선수</h2>
			<form id = "btn5" action="<%=request.getContextPath()%>/player.do">
			팀아이디 <input type="text" name="teamId"/><br/>
			신장<input type="text" name="height"/><br/>
			선수이름<input type="text" name="playerName"/><br/>
			<input type="hidden" name = "action" value="find5"/><br/>
			<input type="hidden" name = "page" value="5_find_by_teamId_height_name"/><br/>
			<input type="submit" value = "전송"/>
			</form>
해당 ID가 ${players.teamId} 일치하는 선수명단은입니다.
