<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Collections"
    import="java.util.ArrayList"
    import="java.util.Arrays"
    %>
<%
String message = "Hello JSP!";
String message2 = "ByeBye JSP!";
int row = 5;
int cal = 5;
// row<9 cal<9 まで
ArrayList<Integer> array = new ArrayList<Integer>();
for(int i = 1 ; i <= 74 ; i++) {
    array.add(i);
}
Collections.shuffle(array);
%>
<!DOCTYPE html>
<html>
<link href="css/style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
</style>
</head>
<body>
 <p><%=message %></p>
 <p>Test<p>

<table class="table1">
<%
for(int i = 0; i < cal; i++){
%>
	<TR>
<%
for(int j = 0; j < row; j++){
if((j+(i*5)) != 12){%>
	<TD> <%= array.get(j+(i*5)) %> </TD>
<%
	}else{
%>
	<TD>B</TD>
<%
	}
}
%>
	</TR>
<%
	}
%>


</table>
 <p><%=message2 %><p>
 </body>
</html>