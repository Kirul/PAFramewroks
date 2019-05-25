<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>User Registration</title>
</head>
<body>

	<h1 style="align: center">SellNBuy E Commerce System</h1>
	<h3 style="align: center">User Registration</h3>
	
	<form action="/action_page.php">
  		<div class="form-group">
   		  <label for="name">User name:</label>
    	  <input type="name" class="form-control" id="name">
        </div>
        <div class="form-group">
          <label for="age">User age:</label>
          <input type="age" class="form-control" id="age">
        </div>
        <div class="form-group">
          <label for="registrationNumber">Registration Number:</label>
          <input type="registrationNumber" class="form-control" id="regNum">
        </div>
   
     <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</body>
</html>