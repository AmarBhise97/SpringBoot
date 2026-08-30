<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.hospitalmanagment.bean.Hospital"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital List</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        margin: 0;
        padding: 30px;
    }

    .container {
        width: 90%;
        margin: auto;
        background: white;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 0 10px #ccc;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    .add-btn {
        display: inline-block;
        padding: 10px 18px;
        background-color: #28a745;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        margin-bottom: 20px;
    }

    .add-btn:hover {
        background-color: #218838;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 12px;
        text-align: center;
    }

    th {
        background-color: #007bff;
        color: white;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    .edit {
        background-color: #ffc107;
        color: black;
        padding: 7px 12px;
        text-decoration: none;
        border-radius: 4px;
    }

    .delete {
        background-color: #dc3545;
        color: white;
        padding: 7px 12px;
        text-decoration: none;
        border-radius: 4px;
    }

    .edit:hover {
        background-color: #e0a800;
    }

    .delete:hover {
        background-color: #c82333;
    }
</style>

</head>
<body>

<div class="container">

    <h2>Hospital Management System</h2>

    <a href="hospital-from.jsp" class="add-btn">
        Add Hospital
    </a>

    <table>

        <tr>
            <th>ID</th>
            <th>Hospital Name</th>
            <th>Address</th>
            <th>Fees</th>
            <th>Action</th>
        </tr>

        <%
            List<Hospital> hospitals =
                (List<Hospital>) request.getAttribute("hospital");

            if (hospitals != null && !hospitals.isEmpty()) {

                for (Hospital hospital : hospitals) {
        %>

        <tr>
            <td><%= hospital.getHospitalid() %></td>

            <td><%= hospital.getHospitalname() %></td>

            <td><%= hospital.getHospitaladdress() %></td>

            <td><%= hospital.getHospitalfees() %></td>

            <td>

                <a class="edit"
                   href="hospital?action=edit&hospitalid=<%= hospital.getHospitalid() %>">
                    Edit
                </a>

                <a class="delete"
                   href="hospital?action=delete&hospitalid=<%= hospital.getHospitalid() %>"
                   onclick="return confirm('Are you sure you want to delete this hospital?');">
                    Delete
                </a>

            </td>
        </tr>

        <%
                }

            } else {
        %>

        <tr>
            <td colspan="5">No hospitals found.</td>
        </tr>

        <%
            }
        %>

    </table>

</div>

</body>
</html>