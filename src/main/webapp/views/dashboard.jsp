<!DOCTYPE html>
<html>
<head>
    <title>User Dashboard</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">User Dashboard</a>
    </nav>

    <div class="container mt-5">
        <h2>Profile Details</h2>
        <p>Name: mano<%= request.getAttribute("name") %></p>
        <p>Email:<%= request.getAttribute("email") %></p>
        <p>Age: sf<%= request.getAttribute("age") %></p>
        <p>Country:india <%= request.getAttribute("country") %></p>
    </div>

    <!-- Include Bootstrap JS (Optional) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
