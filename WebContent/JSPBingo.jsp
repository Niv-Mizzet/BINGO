<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Collections"
    import="java.util.ArrayList"
    import="bingo.BingoCard"
	import="bingo.RandomNumberData"
	import="java.util.Arrays"
    %>
<%
String message = "Hello JSP!";
String message2 = "ByeBye JSP!";
int u = 0;
int row = 5;
int cal = 5;
// row<9 cal<9 まで
BingoCard x = new BingoCard();
Integer[] array = x.getAC();
// シャッフルされた配列を呼び出して代入する
RandomNumberData y = new RandomNumberData();
int[] KisyutsuArray = y.getKA();
ArrayList<Integer> HittedNumber = BingoCard.getHN();
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
<%  // 縦列のビンゴ判定
for(int i = 0; i < 5; i++){
for(int j = 0,k = 0; j < 5; j++){
if(HittedNumber.contains(array[(j*5)+i])){
	if((array[(j*5)+i] == array[12])){
	k += 1;
	continue;
	}
	k += 1;
	if(k == 5){
		out.print("ビンゴ!!!");
		}
	}
}
}

// 横列のビンゴ判定
for(int j = 0; j < 5; j++){
for(int i = 0,k = 0; i < 5; i++){
if(HittedNumber.contains(array[i+(j*5)])){
	if(array[i+(j*5)] == array[12]){
	k += 1;
	continue;
	}
	k += 1;
	if(k == 5){
		out.print("ビンゴ!!!");
	}
}
}
}
// 左斜めのビンゴ判定
for(int i = 0,j = 0; i < 5; i++){
if(HittedNumber.contains(array[i*6])){
	if(array[i*6] == array[12]){
	continue;
	}
	j += 1;
	if(j == 4){
		out.print("ビンゴ!!!");
	}
}
}

// 右斜めのビンゴ判定
for(int i = 1,j = 0; i < 6; i++){
if(HittedNumber.contains(array[i*4])){
	if(array[i*4] == array[12]){
	continue;
	}
	j += 1;
	if(j == 4){
		out.print("ビンゴ!!!");
	}
}
} %>

<form action="/Bingo_Kitayama/ServletBINGO" method="get">
<table class="table1">
<%
for(int i = 0; i < cal; i++){
%>
	<TR>
<%
for(int j = 0; j < row; j++){
if((j+(i*5)) != 12){
    if(HittedNumber.contains(array[j+(i*5)])) { %>
    <TD><% out.print(array[j+(i*5)]); %></TD>
    <% }else{ %>
	<TD> <input type="submit" name="button" value="<%= array[j+(i*5)] %>" style="WIDTH: 50px; HEIGHT: 50px"> </TD>
<%
	}
    }else{
%>
	  <TD>  <p>B</p> </TD>
<%
	}
}
%>
	</TR>
<%
	}
%>
</table>

<p>数字が出た順番は
<br>
今までに出た数字は
<%
Arrays.sort(KisyutsuArray);
for(int i:KisyutsuArray){
	if(i != 0){
	out.print("[" + i  + "]" + ",");
	}
}
%>
</p>
</form>
 <p><%=message2 %><p>
 </body>
</html>