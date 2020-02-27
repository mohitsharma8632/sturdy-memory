<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap-4.3.1-dist\css\bootstrap.css">
  <script src="bootstrap-4.3.1-dist\bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Welcome</h1>

</div>

  <nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">About</a>
    </li>
     </ul>
</nav>

<br>
<br><br><br><br>


  <div class="row">
    <div class="col-sm-1" >
	</div>
    <div class="col-sm-5" >
	
	<h1>sign in</h1>
	<form action="Signin" method="post">
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" placeholder="Enter email" id="email" name="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="pass">
  </div>


  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
    <div class="col-sm-5" >
	
<h1>sign up</h1>
	<form action="Signup" method="post" >
  <div class="form-group">
    <label for="text">Name:</label>
    <input type="text" class="form-control" placeholder="Enter name" id="name" name="name">
  </div>
    <div class="form-group">
    <label for="text">Last Name:</label>
    <input type="text" class="form-control" placeholder="Enter last name" id="lname" name="lname">
  </div>
  
  
    <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" placeholder="Enter Email" id="email" name="email">
  </div>
  
   <div class="form-group">
    <label for="text">Moblie no:</label>
    <input type="text" class="form-control" placeholder="Enter Mobile no" id="mobileno" name="mobileno">
  </div>
  
  
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="pass" name="pass">
  </div>

  

  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	
	</div>
	
 <div class="col-sm-1" >
	</div>

  </div>





</body>
</html>
