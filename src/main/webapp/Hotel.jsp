<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="NavAdmin.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
    .main{
    background-color: #d0f7f4; 
    font-family: serif; 
    display: flex; 
    justify-content: center; 
    align-items: center; 
    height: 100vh; 
    margin: 0; 
    } 
    .register-Container { 
    width: 30%; 
    padding: 20px; 
    text-align: center;
    backdrop-filter: blur(10px); 
    background-color: rgba(32, 178, 170, 0.2); 
    box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px; 
    border: 1px solid rgba(32, 178, 170, 0.3); 
    border-radius: 25px;
     }
     .form-control {
      background: #d0f7f4;
       margin-bottom: 15px; 
       border-radius: 15px; 
       box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px; 
       }
       #input:focus{
          box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
       background-color: #d0f7f4;
       transform: translateY(-0.8rem);
       } 
       .form-control:focus{
       box-shadow: rgba(0, 0, 0, 0.2) 0px 12px 28px 0px, rgba(0, 0, 0, 0.1) 0px 2px 4px 0px, rgba(255, 255, 255, 0.05) 0px 0px 0px 1px inset;
         background-color: #d0f7f4;
       }
       a 
       { display: block;
        margin-top: 10px;
        color: #007bff;
          text-decoration: none;
           } 
         a:hover {
            color: #0056b3;
             } 
             
        .btn {
        border-radius: 15px;
         outline-color: green; 
         background-color: #d0f7f4; 
       box-shadow: rgba(0, 0, 0, 0.15) 1.95px 1.95px 2.6px;
         } .btn:hover { 
         background-color: #20b2aa; 
         color: #fff; 
         border: 1px solid rgba(32, 178, 170, 0.3);
         box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px; 
         }
</style>
</head>
<body>
<div class="main">
	<div class="register-Container">
		<form action="HotelAddServ" method="post">
			<input type="text" class="form-control" placeholder="HOTEL ID" name="hid" id="input">
			<input type="text" class="form-control" placeholder="HOTEL NAME" name="hname" id="input">
			<input type="text" class="form-control" placeholder="TOUR PLACE" name="tplace" id="input">
			<button class="btn" style="width: 40%;">ADD</button>
		</form>
	</div>
</div>
</body>
</html>