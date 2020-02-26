<?php 
	$page = $_GET['page'] ?? 'home';
	$pagePath = sprintf('pages/%s.view.php', $page);
	$filePath = get_include_path() . '/views/' . $pagePath;
	if(! file_exists($filePath)) {
		$pagePath = 'pages/404.view.php';
	}
?>

<!DOCTYPE html>
<html>
<head>
	<title>Could Storage</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<?php include_once('partials/header.view.php'); ?>
	<div class="container">
	<?php include_once($pagePath); ?>
	</div>
	<?php include_once('partials/footer.view.php'); ?>
	<?php include_once('partials/upload.view.php');?>
</body>
</html>