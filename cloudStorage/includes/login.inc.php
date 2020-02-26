<?php
session_start();
if (isset($_POST['submit'])) {
	include '../config.php';

	$uid = mysqli_real_escape_string($conn, $_POST['uid']);
	$pwd = mysqli_real_escape_string($conn, $_POST['pwd']);

	//error hendler

	//check if input are empty
	if (empty($uid) || empty($pwd)) {
		header("Location: ../index.php?login=empty");
		exit();
	}else{
		$sql = "SELECT * FROM users WHERE userUid='$uid'";
		$result = mysqli_query($conn, $sql);
		$resultCheck = mysqli_num_rows($result);
		if ($resultCheck < 1) {
			header("Location: ../index.php?login=noresult");
			exit();
		}else{
			if ($row = mysqli_fetch_assoc($result)) {
				//Dehashing the password
				$hashedPwdCheck = password_verify($pwd, $row['userPwd']);

				if ($hashedPwdCheck == false) {
					header("Location: ../index.php?login=passfail");
					exit();
				}elseif ($hashedPwdCheck == true) {
					//Login the user here


					$_SESSION['u_id'] = $row['userId'];
					$_SESSION['u_first'] = $row['userFirstName'];
					$_SESSION['u_last'] = $row['userLastName'];
					$_SESSION['u_email'] = $row['email'];
					$_SESSION['u_uid'] = $row['userUid'];

					var_dump($_SESSION);
					header("Location: ../index.php?login=success");

					exit();
				}
			}
		}
	}
}else{
	header("Location: ../index.php?login=parameter");
	exit();

}