<%@ page import="java.util.List, com.gqt.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <h2 class="text-center mb-4 text-primary">Student Records</h2>

    <!-- MESSAGE -->
    <%
    String msg = (String) session.getAttribute("msg");
    if(msg != null){
    %>
        <div class="alert alert-success text-center">
            <%= msg %>
        </div>
    <%
    session.removeAttribute("msg");
    }
    %>

    <!-- TABLE -->
    <table class="table table-bordered text-center">

        <tr class="table-dark">
            <th>ID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>City</th>
            <th>Course</th>
            <th>Amount</th>
        </tr>

        <%
        List<Student> slist = (List<Student>) request.getAttribute("studentList");

        if(slist != null){
            for(Student s1 : slist){
        %>

        <tr>
            <td><%= s1.getSid() %></td>
            <td><%= s1.getName() %></td>
            <td><%= s1.getGender() %></td>
            <td><%= s1.getCity() %></td>
            <td><%= s1.getCourse() %></td>
            <td><%= s1.getAmount() %></td>
        </tr>

        <%
            }
        } else {
        %>
        <tr>
            <td colspan="6">No records found</td>
        </tr>
        <%
        }
        %>

    </table>

    <!-- ONLY HOME BUTTON -->
    <div class="text-center mt-4">
        <a href="index.jsp" class="btn btn-success">Home</a>
        
    </div>

</div>

</body>
</html>