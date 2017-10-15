<!DOCTYPE html>
<html lang="en">
<%@include file="header.jsp"%>
	<style>
	body{
    background-color: #525252;
}
.centered-form{
	margin-top: 60px;
}

.centered-form .panel{
	background: rgba(255, 255, 255, 0.8);
	box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}

  body {
    pupdateing-top: 90px;
}
.panel-update {
	border-color: #ccc;
	-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
	-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
	box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
}
.panel-update>.panel-heading {
	color: #00415d;
	background-color: #fff;
	border-color: #fff;
	text-align:center;
}
.panel-update>.panel-heading a{
	text-decoration: none;
	color: #666;
	font-weight: bold;
	font-size: 15px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}
.panel-update>.panel-heading a.active{
	color: #029f5b;
	font-size: 18px;
}
.panel-update>.panel-heading hr{
	margin-top: 10px;
	margin-bottom: 0px;
	clear: both;
	border: 0;
	height: 1px;
	background-image: -webkit-linear-gradient(left,rgba(0, 0, 0, 0),rgba(0, 0, 0, 0.15),rgba(0, 0, 0, 0));
	background-image: -moz-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
	background-image: -ms-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
	background-image: -o-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
}
.panel-update input[type="text"],.panel-update input[type="email"],.panel-update input[type="password"] {
	height: 45px;
	border: 1px solid #ddd;
	font-size: 16px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}
.panel-update input:hover,
.panel-update input:focus {
	outline:none;
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
	box-shadow: none;
	border-color: #ccc;
}
.btn-update {
	background-color: #59B2E0;
	outline: none;
	color: #fff;
	font-size: 14px;
	height: auto;
	font-weight: normal;
	pupdateing: 14px 0;
	text-transform: uppercase;
	border-color: #59B2E6;
}
.btn-update:hover,
.btn-update:focus {
	color: #fff;
	background-color: #53A3CD;
	border-color: #53A3CD;
}
</style>
<body>

<div class="jumbotron">
  <div class="container text-center">
	<img src="./resource/images/logo1.jpg" class="img-rounded" alt="NIIT" width="200" height="120">
    <h1>NIIT E-Commerce Store</h1>      
    <p>Welcome to the Home of all things NIIT </p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><img src="./resource/images/Capture.jpg" class="img-rounded" alt="NIIT" width="40" height="30"> </a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="stock">Home</a></li>
		<li><a href="add"><span class="glyphicon glyphicon-plus">Add</a></li>
		<li class="active"><a href="update"><span class="glyphicon glyphicon-pencil">Update</a></li>
		<li><a href="delete"><span class="glyphicon glyphicon-trash">Delete</a></li>
        <li><a href="view"><span class="glyphicon glyphicon-list-alt">My Products</a></li>
		
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="orders"><span class="glyphicon glyphicon-tasks"></span>My Orders<span class="badge">2</span> </a></li>
        <li><a href="myhome"><span class="glyphicon glyphicon-log-out"></span>LogOut</a></li>
	</ul>
    </div>
  </div>
</nav>
<div class="container">
    	<div class="row">
			<div class="col-lg-12">
				
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<a href="#" class="active" >Update Products</a>
							</div>
						</div>
					</div>	
					<div class="panel-body">
    	<div class="row">
			<div class="col-md-6 col-sm-offset-3">
						<form id="update" action="update" method="POST" role="form" style="display: block;">
									
									<div class="form-group">
										<input type="text" name="id" id="id" tabindex="1" class="form-control" placeholder="Product Id  Ex:'P_xxx'" >
									</div>
									<div class="form-group">
										<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Product Name" >
									</div>
									<div class="form-group">
										<input type="text" name="desc" id="desc" tabindex="1" class="form-control" placeholder="Description" >
									</div>
									<div class="form-group">
										<input type="text" name="stock" id="stock" tabindex="1" class="form-control" placeholder="Stock" >
									</div>
									<div class="form-group">
										<input type="text" name="price" id="price" tabindex="1" class="form-control" placeholder="Price">
									</div>
													
																
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6">
												<input type="submit" name="update-submit" id="update-submit" tabindex="4" class="form-control btn btn-update" value="Update">
											</div>
											
										</div>
									</div>
								</form>
</div>
</div>
</div></div>
</div>
</div>

<%@include file="footer.jsp"%>

</body>
</html>