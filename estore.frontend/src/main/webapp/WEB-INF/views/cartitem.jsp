<!DOCTYPE html>
<html lang="en">
<%@include file="header.jsp" %><%@page isELIgnored="false" %>
 <%@include file="header.jsp" %>
<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<body>

<%@include file="navbar.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-xs-8">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">
						<div class="row">
							<div class="col-xs-6">
								<h5><span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart</h5>
							</div>
							<div class="col-xs-6"><a href="products">
								<button type="button" class="btn btn-primary btn-sm btn-block" >
									<span class="glyphicon glyphicon-share-alt"></span> Continue shopping
								</button></a>
							</div>
						</div>
					</div>
				</div>
				<div class="panel-body">
					<div class="row">
					<form id="cart"  action="updateCart" method="GET" role="form" style="display: block;" >
						<div class="col-xs-2"><img class="img-responsive" src="./resource/images/${product.pimg }">
						</div>
						<div class="col-xs-4">
							<h4 class="product-name"><strong>${product.pname}</strong></h4><h4><small>${product.pdesc}</small></h4>
						</div>
						<div class="col-xs-6">
							<div class="col-xs-6 text-right">
								<h6><strong>${product.pprice} <span class="text-muted">X</span></strong></h6>
							</div>
							<div class="col-xs-4">
								<input type="text" class="form-control input-sm" name="count" value="1"/>
							</div>
							<div class="col-xs-2">
								<button type="button" class="btn btn-link btn-xs">
									<span class="glyphicon glyphicon-trash"> </span>
								</button>
							</div>
							<input type="hidden" name="pid" value="${product.pid}"/>
						</div>
					</div>
					
					<div class="row">
						<div class="text-center">
							<div class="col-xs-9">
								<h6 class="text-right">Added items?</h6>
							</div>
<%-- 							<div class="col-xs-3"><a href="updateCart?id=${product.pid}">
								<button type="button" class="btn btn-default btn-sm btn-block">
									Update cart
								</button></a> --%>
								<input type="submit" class="btn btn-default btn-sm btn-block" name="butSubmit" value="Update Cart" />
							</div>
						</div>
					</div></form>
				</div>
				<div class="panel-footer">
					<div class="row text-center">
						<div class="col-xs-9">
							<h4 class="text-right">Total <strong>$50.00</strong></h4>
						</div>
						<div class="col-xs-3">
							<a href="custdetails" type="button" class="btn btn-success btn-block">
								Checkout
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="footer.jsp" %>

</body>
</html>