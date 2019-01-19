<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Student
</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>
   <c:forEach var="emp" items="${students}">
   <tr>
   <td>${emp.name}</td>
   <td>${emp.rollNo}</td>
   <td>${emp.address}</td>
   <td>${emp.designation}</td>
   </tr>
   </c:forEach>
   </table>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
