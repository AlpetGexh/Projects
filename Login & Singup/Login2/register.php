<?php
$username_error = "";
$email_error = "";
$msg = "";

//include
include('config.php');
include('server.php');

?>

<!DOCTYPE html>
<html>

<head>

  <title>Regjistrimi</title>

  <!-- ------------ Foto per title bar ------------------ -->>

  <!-- ------------ Foto per title bar ------------------ -->
  <link rel="shortcut icon" type="image/x-icon" href="img/Killerlogo.jpg">

  <!-- ------------ Meta ------------------ -->
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta charset="utf-8">

  <!-- ------------ Boostrap css------------------ -->
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

  <!-- ------------ Links ------------------ -->
  <link rel="stylesheet" type="text/css" href="assets/css/register.css">
  <link rel="stylesheet" type="text/css" href="assets/css/loading.css">

</head>

<body>

  <!-- ------------ Boostrap JS------------------ -->
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <!-- ------------ jQuery------------------ -->

  <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>

  <!-- ------------ Jquery ------------------ -->
  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="assets/js/function.js"></script>
  <!-- ------------ Forma per Regjistrim ------------------ -->

  <style type="text/css">
    .reg_link {
      display: flex;
      flex-direction: row;
      flex-wrap: wrap;
      justify-content: flex-end;
    }

    .showpassword {
      padding-left: 20px;

    }
  </style>

  <div id="login">
    <div class="container mt-5">
      <div id="login-row" class="row justify-content-center align-items-center">
        <div id="login-column" class="col-md-6">
          <div id="login-box" class="col-md-12">
            <form id="login-form" class="form" action="#" method="post">
              <h3 class="text-center text-info">Regjistrohu</h3>
              <?php

              //Errori nese jipet njÃ« username qe ekziston

              if (!empty($username_error)) {

                echo '<p class="form_error"> ' . $username_error . ' </p>';
              }

              //Errori nese jiper njÃ« email qÃ« ekziston  

              if (!empty($email_error)) {

                echo '<p class="form_error"> ' . $email_error . '</p>';
              }

              if (!empty($msg)) {

                echo '<p class="form_error"> ' . $msg . '</p>';
              }

              ?><br>
              <div class="row">
                <div class="col-xs-12 col-sm-6 col-md-6">
                  <div class="form-group">
                    <label for="emri" class="text-info">Emri:</label><br>
                    <input type="text" name="emri" id="emri" class="form-control" placeholder="Emri" autofocus="" required="" oninvalid="this.setCustomValidity('Ju lutem shkruani emrin');" oninput="this.setCustomValidity('');">
                  </div>
                </div>

                <div class="col-xs-12 col-sm-6 col-md-6">
                  <div class="form-group">
                    <label for="mbiemri" class="text-info">Mbiemri:</label><br>
                    <input type="text" name="mbiemri" id="mbiemri" class="form-control" placeholder="Mbiemri" required="" oninvalid="this.setCustomValidity('Ju lutem shkruani mbiemrin');" oninput="this.setCustomValidity('');">
                  </div>
                </div>
              </div>

              <div class="form-group">
                <label for="username" class="text-info">Username:</label><br>
                <input type="text" name="username" id="username" class="form-control" placeholder="Username" required="" oninvalid="this.setCustomValidity('Ju lutem shkruani usernamin');" oninput="this.setCustomValidity('');">
              </div>

              <div class="form-group">
                <label for="email" class="text-info">Email:</label><br>
                <input type="email" name="email" id="email" class="form-control" placeholder="Email" required="" oninvalid="this.setCustomValidity('Ju lutem shkruani emailin');" oninput="this.setCustomValidity('');">
              </div>

              <div class="form-group">
                <label for="password" class="text-info">Password:</label><br>
                <input type="password" name="password" id="password" class="form-control" placeholder="Password" required="" oninvalid="this.setCustomValidity('Ju lutem shkruani passwordin');" oninput="this.setCustomValidity('');">
              </div>

              <div class="form-group">
                <label for="password" class="text-info">Rishruaj Password:</label><br>
                <input type="password" name="c_password" id="c_password" class="form-control" placeholder="Rishruaj passwordin" required="" oninvalid="this.setCustomValidity('Ju lutem rishkruani passwordin');" oninput="this.setCustomValidity('');">
                <div class="showpassword">
                  <input type="checkbox" class="form-check-input" id="show_password"><label class="text-info">Shiko passwordin</label>
                </div>
              </div>

              <div class="form-group">
                <input type="submit" name="register_submit" id="register_submit" class="btn btn-info btn-md" value="submit">
              </div>
              <a href="login.php" class="reg_link">Login</a>
          </div>
          </form>
        </div>
      </div>
    </div>
  </div>


  <br> <br>
  </div>
  <div class="loader loader-default" data-text="Duke u Regjistriar"></div>
</body>