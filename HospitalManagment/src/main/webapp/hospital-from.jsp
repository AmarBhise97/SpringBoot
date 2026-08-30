<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.hospitalmanagment.bean.Hospital"%>

<%
    Hospital hospital = (Hospital) request.getAttribute("hospital");

    boolean editMode = (hospital != null);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
    <%= editMode ? "Update Hospital" : "Add Hospital" %>
</title>

<style>

    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        margin: 0;
        padding: 40px;
    }

    .form-container {
        width: 450px;
        margin: auto;
        background-color: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 0 10px #ccc;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-top: 15px;
        margin-bottom: 5px;
        font-weight: bold;
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 11px;
        margin-top: 25px;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    .back {
        display: block;
        text-align: center;
        margin-top: 15px;
        text-decoration: none;
        color: #555;
    }

</style>

</head>

<body>

<div class="form-container">

    <h2>
        <%= editMode ? "Update Hospital" : "Add Hospital" %>
    </h2>

    <form action="hospital" method="post">

        <% if (editMode) { %>

            <input type="hidden"
                   name="hospitalid"
                   value="<%= hospital.getHospitalid() %>">

            <input type="hidden"
                   name="action"
                   value="update">

        <% } %>


        <label>Hospital Name</label>

        <input type="text"
               name="hospitalname"
               placeholder="Enter hospital name"
               value="<%= editMode ? hospital.getHospitalname() : "" %>"
               required>


        <label>Hospital Address</label>

        <input type="text"
               name="hospitaladdress"
               placeholder="Enter hospital address"
               value="<%= editMode ? hospital.getHospitaladdress() : "" %>"
               required>


        <label>Hospital Fees</label>

        <input type="number"
               name="hospitalfees"
               placeholder="Enter hospital fees"
               step="0.01"
               value="<%= editMode ? hospital.getHospitalfees() : "" %>"
               required>


        <input type="submit"
               value="<%= editMode ? "Update Hospital" : "Add Hospital" %>">

    </form>

    <a href="hospital" class="back">
        ← Back to Hospital List
    </a>

</div>

</body>
</html>