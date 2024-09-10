<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel and Tourism</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script type="text/javascript">
   function register(){
	   window.open("Register.jsp");   
   }
   function login(){
	   window.open("Login.jsp")
   }
</script>
<style>
  body {
  background-image:url("https://static.vecteezy.com/system/resources/previews/008/347/339/original/world-travel-tour-map-vector.jpg");
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
  }
  .container {
    background-color: #508d4e;
    width: 40%;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 11px 10px 18px 0px rgba(0,0,0 ,0.75);
    text-align: center;
  }
  .logo {
    display: block;
    margin: 0 auto 20px;
    max-width: 100%;
    height: auto;
  }
  .buttonContainer {
    display: flex;
    justify-content: space-around;
  }
</style>
</head>
<body>
<div class="container">
  <img src="https://i.ibb.co/hLHjGNk/travel-LOGO.png" alt="travel-LOGO" class="logo">
  <div class="buttonContainer">
    <button onClick="register()" class="btn btn-dark">REGISTER</button>
    <button onClick="login()" class="btn btn-primary">LOGIN</button>
  </div>
</div>
</body>
</html>
