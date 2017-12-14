<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
<%@include file="header.jsp"%>

<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<body>

<%@include file="navbar.jsp"%>
<div class="container"> 
<div class="row">	
<div  align="center"class="col-sm-4 col-sm-offset-4">
<div class="panel panel-info">
<div align="center" class="panel-heading"><b style="font-size:150%;">Cart</b></div>
</div>
</div>
</div>			
  <div class="row">  
    <div class="col-sm-12">
      <div class="panel panel-primary">
      <div align="center" class="col-sm-2 panel-heading">Product_Image</div>
      <div align="center" class="col-sm-2 panel-heading">Product_Name</div>
      <div align="center" class="col-sm-2 panel-heading">Quantity</div>
      <div align="center" class="col-sm-2 panel-heading">Cost</div>
      <div align="center" class="col-sm-2 panel-heading">Amount</div>
      <div align="center" class="col-sm-2 panel-heading">Action</div>
      </div></div></div>
      <%-- <a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a> --%>
        <c:forEach items="${sessionScope['cart'].items}" var="c"> 
  <div class="row">  
    <div class="col-sm-12">
	  <div align="center" class="col-sm-2 panel-body">${c.product.pimg}</div>
      <div align="center" class="col-sm-2 panel-body">${c.product.pname}</div>
      <div align="center" class="col-sm-2 panel-body">${c.quantity}</div>
      <div align="center" class="col-sm-2 panel-body">${c.product.pprice}</div>
      <div align="center" class="col-sm-2 panel-body">${c.quantity * c.product.pprice}</div>
      <div align="center" class="col-sm-2 panel-body">
      <a href="prodesc?id=${c.product.pid}" type="button" class="btn btn-warning btn-sm "  ><span class="glyphicon glyphicon-pencil"></span></a>
      <a href="deleteitem?id=${c.product.pid}" type="button" class="btn btn-danger btn-sm " ><span class="glyphicon glyphicon-trash"></span></a>
      </div>
      
       
      </div>
      
      </div>
          </c:forEach> 
      <div class="col-sm-12 panel panel-default"></div>	
</div>
<%@include file="footer.jsp"%>

</body>
</html>