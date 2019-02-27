<%@page contentType="text/html; charset=UTF-8"%>

<html>
<body>
<jsp:useBean id="Employee"  class="beansdomain.Employee" scope="session" />

検索結果
<table border="1">
<tr><th>顧客ID</th><th>パスワード</th><th>姓</th><th>名</th></tr>
<tr>
<td><jsp:getProperty name="Employee" property="emplid" /></td>
<td><jsp:getProperty name="Employee" property="emplpass" /></td>
<td><jsp:getProperty name="Employee" property="empllname" /></td>
<td><jsp:getProperty name="Employee" property="emplfname" /></td>
</tr>
</table>



</body>
</html>