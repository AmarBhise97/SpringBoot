<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.usermanagment.bean.User"%>

<%
User user = (User) request.getAttribute("user");
boolean editMode = (user != null);
%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title><%=editMode ? "Edit User" : "Add User"%></title>

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 20px;
}

.form-container {
	width: 100%;
	max-width: 500px;
	background-color: white;
	padding: 35px;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
}

.form-container h2 {
	text-align: center;
	margin-bottom: 25px;
	color: #333;
}

.form-group {
	margin-bottom: 18px;
}

.form-group label {
	display: block;
	margin-bottom: 7px;
	font-weight: bold;
	color: #444;
}

.form-group input {
	width: 100%;
	padding: 11px;
	border: 1px solid #ccc;
	border-radius: 6px;
	font-size: 15px;
}

.form-group input:focus {
	outline: none;
	border-color: #0d6efd;
}

.submit-btn {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 6px;
	background-color: #0d6efd;
	color: white;
	font-size: 16px;
	font-weight: bold;
	cursor: pointer;
}

.submit-btn:hover {
	background-color: #0b5ed7;
}

.back-link {
	display: block;
	text-align: center;
	margin-top: 18px;
	text-decoration: none;
	color: #555;
}

.back-link:hover {
	color: #0d6efd;
}
</style>

</head>

<body>

	<div class="form-container">

		<h2>
			<%=editMode ? "Edit User" : "Add User"%>
		</h2>

		<form action="users" method="post">

			<%
			if (editMode) {
			%>

			<input type="hidden" name="action" value="update"> <input
				type="hidden" name="id" value="<%=user.getId()%>">

			<%
			}
			%>


			<div class="form-group">

				<label>Name</label> <input type="text" name="name"
					value="<%=editMode ? user.getName() : ""%>"
					placeholder="Enter name" required>

			</div>


			<div class="form-group">

				<label>Email</label> <input type="email" name="email"
					value="<%=editMode ? user.getEmail() : ""%>"
					placeholder="Enter email" required>

			</div>


			<div class="form-group">

				<label>Country</label> <input type="text" name="country"
					value="<%=editMode ? user.getCountry() : ""%>"
					placeholder="Enter country">

			</div>


			<button type="submit" class="submit-btn">

				<%=editMode ? "Update User" : "Save User"%>

			</button>

		</form>


		<a href="users" class="back-link"> ← Back to User List </a>

	</div>

</body>

</html>