<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Form For Registration
</h1>
<form action="registration" method="post">
    <input type="text" name="userName"/>
    <input type="password" name="password"/>
    <input type="submit" value="Submit"/>
</form>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
