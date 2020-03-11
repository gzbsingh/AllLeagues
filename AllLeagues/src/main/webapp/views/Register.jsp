<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <link href="/css/UseTo.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script type="text/javascript" src="/js/Form.js"></script>
<style type="text/css">

#success_message{ display: none;}
 .fieldset{  
 margin-left: 100px;}
</style>
</head>
  <body>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="#">Leagues</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">League</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Admin</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="#">About</a>
      </li>    
    </ul>
  </div>  
</nav>
</div>

    <div class="container">

    <form class="well form-horizontal" action="RegisterLeague" method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Registration Form</b></h2></center></legend><br>

<!-- Text input-->


<div class="form-group">
  <label class="col-md-4 control-label" >Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="Title" placeholder="Title" class="form-control"  type="text">
    </div>
  </div>
</div>

 
  
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Email</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="email" placeholder="Email" class="form-control"  type="email">
    </div>
  </div>
</div>






<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">DateOfBirth</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="Dob" placeholder="Enter DateOfBirth" class="form-control" type="date">
    </div>
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label">Contact No</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="Cont" placeholder="Enter ContactNo" class="form-control" type="text">
    </div>
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label">Address</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
 <textarea rows="2" cols="4" name="Address" class="form-control" placeholder="Enter Address"></textarea>
    </div>
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
   <button type="submit" class="btn btn-warning" >Signup</button>
  </div>
</div>

</div>
    </div>
    </fieldset>
    </form>
    
  </div>

<div class="jumbotron text-center" style="margin-bottom:0;font-size: 20px ,background-color: #839fba!important";>
  <p>Footer</p>
</div>
	
</body>
</html>