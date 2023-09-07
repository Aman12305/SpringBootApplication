<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <style>
        /* Add CSS styles for the table and its elements */
        body {
            text-align: center; /* Center-align the contents */
            background-color: #f5f5f5; /* Background color */
            font-family: Arial, sans-serif; /* Choose a font */
        }
        
        table {
            width: 80%; /* Set the table width */
            margin: 0 auto; /* Center the table horizontally */
            background-color: #fff; /* Table background color */
            border-collapse: collapse; /* Collapse table borders */
            margin-top: 20px; /* Add some space from the top */
        }
        
        th, td {
            padding: 10px; /* Add padding to table cells */
            border: 1px solid #ddd; /* Add cell borders */
            text-align: left; /* Left-align table cell text */
        }
        
        th {
            background-color: #333; /* Header background color */
            color: #fff; /* Header text color */
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2; /* Alternate row background color */
        }
        
        tr:hover {
            background-color: #ddd; /* Hover effect for rows */
        }
    </style>
</head>
<body>
    <h1>Employee List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td>${employee.getEmployeeId()}</td>
                <td>${employee.getEmployeeName()}</td>
                <td>${employee.getEmployeeDepartment()}</td>
                <td>${employee.getEmployeeAge()}</td>
                <td>${employee.getEmployeeSalary()}</td>
                <!-- Add an action column if needed -->
            </tr>
        </c:forEach>
    </table>
</body>
</html>
