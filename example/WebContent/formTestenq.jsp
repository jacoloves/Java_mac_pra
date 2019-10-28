<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/example/testenq" method="post">
		名前：<br>
		<input type="text" name="name"><br>
		お問い合わせ種類：<br>
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
		</select><br>
		お問い合わせ詳細:<br>
		<textarea name="body"cols="30" rows="10">ここに詳細を入力してください</textarea><br>
		<input type="submit" value="送信">
	</form>
</body>
</html>