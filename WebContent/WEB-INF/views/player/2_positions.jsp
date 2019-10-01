<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>2.포지션 종류보기</h2>
		<input id = "btn2" type = button value="2. 포지션 종류 보기"/>
<form id="positions_form" action="<%=request.getContextPath()%>/player.do?action=2_positions">
</form>
포지션은   ${positions}입니다.
