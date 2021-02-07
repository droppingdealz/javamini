</html>
<html lang="en">
<head>
<title>Index Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.">
<link rel="stylesheet"
	href="webjars/bootstrap/4.5.3/css/bootstrap.min.css">
<script src="webjars/bootstrap/4.5.3s/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<a href="<%=request.getContextPath()%>/userController/list" class="btn ">View Courses</a>



	<!--Inline CSS -->
	<style>
.card {
	width: 18rem;
	padding: 3%;
	padding-top: 5%;
	margin-top: 7%;
	margin-bottom: 5%;
	margin-left: 5%;
	margin-right: 5%;
}
.btn {
	background-color: 60c7c1
}
</style>

	<div class="container">
		<!--Card structure to be added between 'for each' loop for dynamic addition of Category  -->
		<!-- Category Card. -->
		<div class="row">
			<!-- Card -->
			<div class="col">
				<div class="card">
					<!-- Inserting Category image url in 'src'  -->
					<img class="card-img-top" src="engineering.jpg"
						alt="Card image cap">
					<div class="card-body">
						<!-- Inserting Category name in title -->
						<h5 class="card-title" align="centre">Engineering</h5>
						<a href="<%=request.getContextPath()%>/CoursesController/lists" class="btn ">View Courses</a>

					</div>
				</div>
			</div>

			<!-- Card -->
			<div class="col">
				<div class="card">
					<!-- Inserting Category image url in 'src'  -->
					<img class="card-img-top" src="engineering.jpg"
						alt="Card image cap">
					<div class="card-body">
						<!-- Inserting Category name in title -->
						<h5 class="card-title" align="centre">Engineering</h5>
						<a href="courses.jsp" class="btn btn-primary">View Courses</a>

					</div>
				</div>
			</div>

			<!-- Card -->
			<div class="col">
				<div class="card">
					<!-- Inserting Category image url in 'src'  -->
					<img class="card-img-top" src="engineering.jpg"
						alt="Card image cap">
					<div class="card-body">
						<!-- Inserting Category name in title -->
						<h5 class="card-title" align="centre">Engineering</h5>
						<a href="courses.jsp" class="btn btn-primary">View Courses</a>

					</div>
				</div>
			</div>

			<!-- Card -->
			<div class="col">
				<div class="card">
					<!-- Inserting Category image url in 'src'  -->
					<img class="card-img-top" src="engineering.jpg"
						alt="Card image cap">
					<div class="card-body">
						<!-- Inserting Category name in title -->
						<h5 class="card-title" align="centre">Engineering</h5>
						<a href="courses.jsp" class="btn btn-primary">View Courses</a>

					</div>
				</div>
			</div>


		</div>
	</div>
</body>
</html>