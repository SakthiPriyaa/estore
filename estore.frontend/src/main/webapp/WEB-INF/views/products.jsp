<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
 <%@include file="header.jsp" %>
<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>


<body>

<%@include file="navbar.jsp"%>
<script>
$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
});
</script>

	<div class="container"> 
 
  <div class="row">
  <c:forEach items="${products}" var="p">  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">${p.pname}</div>
        <div class="panel-body"><a href="prodesc?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a></div>
        <div class="panel-footer">Price:${p.pprice}
			<a href="prodesc?id=${p.pid}"  role="button"  class="btn btn-warning btn-sm btn-block">View Product Description<span class="glyphicon glyphicon-menu-right"><span class="glyphicon glyphicon-menu-right">
				</span>	</span>			</a></div>
      </div>
    </div></c:forEach></div></div>
    <%-- <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading" id="prod2">Hitman Absolution Professional Edition</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/HAPE1.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $10.00
		<a href="#" type="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
								</a></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">OPERATION FLASHPOINT RED RIVER</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/OFRR.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $11.12
		<a href="#" type="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
								</button></a></div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
      <div class="panel-heading">A LONG WALK TO FREEDOM</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/lf.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $23.00
		<a href="#" type="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
								</a></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">POLITICALLY INCORRECT</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/pi.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $22.00
		<a href="#"type="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
								</a></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
	  <div class="panel-heading">THE BONE BED</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/bb.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $19.99
		<a href="#" type="button" class="btn btn-warning btn-sm btn-block">Add to cart<span class="glyphicon glyphicon-shopping-cart"></span>
								</a></div>
      </div>
    </div>
  </div>
</div><br><br>

 <span class="tagline"></span>
 <div id="content">
			<div id="products">
				<ul>
				<c:forEach items="${products}" var="p">
				<li>
						<div class="product-image">
							<img src="./resource/images/${p.pimg}" alt="" />
						</div>
						<div class="product-description" data-name="${p.pname}"
							data-price="${p.pprice}">
							<h3 class="product-name">${p.pname}</h3>
							<p class="product-price">${p.pprice}</p>
							<form class="add-to-cart" action="cart" method="post">
								<div>
									<label for="qty-1">Quantity</label> <input type="text"
										name="qty-1" id="qty-1" class="qty" value="1" />
								</div>
								<p>
									<input type="submit" value="Add to cart" class="btn" />
									&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="myprodesc?id=${p.pid}"
										role="button" class="btn btn-warning">Details</a>
								</p>
							</form>
						</div>
					</li>					
				</c:forEach>
					
				</ul>
			</div>
		</div>
 --%>


 




<%@include file="footer.jsp" %>

</body>
</html>
