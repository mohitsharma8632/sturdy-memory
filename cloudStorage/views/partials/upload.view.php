<?php 
	

if(  isset($_SESSION['u_id']) ) { ?>
	<!--file upload here-->
	<form action="views/pages/uploadFile.php" method="post" enctype="multipart/form-data">
    Select image to upload:
    <input type="file" name="fileToUpload" id="fileToUpload">
    <input type="submit" value="Upload Image" name="submit">
</form>
	<?php }
?>