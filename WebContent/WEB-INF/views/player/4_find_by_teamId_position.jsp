<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>4.팀아이디로 포지션 찾기</h2>
		<form id = "btn4" action="<%=request.getContextPath()%>/player.do">
		팀아이디 <input type="text" name = "teamId"/><br/>
		포지션  <input type="text" name = "position"/><br/>
		<input type="hidden" name = "action" value="find4"/><br/>
		<input type="hidden" name = "page" value="4_find_by_teamId_position"/><br/>
		<input type="submit" value = "전송"/>
		</form>
해당 ID가 ${players.teamId} 팀의 포지션 ${players.position}이 일치하는 선수는 홍길동입니다.
