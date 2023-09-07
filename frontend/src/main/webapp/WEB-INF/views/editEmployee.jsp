<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>
    <h1>Edit Employee</h1>
    <form action="EmployeeServlet" method="post">
        <input type="hidden" name="action" value="edit">
        <input type="hidden" name="id" value="${employee.employeeId}">
        <label for="name">Name:</label>
        <input type="text" name="name" value="${employee.employeeName}" required><br>
        <label for="department">Department:</label>
        <input type="text" name="department" value="${employee.employeeDepartment}" required><br>
        <label for="age">Age:</label>
        <input type="number" name="age" value="${employee.employeeAge}" required><br>
        <label for="salary">Salary:</label>
        <input type="text" name="salary" value="${employee.employeeSalary}" required><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
