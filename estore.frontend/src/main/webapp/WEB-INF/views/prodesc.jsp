<!DOCTYPE html>
<html lang="en">
<%@include file="header.jsp" %>
<body>



<%@include file="loginheader.jsp" %>
<div class="container">    
  <div class="row"><h3>Product Description</h3>
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading" id="prod1">Dead Space 3 Limited Edition</div>
        <div class="panel-body"><img src="./resource/images/./resource/images/DS31.jpg" class="img-responsive" style="width:100%" height="auto" ></div>
        <div class="panel-footer">Price: $20.00</div>
			</div>
    </div>
	<div class="col-sm-8">
	<div class="panel panel-primary">
        <div class="panel-heading" id="desc1">Product Description</div>
        <div class="panel-body"><table class="table table-striped">
		<tr><td>Product Type:</td><td>GAMES</td></tr>
		<tr><td>Description:</td><td>"A journey across space to discover the source of the Neucromorph outbreak"</td></tr>
		<tr><td>Supplier:</td><td>WE ARE GAMES</td></tr>
		<tr><td>Price:</td><td>$20.00</td></tr>
		</table></div>
        <div class="panel-footer"><a href="products" role="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
						</div></a>
	</div>
	<div class="col-sm-offset-5 col-centered"><a href="products"
			role="button" class="btn btn-success btn-sm btn-block">
	<span class="glyphicon glyphicon-share-alt"></span>Continue Shopping
	</a></div>
    </div>  
</div>
</div>
<%@include file="footer.jsp" %>

</body>
</html>
