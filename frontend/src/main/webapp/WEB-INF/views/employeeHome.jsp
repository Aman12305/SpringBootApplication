<!DOCTYPE html>
<html>
<head>
    <title>Employee Management Home</title>
    <style>
        /* Style for the navigation bar */
        ul.navbar {
            list-style-type: none;
            margin: 0;
            padding: 0;
            background-color: #333;
            overflow: hidden;
        }

        li.nav-item {
            float: left;
        }

        li.nav-item a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li.nav-item a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Style for the forms */
        form {
            display: none;
            text-align: left;
        }
        
        .container {
            position:relative;
            width: 80%;
            min-width: 250px;
            margin: 70px auto; /* Center the container horizontally */
            border: 1px solid #ddd; /* Add border */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Add box shadow */
            padding: 20px; /* Add padding */
            text-align: center; /* Center-align text within the container */
        }

        form label {
            font-weight: bold; /* Add bold font to labels */
            display: block; /* Display labels as block elements */
            margin-bottom: 5px; /* Add margin below labels */
        }

        form input[type="text"],
        form input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px; /* Adjust font size */
        }

        form button[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        form button[type="submit"]:hover {
            background-color: #555;
        }
        
        .homeContainer{
        	display:flex;
        	align-items:center;
        	text-align: center;
        	justify-content:center;
        }
        
        
    </style>
</head>
<body>
    <h1 style="text-align:center">Employee Management Home</h1>
    
    <!-- Navigation bar -->
    <ul class="navbar">
        <li class="nav-item">
            <a href="#" id="home">Home</a>
        </li>
        <li class="nav-item">
            <a href="#" id="showAllEmployee">Fetch All Employee</a>
        </li>
        <li class="nav-item">
            <a href="#" id="addEmployee">Add Employee</a>
        </li>
        <li class="nav-item">
            <a href="#" id="deleteEmployee">Delete Employee</a>
        </li>
        <li class="nav-item">
            <a href="#" id="updateEmployee">Update Employee</a>
        </li>
        <li class="nav-item">
            <a href="#" id="searchById">Search by ID</a>
        </li>
    </ul>
    
    <div class="container" style="margin-top:90px">
    	
    	<form id='formMainPage' class="homeContainer">
    		<h2>Welcome to employee management system.</h2>
    		<p>Through this application you can able to create a new employee, update existing employee, search employee with their name and also delete 
    			employee with their id.
    		</p>
    	</form>
        <!-- Forms -->
        <form action="/showAll" id="formHome">
            <button type="submit">Fetch All Employees</button>
        </form>

        <form action="/deleteEmployee" method="post" id="formDeleteEmployee">
            <input type="hidden" name="_method" value="DELETE">
            <label for="deleteEmployeeId">Id:</label>
            <input type="number" name="employeeId" id="deleteEmployeeId" required/><br/>
            <button type="submit">Delete Employee</button>
        </form>

        <form action="/insertEmployee" id="formCreateEmployee" method="post">
            <label for="createEmployeeId">Id:</label>
            <input type="text" name="employeeId" id="createEmployeeId" required/><br/>
            <label for="createEmployeeName">Name:</label>
            <input type="text" name="employeeName" id="createEmployeeName" required/><br/>
            <label for="createEmployeeAge">Age:</label>
            <input type="number" name="employeeAge" id="createEmployeeAge" required/><br/>
            <label for="createEmployeeDepartment">Department:</label>
            <input type="text" name="employeeDepartment" id="createEmployeeDepartment" required/><br/>
            <label for="createEmployeeSalary">Salary:</label>
            <input type="number" name="employeeSalary" id="createEmployeeSalary" required/><br/>
            <button type="submit">Insert Employee</button>
        </form>

        <form action="/updateEmployee" id="formUpdateEmployee" method="post">
            <label for="updateEmployeeId">Id:</label>
            <input type="text" name="employeeId" id="updateEmployeeId" required/><br/>
            <label for="updateEmployeeName">Name:</label>
            <input type="text" name="employeeName" id="updateEmployeeName" required/><br/>
            <label for="updateEmployeeAge">Age:</label>
            <input type="number" name="employeeAge" id="updateEmployeeAge" required/><br/>
            <label for="updateEmployeeDepartment">Department:</label>
            <input type="text" name="employeeDepartment" id="updateEmployeeDepartment" required/><br/>
            <label for="updateEmployeeSalary">Salary:</label>
            <input type="number" name="employeeSalary" id="updateEmployeeSalary" required/><br/>
            <button type="submit">Update Employee</button>
        </form>

        <form action="/showEmployee" id="formSearchById">
            <label for="searchEmployeeId">Id:</label>
            <input type="number" name="employeeId" id="searchEmployeeId"/><br/>
            <button type="submit">Fetch One Employee</button>
        </form>
    </div>
    

    <!-- JavaScript to toggle forms -->
    <script>
    	
    	// Trigger a click event on the "Home" link when the page loads
    	 document.addEventListener("DOMContentLoaded", function () {
	        document.getElementById("home").click();
	    });
    	
        document.getElementById("home").addEventListener("click", function () {
            toggleForm("formMainPage");
        });

        document.getElementById("deleteEmployee").addEventListener("click", function () {
            toggleForm("formDeleteEmployee");
        });

        document.getElementById("updateEmployee").addEventListener("click", function () {
            toggleForm("formUpdateEmployee");
        });

        document.getElementById("searchById").addEventListener("click", function () {
            toggleForm("formSearchById");
        });
        
        document.getElementById("addEmployee").addEventListener("click", function () {
            toggleForm("formCreateEmployee");
        });
        
        document.getElementById("showAllEmployee").addEventListener("click", function () {
            toggleForm("formHome");
        });	    

        function toggleForm(formId) {
            const forms = document.querySelectorAll("form");
            forms.forEach(form => form.style.display = "none");
            document.getElementById(formId).style.display = "block";
        }
    </script>
</body>
</html>

