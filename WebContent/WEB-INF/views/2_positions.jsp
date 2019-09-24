<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포지션</title>
</head>
<body>
<div>
<form id="positions_form" action="<%=request.getContextPath()%>/player.do?action=2_positions">
포지션은   ${positions}입니다.
</form>
</div>
</body>
</html>