<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Client Menu Page</title>
<link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<style>
	.mainContainer {
    background-color: #1A5319;
    display: flex;
    justify-content: space-between;
    padding: 10px;
    height: 10vh;
}

.leftContainer h2 {
    color: #80af81;
    margin: 0;
}
.leftContainer{
 width:30%;
 display: flex;
 justify-content: center;
}
.rightContainer{
 width:70%;
 display: flex;
 justify-content: space-between;
 align-items: center;
}
.rightContainer a {
    color: #80af81;
    text-decoration: none;
    margin: 0 10px;
    padding: 5px 10px;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

.rightContainer a:hover {
    background-color: #80af81;
    color: #343a40;
    text-decoration: inherit;
}
.rightContainer a:target {
	 background-color: #80af81;
    color: #343a40;
    text-decoration: inherit;
}

</style>
</head>
	<body>
	<div class="mainContainer">
	
		<div class="leftContainer">
			<h2>CLIENT MENU</h2>
		</div>
		<div class="rightContainer">
			<a href="FoodAdd.jsp">SEARCH TOUR</a>
			<a href="FoodDel.jsp">BOOKING</a>
			<a href="FoodUpd.jsp">BOOKING DETAILS</a>
		</div>
	</div>
	</body>
</html>