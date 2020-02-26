<?php

if (isset($_POST['submit'])) {
	

	include_once '../config.php';

	$first = mysqli_real_escape_string($conn, $_POST['first']);
	$last = mysqli_real_escape_string($conn, $_POST['last']);
	$email = mysqli_real_escape_string($conn, $_POST['email']);
	$uid = mysqli_real_escape_string($conn, $_POST['uid']);
	$pwd = mysqli_real_escape_string($conn, $_POST['pwd']);

	//error handler

	// check for empty feild
	if (empty($first) || empty($last) || empty($email) || empty($uid) || empty($pwd)) {
		header("Location: ../signup.php?signup=empty");
		exit();
	}else{
		//chech if inputs characters are valid
		if (!preg_match("/^[a-zA-Z]*$/", $frist) || !preg_match("/^[a-zA-Z]*$/", $last)) {
			header("Location: ../signup.php?signup=Invalid");
			exit();
		}else{
			// check if email is valid
			if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
				header("Location: ../signup.php?signup=email");
				exit();
			}else{
				$sql="SELECT * FROM users WHERE UserUid='$uid";
				$result = mysqli_query($conn, $sql);
				$resultCheck = mysqli_num_rows($result);

				if ($result>0) {
					header("Location: ../signup.php?signup=UsernameAlreadyTaken");
					exit();
				}else{
					//hashing the password
					$hashedPwd = password_hash($pwd, PASSWORD_DEFAULT);
					//Insert the user into the datebase
					$sql = "INSERT INTO users (userFirstName,userLastName,email,userUid,userPwd) VALUES ('$first','$last','$email','$uid','$hashedPwd');";
					mysqli_query($conn, $sql);
					header("Location: ../signup.php?signup=sucess");
					exit();
				}
			}
		}
	}
}
else{
	header("Location: ../signup.php");
	exit();
}