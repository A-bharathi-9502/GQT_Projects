<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5 text-center">

    <h2 class="text-danger">Delete Student</h2>

    <!-- MESSAGE -->
    <%
    String msg = (String) session.getAttribute("msg");
    if(msg != null){
    %>
        <div class="alert alert-info">
            <%= msg %>
        </div>
    <%
    session.removeAttribute("msg");
    }
    %>

    <!-- DELETE FORM -->
    <form action="DeleteStudent" method="get">

        <input type="text" name="sid" 
               placeholder="Enter Student ID to Delete"
               required class="form-control w-50 mx-auto mb-3">

        <button type="submit" class="btn btn-danger">
            Delete
        </button>

    </form>

    <br>

    <a href="DisplayRecord" class="btn btn-secondary">View Records</a>
    <a href="index.jsp" class="btn btn-success">Home</a>

</div>

</body>
</html>