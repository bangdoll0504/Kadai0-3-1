<%@page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>ユーザー検索</title>
</head>
<body>

	<form method="post" action="EmpReferServlet">
		ユーザーID:<input type="text" name="emplid"> <br> パスワード:<input
			type="text" name="emplpass"> <br> <input type="submit"
			value="ログイン"> <input type="reset">
	</form>

</body>
</html>