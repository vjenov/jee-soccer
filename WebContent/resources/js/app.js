var app = (()=>{
	return {
		init : (ctx)=>{
			$('#a_join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx + '/player.do?action=move&page=join');
			});
			$('#login_form').submit(()=>{
				alert('form태그 클릭');
			});
			$('#a_return').click(()=>{
				location.assign(ctx + '/player.do?action=move&page=login');
			});
		}
	};
})();