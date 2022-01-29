<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="ISO-8859-1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
    crossorigin="anonymous">
    <title>Home</title>
  </head>
  <body>
  
  <div class="container">
  		<div class="card mx-auto mt-5 bg-secondary" style="width: 28rem; height:14rem;" >
  		<h3 class="text-center text-white mt-3" style="text-transform:uppercase">My Search</h3>
  		<form action="search" class="mt-2 mx-5">
        <input class="form-control" type="search" name="query" placeholder="Search" aria-label="Search">
        <div class="container text-center mt-3">
        	<button class="btn btn-success" type="submit">Search</button>
        </div>
      </form>
  		</div> 
  </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
    crossorigin="anonymous"></script>
  </body>
</html>