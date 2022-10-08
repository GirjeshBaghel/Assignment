<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title> Registration Page</title>

<!-- Font Icon -->
<link rel="stylesheet" href="style.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<script>
	function sub()
	{
		alert("Data Saved Successfully");		
	}
	</script>
</head>
<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title"> Student Register </h2>
					
						<form method="post" action="ser1_demo" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="id"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="id" id="name" placeholder="Your Id" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-email"></i></label> <input
									type="password" name="password" id="email" placeholder="Your Password" />
							</div>
							<div class="form-group">
								<label for="gender"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="gender" id="pass" placeholder="Your Gender" />
							</div>
							<div class="form-group">
								<label for="cource"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="cource" id="re_pass" placeholder="Your Cources" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Submit"  onclick="sub()" />
									
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="Images/imgreg.jpg" alt="sing up image">
						</figure>
						
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	
	



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>