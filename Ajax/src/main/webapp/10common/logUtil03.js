
//==> Browser ȭ�鿡 log��  ����ϴ� function  
function log(message){
	var console = document.getElementById("console")
	if(console != null){
		console.innerHTML += message+"<br/>";
	}
}