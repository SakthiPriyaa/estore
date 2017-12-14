<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
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
    padding-top: 90px;
}
.panel-add {
	border-color: #ccc;
	-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
	-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
	box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
}
.panel-add>.panel-heading {
	color: #00415d;
	background-color: #fff;
	border-color: #fff;
	text-align:center;
}
.panel-add>.panel-heading a{
	text-decoration: none;
	color: #666;
	font-weight: bold;
	font-size: 15px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}
.panel-add>.panel-heading a.active{
	color: #029f5b;
	font-size: 18px;
}
.panel-add>.panel-heading hr{
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
.panel-add input[type="text"],.panel-add input[type="email"],.panel-add input[type="password"] {
	height: 45px;
	border: 1px solid #ddd;
	font-size: 16px;
	-webkit-transition: all 0.1s linear;
	-moz-transition: all 0.1s linear;
	transition: all 0.1s linear;
}
.panel-add input:hover,
.panel-add input:focus {
	outline:none;
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
	box-shadow: none;
	border-color: #ccc;
}
.btn-add {
	background-color: #59B2E0;
	outline: none;
	color: #fff;
	font-size: 14px;
	height: auto;
	font-weight: normal;
	padding: 14px 0;
	text-transform: uppercase;
	border-color: #59B2E6;
}
.btn-add:hover,
.btn-add:focus {
	color: #fff;
	background-color: #53A3CD;
	border-color: #53A3CD;
}
</style>
<body>
<%@include file="navbar.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
    	<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-add">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<a href="#" class="active" >Add Products</a>
							</div>
						</div>
					</div>	
					<div class="panel-body">
    	<div class="row">
			<div class="col-md-6 col-sm-offset-3">
						<form id="add"  action="addproduct" method="POST" role="form" style="display: block;" >
																		
									<div class="form-group">
										<select   class="form-control" name="sid" id="sid" tabindex="1" >
										<option value="" disabled selected> Select Supplier Name</option>
										<c:forEach items="${supplier}" var="sup">
      									<option value="${sup.id}">${sup.name}</option>
										</c:forEach>
    									</select>
									
									</div>
									<div class="form-group">
										<input type="text" name="pname" id="pname" tabindex="1" class="form-control" placeholder="Product Name" >
									</div>
									<div class="form-group">  
 										 <select  name="cid" class="form-control" id="cid" tabindex="1" > 										 										
    									<option value="" disabled selected>Select Product Category</option>										
    									<c:forEach items="${categories}" var="cat">
      									<option value="${cat.cid}">${cat.cname}</option>
										</c:forEach>
    									</select>
    								</div>
								
									<div class="form-group">
										<input type="text" name="pdesc" id="pdesc" tabindex="1" class="form-control" placeholder="Description" >
									</div>
									<div class="form-group">
										<input type="text" name="pstock" id="pstock" tabindex="1" class="form-control" placeholder="Stock" >
									</div>
									<div class="form-group">
										<input type="text" name="pprice" id="pprice" tabindex="1" class="form-control" placeholder="Price">
									</div>
									<div class="form-group">
										<input type="file" name="pimg" id="pimg" tabindex="1" class="form-control" placeholder="Image">
										
									</div>
													
																
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6">
												<input type="submit" name="add-submit" id="add-submit" tabindex="4" class="form-control btn btn-add" value="Add Product">
											</div>
											
										</div>
									</div>
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								</form>
</div>
</div>
</div></div></div>
</div>
<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-add">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<a href="#" class="active" >Add Category</a>
							</div>
						</div>
					</div>	
					<div class="panel-body">
    	<div class="row">
			<div class="col-md-6 col-sm-offset-3">
						<form id="add" action="addcategory" method="POST" role="form" style="display: block;" >
									
									
									<div class="form-group">
										<input type="text" name="cname" id="cname" tabindex="1" class="form-control" placeholder="Category Name" >
									</div>
									<div class="form-group">
										<input type="text" name="cdesc" id="cdesc" tabindex="1" class="form-control" placeholder="Description" >
									</div>
									
													
																
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6">
												<input type="submit" name="add-submit" id="add-submit" tabindex="4" class="form-control btn btn-add" value="Add Category">
											</div>
											
										</div>
									</div>
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								</form>
</div>
</div>
</div></div></div>
</div>
<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-add">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<a href="#" class="active" >Add Supplier</a>
							</div>
						</div>
					</div>	
					<div class="panel-body">
    	<div class="row">
			<div class="col-md-6 col-sm-offset-3">
						<form id="add"  action="addsupplier" method="POST" role="form" style="display: block;" >
									
									
									<div class="form-group">
										<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Supplier Name" >
									</div>
									<div class="form-group">
										<input type="text" name="address" id="address" tabindex="1" class="form-control" placeholder="Address" >
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email" >
									</div>
									<div class="form-group">
										<input type="text" name="contact" id="contact" tabindex="1" class="form-control" placeholder="Contact" >
									</div>
									
																				
																
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6">
												<input type="submit" name="add-submit" id="add-submit" tabindex="4" class="form-control btn btn-add" value="Add Supplier">
											</div>
											
										</div>
									</div>
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								</form>
</div>
</div>
</div></div></div>
</div>
</div>

<%@include file="footer.jsp"%>

</body>
</html>