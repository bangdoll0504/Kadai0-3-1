<%@page contentType="text/html; charset=UTF-8"%>

<html>
<body>
<jsp:useBean id="Customer"  class="beansdomain.Customer" scope="session" />

検索結果
<table border="1">
<tr><th>顧客ID</th><th>パスワード</th><th>姓</th><th>名</th></tr>
<tr>
<td><jsp:getProperty name="Customer" property="cuserid" /></td>
<td><jsp:getProperty name="Customer" property="pass" /></td>
<td><jsp:getProperty name="Customer" property="lname" /></td>
<td><jsp:getProperty name="Customer" property="sname" /></td>
</tr>
</table>



</body>
</html>