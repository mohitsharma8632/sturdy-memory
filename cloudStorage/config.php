<?php

$dbServername = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "cloudstorage";

$conn = mysqli_connect($dbServername,$dbUsername,$dbPassword,$dbName);


return [
	'appUrl' => 'http://localhost/cloudStorage/',
	'basePath' => 'C:\xampp\htdocs\cloudStorage',
	'dirSeperator' => '\\',
	'uploadsDir' => 'uploads',
	'maxUploadPerUser' => 10,
	'maxUploadSize' => 1024,

];

// $config['basePath']. $config['uploads'] .$config['uploads'] . '\\' . fileName.pfps

// /uploadsDir + filename





include 'style.css';