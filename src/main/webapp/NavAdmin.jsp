<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Menu Page</title>
<link rel="stylesheet" href="nav.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
/* nav.css */
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
	<nav class="mainContainer">
		<div class="leftContainer">
			<h2>ADMIN-MENU</h2>
		</div>
		<div class="rightContainer">
			<a href="Tour.jsp">ADD TOUR</a>
			<a href="TourDel.jsp">DELETE TOUR</a>
			<a href="TourUpd.jsp">UPDATE TOUR</a>
			<a href="Hotel.jsp">ADD HOTEL</a>
			<a href="HotelUpd.jsp">UPDATE HOTEL</a>
			<a href="HotelDel.jsp">DELETE HOTEL</a>
			<a href="TourHotel.jsp">LINK TOUR HOTEL</a>
		</div>
	</nav>
	</body>
</html>