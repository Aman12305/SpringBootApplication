<!DOCTYPE html>
<html>
<head>
    <title>View Employee Details</title>
</head>
<body>
    <h1>View Employee Details</h1>
    <c:if test="${employee != null}">
        <table>
            <tr>
                <td>ID:</td>
                <td>${employee.employeeId}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${employee.employeeName}</td>
            </tr>
            <tr>
                <td>Department:</td>
                <td>${employee.employeeDepartment}</td>
            </tr>
            <tr>
                <td>Age:</td>
                <td>${employee.employeeAge}</td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td>${employee.employeeSalary}</td>
            </tr>
        </table>
    </c:if>
</body>
</html>
