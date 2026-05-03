<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>GQT | Student Registration</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Indie+Flower&family=Dancing+Script&display=swap" rel="stylesheet">

    <!-- Animate CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    
    <style>
        * { margin:0; padding:0; box-sizing:border-box; }
        h2 { 
            font-weight:bold; letter-spacing:10px; font-size:30px; 
            border-radius:20px 0 20px 0; animation: bg-color 20s infinite linear; 
        }
        @keyframes bg-color {
            0% { background-color:black; color:yellow; }
            25% { background-color:darkred; color:white; }
            50% { background-color:blueviolet; color:bisque; }
            75% { background-color:yellow; color:black; }
            100% { background-color:teal; color:red; }
        }
        .bg-info-custom { background: linear-gradient(45deg, teal, pink, darkslategray); }
        input:hover { box-shadow: 0 0 15px darkslategray; border: 3px solid blue; }
    </style>
</head>
<body>
    <div class="col-12">
        <h2 class="text-center"><marquee>Welcome to GQT</marquee></h2>
    </div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 bg-info-custom p-4 animate__animated animate__backInRight"" style="box-shadow:0 0 15px black; min-height: 540px;">
                <p class="display-6 fw-bold text-center mb-0" style="font-family:serif;">Students Registration</p>
                <hr>
                
                <form action="SaveRecord" method="get">
                    <div class="form-floating mb-3">
                        <input type="text" name="sid" id="Sid" class="form-control" placeholder="ID" required>
                        <label for="Sid">Student Id</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="text" name="fn" id="fn" class="form-control" placeholder="Name" required>
                        <label for="fn">Student Name</label>
                    </div>
                    <div class="mb-3">
                        <select name="gender" class="form-select" required>
                            <option value="">--select gender--</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <select name="city" class="form-select" required>
                            <option value="">--select city--</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Bangalore">Bangalore</option>
                            <option value="Pune">Pune</option>
                            <option value="kadapa">Kadapa</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <select name="course" id="course" class="form-select" required>
                            <option value="">--select course--</option>
                            <option value="Java Full Stack">Java Full Stack</option>
                            <option value="Python Full Stack">Python Full Stack</option>
                            <option value="Testing">Testing</option>
                            <option value="MySQL">MySQL</option>
                            <option value="Data Science">Data Science</option>
                            <option value="Data Analytics">Data Analytics</option>
                        </select>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="text" name="amount" id="amount" class="form-control" value="0" readonly>
                        <label for="amount">Amount to be Paid</label>
                    </div>
                    <div class="d-grid gap-2">
                        <input type="submit" value="REGISTER" class="btn btn-outline-dark fw-bold">
                    </div>
                </form>
                <div class="text-center mt-4">
                    <a href="save.jsp" class="btn btn-primary me-2">Operations</a>
                    
                </div>
                
            </div>

            <div class="col-md-8 px-0">
               <img src="https://images.pexels.com/photos/33827334/pexels-photo-33827334.jpeg" 
     alt="Office Image" 
     height="540px" 
     width="100%" 
     style="object-fit: cover;">
            </div>
        </div>
    </div>

    <script>
        const courseBox = document.querySelector("#course");
        const amountBox = document.querySelector("#amount");

        courseBox.addEventListener("change", function() {
            let val = courseBox.value;
            if (val === "Java Full Stack") amountBox.value = 35000;
            else if (val === "Python Full Stack") amountBox.value = 32000;
            else if (val === "Testing") amountBox.value = 17000;
            else if (val === "MySQL") amountBox.value = 12000;
            else if (val === "Data Science") amountBox.value = 48000;
            else if (val === "Data Analytics") amountBox.value = 23000;
            else amountBox.value = 0;
        });
    </script>
</body>
</html>