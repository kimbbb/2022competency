<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>오류가 발생하였습니다.</title>
<style>
body {
	padding: 0px;
	margin: 0px;
	background-color: black;
	color: white;
	font-size: 15px;
	font-weight: bold;
}

body>div {
	position: absolute;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
}

body>div>div {
	display: flex;
	justify-content: center;
	align-items: center;
	border: 2px solid white;
	border-radius: 10px;
	padding: 50px 100px;
}
</style>
</head>
<body>
	<div>
		<div>권한이 없는 단말기입니다. 관리자에게 문의 바랍니다.</div>
	</div>
</html>