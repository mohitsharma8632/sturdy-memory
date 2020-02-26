<header>
	<nav>
		<div class="main-wrapper">
			<ul>
				<li>
					<a href="index.php">Online Storage</a>
				</li>
			</ul>
			<div class="nav-login">
				<?php if( ! isset($_SESSION['u_id']) ) { ?>
				<form action="includes/login.inc.php" method="POST">
					<input type="text" name="uid" placeholder="e-mail/Username">
					<input type="password" name="pwd" placeholder="password">
					<button type="submit" name="submit">Login</button>
				</form>
				<a href="signup.php">Sign up</a>
				<?php } else { ?>
				<span>Welcome <?php echo $_SESSION['u_first'] ?></span> |
				<form action="./includes/logout.inc.php" method="POST">
					<button type="submit" name="submit">Logout</button>
				</form>
				<?php } ?>
			</div>
		</div>
	</nav> 
</header>