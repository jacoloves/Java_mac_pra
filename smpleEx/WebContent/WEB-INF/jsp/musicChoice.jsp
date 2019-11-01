<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>音楽入力サイト</title>
</head>
<body>
	<h1>音楽入力サイト</h1>
	<form action="/smpleEx/musicChoiceSite" method="post">
		曲名:<input type="text" name="music"><br>
		アーティスト:<input type="text" name="musician"><br>
		値段:<input type="text" name="price">円<br>
		詳細:<br>
		<textarea name="detail" cols="30" rows="10">ここに詳細を入力してください</textarea><br>
		<input type="submit" value="送信">
	</form>
</body>
</html>