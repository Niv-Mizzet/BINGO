<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Collections"
    import="java.util.ArrayList"
    import="java.util.Arrays"
    import="bingo.RandomNumberData"
    %>
<%
RandomNumberData x = new RandomNumberData();
ArrayList<Integer> Array = new ArrayList<Integer>();
int[] KisyutsuArray = x.getKA();
Array = x.getRA();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HostPage</title>
</head>
<body>
<form action="/Bingo_Kitayama/RandomButton" method="get">
<input type="submit" name="button" value="数字を出す" style="WIDTH: 100px; HEIGHT: 50px">
<p>
<%
 out.print(x.getK());
%>

回、ガラガラを回しました
<br>
今までに出た数字は
<%
Arrays.sort(KisyutsuArray);
for(int i:KisyutsuArray){
	if(i != 0){
	out.print("[" + i  + "]" + ",");
}}
%>
<br>

<p>ランダムな配列は
<%
for(int k:Array){
out.print("[" + k  + "]" + ",");
}
%>"

</p>
</form>
</body>
</html>