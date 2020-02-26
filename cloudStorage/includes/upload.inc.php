<?php
include_once '../config.php';
$target_path = "e:/";  
$target_path = $target_path.basename( $_FILES['fileToUpload']['name']);

if (isset($_POST['submit'])){

}else{
    echo "Sorry, file not uploaded, please try again!";  
	exit();
}
//$sql = "INSERT INTO files (filePath) VALUES ('');";