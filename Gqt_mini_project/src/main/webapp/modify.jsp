<!DOCTYPE html>
<html>
<head>
    <title>Modify Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5 text-center">

    <h2 class="text-primary">Modify Student</h2>

    <form action="UpdateStudent" method="post" class="mt-4">

        <input type="number" name="sid" 
               placeholder="Enter Student ID"
               required class="form-control w-50 mx-auto mb-3">

        <input type="text" name="name" 
               placeholder="Enter New Name"
               required class="form-control w-50 mx-auto mb-3">

        <button type="submit" class="btn btn-warning fw-bold">
            Update
        </button>

    </form>

    <br>

    <a href="DisplayRecord" class="btn btn-secondary">Back to Records</a>

</div>

</body>
</html>