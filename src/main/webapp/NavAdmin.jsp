<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Menu Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<style>
	.mainContainer{
		/*background-color: red;*/
		display: flex;
	}
	.leftContainer{
		background-color: black;
		width: 30%;
		color:white;
	}
	.rightContainer{
		background-color: black;
		width:70%;
		color: white;
		display: flex;
	
	}
	.rightContainer a{
		color: white;
		text-decoration: none;
		margin: 20px auto;
		justify-content: space-evenly;
	}
</style>
</head>
	<body>
	<div class="mainContainer">
	
		<div class="leftContainer">
			<h2>ADMIN MENU</h2>
		</div>
		<div class="rightContainer">
			<a href="FoodAdd.jsp">ADD TOUR</a>
			<a href="FoodDel.jsp">DELETE TOUR</a>
			<a href="FoodUpd.jsp">UPDATE TOUR</a>
			<a href="FoodList.jsp">ADD HOTEL</a>
			<a href="FoodSearch.jsp">UPDATE HOTEL</a>
			<a href="FoodSearch.jsp">LINK TOUR HOTEL</a>
		</div>
	</div>
	</body>
</html>