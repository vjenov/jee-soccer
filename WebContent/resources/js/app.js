var app = (()=>{
	return {
		init : ()=>{
			$('#a_join').click(()=>{
				alert('a태그 클릭');
			});
			$('#login_form').submit(()=>{
				alert('form태그 클릭');
			});
		}
	};
})();