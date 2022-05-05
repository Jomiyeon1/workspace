<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>
<%@page import="org.json.simple.JSONObject" %>
<%@page import="org.json.simple.JSONArray" %>

<%
	// ==> json_simple.jar �̿�
	JSONObject obj = new JSONObject();
	obj.put("aaa","aaa");
	obj.put("bbb","bbb");
	
	//==> array notation
	JSONArray array = new JSONArray();
	array.add("z");
	array.add("zz");
	array.add("zzz");
	
	// name = value �� array ȥ��
	obj.put("ccc",array);
	
	//==> console ���
	System.out.println(obj);

%>

<%--
		//JSON(JavaScript Object Notation)
	 	//==> 1. name= value Notation
	 	var test01 ={ a:'a', b:'b', c:'c'};
	 	
	 	//==> 2. array Notation
	 	var test02 =[ 'aa', 'bb', 'cc' ];

	 	//==> 3. name=value �� array�� ȥ��
--%>

{
	aaa:'aaa',
	bbb:'bbb',
	ccc: [ 'z','zz','zzz']
}

<%-- 
	- client ���� parseJSON() ���� Error �� �߻��ϸ�..
	- �Ʒ��� ���� �Ѵٸ�...
{
	"aaa":"aaa",
	"bbb":"bbb",
	"ccc": [ "z","zz","zzz"]
}
 --%>