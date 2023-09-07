<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<table>
<c:forEach var="employee" items="${list1}"> 
	<tr>	
		<td>${employee.employeeId}</td>
		<td>${employee.employeeName}</td>
		<td>${employee.employeeDepartment}</td>
		<td>${employee.employeeAge}</td>
		<td>${employee.employeeSalary}</td>
	</tr>
</c:forEach> 
</table>
</body>
</html>