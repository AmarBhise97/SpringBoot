<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.usermanagment.bean.User"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>User Management System</title>

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	padding: 40px;
}

.container {
	max-width: 1000px;
	margin: auto;
	background-color: white;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
}

.header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 25px;
}

.header h2 {
	color: #333;
}

.add-btn {
	text-decoration: none;
	background-color: #198754;
	color: white;
	padding: 10px 18px;
	border-radius: 6px;
	font-weight: bold;
}

.add-btn:hover {
	background-color: #157347;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th {
	background-color: #212529;
	color: white;
	padding: 12px;
	text-align: left;
}

td {
	padding: 12px;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: #f8f9fa;
}

.edit-btn {
	text-decoration: none;
	background-color: #0d6efd;
	color: white;
	padding: 7px 12px;
	border-radius: 5px;
}

.edit-btn:hover {
	background-color: #0b5ed7;
}

.delete-btn {
	text-decoration: none;
	background-color: #dc3545;
	color: white;
	padding: 7px 12px;
	border-radius: 5px;
	margin-left: 5px;
}

.delete-btn:hover {
	background-color: #bb2d3b;
}

.empty-message {
	text-align: center;
	padding: 30px;
	color: #777;
}

@media ( max-width : 700px) {
	body {
		padding: 15px;
	}
	.container {
		padding: 15px;
		overflow-x: auto;
	}
	.header {
		flex-direction: column;
		gap: 15px;
		align-items: flex-start;
	}
	table {
		min-width: 700px;
	}
}
</style>

</head>

<body>

	<div class="container">

		<div class="header">

			<h2>User Management System</h2>

			<a href="user-form.jsp" class="add-btn"> + Add User </a>

		</div>


		<table>

			<tr>

				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Country</th>
				<th>Action</th>

			</tr>


			<%
			List<User> users = (List<User>) request.getAttribute("users");

			if (users != null && !users.isEmpty()) {

				for (User user : users) {
			%>

			<tr>

				<td><%=user.getId()%></td>

				<td><%=user.getName()%></td>

				<td><%=user.getEmail()%></td>

				<td><%=user.getCountry()%></td>

				<td><a href="users?action=edit&id=<%=user.getId()%>"
					class="edit-btn"> Edit </a> <a
					href="users?action=delete&id=<%=user.getId()%>"
					class="delete-btn"
					onclick="return confirm('Are you sure you want to delete this user?');">
						Delete </a></td>

			</tr>

			<%
			}

			} else {
			%>

			<tr>

				<td colspan="5" class="empty-message">No users found.</td>

			</tr>

			<%
			}
			%>

		</table>

	</div>

</body>

</html>