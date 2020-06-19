<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Collections"
    import="java.util.ArrayList"
    import="Bingo_Kitayama.JSPBingo.jsp"
    %>
<%
String message = "Hello JSP!";
String message2 = "ByeBye JSP!";
int u = 0;
int k = 0;
int row = 5;
int cal = 5;
// row<9 cal<9 まで
BingoCard x = new BingoCard();
Integer[] array = x.getAC();
// シャッフルされた配列を呼び出して代入する
%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="UTF-8">
<title>TanoshiiBingo</title>
<style type="text/css">
.table1 {
  border: 1px solid gray;
  border-collapse: collapse;
}
.table1 th {
  border: 1px solid gray;
}
.table1 td {
  border: 1px solid gray;
  padding: 15px;
}
h1{
 color: blue;
}
</style>
</head>
<body>
 <p><%=message %></p>

<form action="/Bingo_Kitayama/ServletBINGO" method="get">
<table class="table1">
<% System.out.print(array); %>
<%
for(int i = 0; i < cal; i++){
%>
	<TR>
<%
for(int j = 0; j < row; j++){
if((j+(i*5)) != 12){%>
	<TD> <input type="submit" name="button" value="<%= array[j+(i*5)] %>" style="WIDTH: 50px; HEIGHT: 50px"> </TD>
<%
	}else{
%>
	<TD>    <p>B</p>
<%
	}
}
%>
	</TR>
<%
	}
%>
</table>
</form>
 <p><%=message2 %><p>
 </body>
</html>