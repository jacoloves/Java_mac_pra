<%@page import="model.MusicChoice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.musicLogic" %>
<%
	MusicChoice mc = (MusicChoice) session.getAttribute("musicchoice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>消費税10%のレコード価格</title>
</head>
<body>
	<h1>音楽レコード</h1>
	<p>
		曲名:<%= mc.getMusicNumber() %><br>
		アーティスト:<%= mc.getMusicianName() %><br>
		税込価格:<%= mc.getAfterPrice() %>円<br>
		詳細:<br>
		<%= mc.getMusicDetail() %><br>
	</p>
	<a href="/smpleEx/musicChoiceSite">戻る</a>
</body>
</html>