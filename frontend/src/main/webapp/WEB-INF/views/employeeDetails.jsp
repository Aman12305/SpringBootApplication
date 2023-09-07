<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<table>
    <tr>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Department</th>
        <th>Employee Age</th>
        <th>Employee Salary</th>
    </tr>
    <tr>
        <td>${currentEmployee.employeeId}</td>
        <td>${currentEmployee.employeeName}</td>
        <td>${currentEmployee.employeeDepartment}</td>
        <td>${currentEmployee.employeeAge}</td>
        <td>${currentEmployee.employeeSalary}</td>
    </tr>
</table>
</body>
</html>
