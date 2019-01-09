<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>过滤器应用示例---敏感词过滤</h2>

     <form action="<c:url value='/NoteServlet'/>" method="post">

     	用户名:<input type="text" name="name" /><br/><br/>

		<fieldset>

			<legend>留言板</legend>

			<textarea name="note" rows="10" cols="20"></textarea>

		</fieldset>

		<input type="submit" value="留言" />     

     </form>
</body>
</html>