<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
<%@include file="header.jsp"%>
<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<body>

<%@include file="supplierheader.jsp"%>
 <div class="row" ><h3>Product Description</h3>
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading" >${product.pname}</div>
        <div class="panel-body"><img src="./resource/images/${product.pimg}" class="img-responsive" style="width:100%" height="auto" ></div>
        <div class="panel-footer">Price:${product.pprice}</div>
			</div>
    </div>
	<div class="col-sm-8">
	<div class="panel panel-primary">
        <div class="panel-heading">   Product Description</div>
        <div class="panel-body"><table class="table table-striped">
		<tr><td>Product ID</td><td>${product.pid}</td></tr>
		<tr><td>Description:</td><td>${product.pdesc}<!-- "A journey across space to discover the source of the Neucromorph outbreak" --></td></tr>
		<tr><td>Stock:</td><td>${product.pstock }</td></tr>
		<tr><td>Price:</td><td>${product.pprice}</td></tr>
		</table></div>
       <%--  <div class="panel-footer"><a href="update?id=${p.pid}" method="GET" role="button" class="btn btn-warning btn-sm btn-block">Edit Item<span class="glyphicon glyphicon-shopping-cart"></span>
						</div></a> --%>
	</div>
	<div class="col-sm-offset-5 col-centered"><a href="stock"
			role="button" class="btn btn-success btn-sm btn-block">
	<span class="glyphicon glyphicon-share-alt"></span>Back to Home
	</a></div>
      
</div>
</div>
<%@include file="footer.jsp"%>

</body>
</html>