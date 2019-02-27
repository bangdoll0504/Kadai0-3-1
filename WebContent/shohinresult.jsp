<%@page contentType="text/html; charset=UTF-8"%>

<html>
<body>
<jsp:useBean id="Shohin"  class="beansdomain.Shohin" scope="session" />

検索結果
<table border="1">
<tr><th>商品ID</th><th>定価</th><th>価格</th><th>商品名</th><th>ISBNコード</th></tr>
<tr>
<td><jsp:getProperty name="Shohin" property="shohinid" /></td>
<td><jsp:getProperty name="Shohin" property="teika" /></td>
<td><jsp:getProperty name="Shohin" property="kakaku" /></td>
<td><jsp:getProperty name="Shohin" property="shohinmei" /></td>
<td><jsp:getProperty name="Shohin" property="isbn" /></td>
</tr>
</table>



</body>
</html>