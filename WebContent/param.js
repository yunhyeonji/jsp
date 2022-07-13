//유호성 검사

function check(){
	if(document.frm.id.value == ""){
		alert("아이디를 입력해주세요");
		document.frm.id.focus();
		return false;
	}else if(document.frm.age.value == ""){
		alert("나이를 입력해주세요");
		document.frm.age.focus();
		return false;
	}else if(isNaN(document.frm.age.value)){
		// isNaN = is not a number : 숫자가 아니라면~
		alert("숫자로 입력해주세요");
		document.frm.age.focus();
		return false;
	}else{
		return true;
	}
}