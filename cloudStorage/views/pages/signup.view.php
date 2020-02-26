<?php
	include_once '../master.view.php';
?>
<link rel="stylesheet" type="text/css" href="../../style.css">
<section class="main-container">
	<div class="main-wrapper">
		<h2>Sign Up</h2>
		<form class="signup-form" action="includes/signup.inc.php" method="POST">
			<input type="text" name="first" placeholder="First Name">
			<input type="text" name="last" placeholder="Last Name">
			<input type="text" name="email" placeholder="E-mail">
			<input type="text" name="uid" placeholder="Username">
			<input type="Password" name="pwd" placeholder="Password">
			<button type="submit" name="submit">Sign Up</button>
		</form>
	</div>
</section>