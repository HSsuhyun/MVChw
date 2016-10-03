<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<style>
	div.ex{
	text-align: center;
	width: 45%;
	padding: 10px;
	border: 5px solid grey;
	margin: 20px;
	}
</style>

<body>
	<h1>Registration Form</h1>
	<div class="ex">
	Enter Informaion Here
		<form action = "/hiMVC/doRegister" method="post">
			<table cellpadding "5">
				<tr>
					<td>ID : </td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="Password" name="password"/></td>
				</tr>
				<tr>
					<td>Name : </td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td><input type="radio" name="gender" value="male"/>Male
					<input type="radio" name="gender" value="female">Female</td>
				</tr>
				<tr>
					<td>Email : </td>
					<td><input type="text" name="email"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Enter" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>