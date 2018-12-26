<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javaScript">
	window.onload=function(){
		alert("掏你猴子");
		
		//1.获取a节点，并为其添加onclick函数。
		document.getElementByTagName("a")[0].onlick = function(){
			
			alert("掏你猴子");
			//3.创建一个XMLHttpRequest 对象
			var request = new XMLHttpRequest();
			
			//4.准备发送请求数据：url
			var url = this.herf;
			var method = "GET";
			
			//5.调用XMLHttpRequest对象的 open 方法
			request.open(method,rul);
			
			//6.调用XMLHttpRequest对象的 send 方法
			request.send(null);
			
			//7.为XMLHttpRequest对象添加
			request.onreadystatechange = function(){
				//8.判断响应是否完成：XMLHttpRequest对象的readyState属性值为4的时候
				if(request.readyState == 4){
					//9.再判断响应是否完可用：XMLHttpRequest对象的status 属性值为200或者304
					if(request.status == 200 || request.status == 304){
						//10.打印相应结果：requestText
						alert(request.responseText);
					}
				}
			}
			//2.取消a节点的默认行为
			return false;
		}
		
	}
</script>
</head>
<body>
	<a href="helloAjax">HelloAjax</a>
</body>
</html>