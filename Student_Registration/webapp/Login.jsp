<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


<style>
    .cascading-right {
      margin-right: -50px;
    }

    @media (max-width: 991.98px) {
      .cascading-right {
        margin-right: 0;
      }
    }
  </style>
</head>
<body>
<!-- Section: Design Block -->

<section class="text-center text-lg-start">
  

  <!-- Jumbotron -->
  <div class="container py-2">
    <div class="row g-0 align-items-center">
      <div class="col-lg-6 mb-5 mb-lg-0">
        <div class="card cascading-right" style="
            background: hsla(0, 0%, 100%, 0.55);
            backdrop-filter: blur(30px);
            ">
          <div class="card-body p-5 shadow-5 text-center">
            <h2 class="fw-bold mb-5">Login Here</h2>
            <form method="post" action="Login">
              <!-- 2 column grid layout with text inputs for the first and last names -->
             

              <!-- Email input -->
              <div class="form-outline mb-4">
                <input type="email" name="email1" class="form-control" />
                <label class="form-label"  for="form3Example3">Email address</label>
              </div>

              <!-- Password input -->
              <div class="form-outline mb-4">
                <input type="password" name="pass1" class="form-control" />
                <label class="form-label" for="form3Example4">Password</label>
              </div>

              <!-- Checkbox -->
              <div class="form-check d-flex justify-content-center mb-4">
                <input class="form-check-input me-2" type="checkbox" value="" id="form2Example33" checked />
                <label class="form-check-label" for="form2Example33">
                  Subscribe to our newsletter
                </label>
              </div>

              <!-- Submit button -->
              <button type="submit" class="btn btn-primary btn-block mb-4" >
                Sign up
              </button>

              <!-- Register buttons -->
                 <div class="text-center text-lg-start mt-4 pt-2">
            
            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="signin.jsp"
                class="link-danger">Register</a></p>
                 <a href="forget.jsp" class="text-body">Forgot password?</a>
                
              
           
          </div>
            </form>
          </div>
        </div>
      </div>

      <div class="col-lg-6 mb-5 mb-lg-0">
        <img src="https://mdbootstrap.com/img/new/ecommerce/vertical/004.jpg" class="w-100 rounded-4 shadow-4"
          alt="" height="600px" width="150px"/>
      </div>
    </div>
  </div>
  <!-- Jumbotron -->
</section>

<!-- Section: Design Block --></body>

</html>