<?php
	$config = include 'config.php';
	session_start();
	set_include_path($config['basePath']);
	// include_once ''
	include_once('./views/master.view.php');
?>