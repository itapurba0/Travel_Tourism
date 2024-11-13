<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="NavAdmin.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOTEL DELETE</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
    .main {
        background: #d6efd8;
        font-family: 'Georgia',serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .register-Container {
        width: 30%;
        padding: 20px;
        background-color: #80af81;
        box-shadow: 11px 10px 18px 0px rgba(0,0,0,0.65);
        border-radius: 10px;
        text-align: center;
    }
    .login-container h2 {
        margin-bottom: 20px;
        color: #343a40;
    }
    .form-control {
        background-color:  #d6efd8;
        
        margin-bottom: 15px;
        border-radius: 5px;
    }
   
    a {
        display: block;
        margin-top: 10px;
        color: #007bff;
        text-decoration: none;
    }
    a:hover {
        color: #0056b3;
    }
</style>
</head>
<body>
<div class="main">
	<div class="register-Container">
		<form action="HotelDelServ" method="post">
			<input type="text" class="form-control" placeholder="HOTEL ID" name="hid">
			<button class="btn btn-outline-dark" style="width: 40%;">DELETE</button>
		</form>
	</div>
</div>
</body>
</html>