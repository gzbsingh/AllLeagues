<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.*" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
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

<!------ Include the above in your HEAD tag ---------->


<link rel="stylesheet"
	href="https://bootswatch.com/4/simplex/bootstrap.min.css" />
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

<% int i=1; %>
<table class="table table-hover">

  <thead>
    <tr>
      <th>SN.</th>
      <th>Title</th>
      <th>Year</th>
       <th>Season</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${leagues}" var="league">
    <tr>
      <th scope="row"><%=i %></th>
      <td>${league.title}</td>
      <td>${league.year}</td>
      <td>${league.season}</td>
    </tr>
  </tbody>
  <% i++;%>
  </c:forEach>
</table>

</body>
</html>