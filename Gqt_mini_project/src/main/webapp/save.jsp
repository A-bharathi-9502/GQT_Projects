<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Home Page</title> 

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body { background-color: lightblue; }
</style>

</head>
<body>

<p class="display-2 text-primary text-center m-5">
    Student Registration Successful!
</p>

<div class="container text-center">

    <div class="row justify-content-center">
        <div class="col-md-3">
            <a href="index.jsp" 
               class="d-block m-3 p-4 bg-danger text-white fw-bold fs-5 rounded-4 text-decoration-none shadow-lg">
               Add New Student
            </a>
        </div>

        <div class="col-md-3">
            <a href="DisplayRecord" 
               class="d-block m-3 p-4 bg-success text-white fw-bold fs-5 rounded-4 text-decoration-none shadow-lg">
               Display Students
            </a>
        </div>
    </div>

    <div class="row justify-content-center">
        <div class="col-md-3">
            <a href="modify.jsp" 
               class="d-block m-3 p-4 bg-warning text-dark fw-bold fs-5 rounded-4 text-decoration-none shadow-lg">
               Modify Student
            </a>
        </div>

        <div class="col-md-3">
            <a href="delete.jsp" 
               class="d-block m-3 p-4 bg-dark text-white fw-bold fs-5 rounded-4 text-decoration-none shadow-lg">
               Delete Student
            </a>
        </div>
    </div>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
