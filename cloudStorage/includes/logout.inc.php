<?php
// remove all session variables
//session_unset();
// destroy the session 

include_once '../config.php';
include_once '../views/master.view.php';
 


 if (isset($_POST['submit'])) {
 	// $_SESSION = [];

 	session_start();
 	session_destroy();
// 	$_SESSION = [];
	header("Location: ../index.php");
 }
?>
