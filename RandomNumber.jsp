<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Collections"
    import="java.util.ArrayList"
    import="java.util.Arrays"%>
 <%
    ArrayList<Integer> Random = new ArrayList<Integer>();
for(int i = 1 ; i <= 74 ; i++) {
    Random.add(i);
}
Collections.shuffle(Random);
int i = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Bingo_Kitayama/RandomButton" method="get">
<input type="submit" name="button" value="数字を出す" style="WIDTH: 100px; HEIGHT: 50px">
</form>
</body>
</html>