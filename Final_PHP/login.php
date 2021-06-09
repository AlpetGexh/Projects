<?php 
$password_error="";
$user_error="";
$msg = "";
?>
<?php 
include('config.php');
include('login_procesing.php');
//Pasi te kyqemi nuk kemi nevoj te rikyqemi perseri
//nes Kyqeni me sukses shko ne index
if (isset($_SESSION['loggedIn']) && $_SESSION['loggedIn']==true) {
    header("Location:index.php");
}
?>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>

<!-- ------------ Meta ------------------ -->
 <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
 <meta charset="utf-8">

<!-- ------------ boostrap ------------------ -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<!-- ------------ Link ------------------ -->
<link rel="stylesheet" type="text/css" href="../Final_PHP/assets/css/login.css">
<link rel="stylesheet" type="text/css" href="../Final_PHP/assets/css/loading.css">
</head>
<body>

<!-- ------------ Boostrap ------------------ -->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<!-- ------------ Jquery JS ------------------ --> 
<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>

<!-- ------------ Forma per Login ------------------ -->
    <div id="login">
    <div class="container mt-5">
    <div id="login-row" class="row justify-content-center align-items-center">
    <div id="login-column" class="col-md-6">
    <div id="login-box" class="col-md-12">
     <form action="#" method="post" id="login-form" class="form" >
       <h3 class=" text-center text-info" >Kyquni</h3>
        <div class="form-group">
        <?php
        if (!empty($msg)){
        echo '<p class="error"> '.$msg.' </p>';    
        }
        //Errori nese usernamei nuk egziston
       if (!empty($user_error)){
        echo '<p class="error"> '.$user_error.' </p>';    
        }
        //Errori nese passwordi edhe gabim
       if (!empty($password_error)){
        echo '<p class="error"> '.$password_error.'</p>';
        }
         ?>
        <label for="username" class="text-info fas fa-user">Username:</label><br>
          <input type="text" name="username" id="username" class="form-control" required="" placeholder="Username" autofocus="" oninvalid="this.setCustomValidity('Ju lutem shkruani usernamin');" oninput="this.setCustomValidity('');">
        </div>
         <div class="form-group">
          <label for="password" class="text-info fas fa-key">Password:</label><br>
         <input type="password" name="password" id="password" class="form-control" required="" placeholder="Password" oninvalid="this.setCustomValidity('Ju lutem shkruani passwordin');" oninput="this.setCustomValidity('');">
           </div>
         <div class="form-group">
                         
    <input type="submit" id="submit" name="submit" class="btn btn-info btn-md" value="submit">
        </div><br>
 <div id="register-link" class="text-right">
           <a href="register.php" class="reg_link">Regjistrohu</a>
           <a href="forgotPassword.php" class="forgot_link">Harruat passwordin</a>
 </div>
 </form>
 </div>
 </div>
 </div>
 </div>
</div>  
<div class="loader loader-default" data-text="Duke u Kyqur"></div>
    <script>
        $(document).ready(function(){
            $('#submit').click(function(){
                if (($('#username').val().length !== 0) && ($('#password').val().length !== 0)){
                    $( ".loader" ).addClass("is-active");}
              });
              });
    </script>
</body>
</html>
