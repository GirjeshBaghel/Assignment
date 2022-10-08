<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style> 
.divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
</style>
</head>
<body>
<section class="vh-100">
  <div class="container py-5 h-100">
    <div class="row d-flex align-items-center justify-content-center h-100">
      <div class="col-md-8 col-lg-7 col-xl-6">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
          class="img-fluid" alt="Phone image">
      </div>
      
      <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
      <h2 class="form-title">Forgot Password</h2>
        <form method="post"  action="forget">
          <!-- Email input -->
          <div class="form-outline mb-3">
            <input type="email" name="email" id="form1Example13" class="form-control form-control-lg" />
            <label class="form-label" for="form1Example13">Email address</label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-4">
            <input type="password" id="form1Example23" class="form-control form-control-lg" />
            <label class="form-label" for="form1Example23"> New Password</label>
          </div>
          <!-- Password input -->
          <div class="form-outline mb-4">
            <input type="password"  name="pass" id="form1Example23" class="form-control form-control-lg" />
            <label class="form-label" for="form1Example23">Confirm Password</label>
          </div>


          <!-- Submit button -->
          <button type="submit" class="btn btn-primary btn-lg btn-block">Save Password</button>

        </form>
      </div>
    </div>
  </div>
</section>
</body>
</html>