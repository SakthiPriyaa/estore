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
<div align="center" class="panel-heading"><b style="font-size:150%;">Products List</b></div>
</div>
</div>
</div>			
  <div class="row">  
    <div class="col-sm-12">
      <div class="panel panel-primary">
      
	  <div align="center" class="col-sm-2 panel-heading">Product_Id</div>
      <div align="center" class="col-sm-2 panel-heading">Product_Name</div>
      <div align="center" class="col-sm-2 panel-heading">Product_Description</div>
      <div align="center" class="col-sm-2 panel-heading">Product_Stock</div>
      <div align="center" class="col-sm-2 panel-heading">Product_Price</div>
      <div align="center" class="col-sm-2 panel-heading">Action</div>
      </div></div></div>
      <%-- <a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a> --%>
  <div class="row">  
    <div align="center" "col-sm-12">
      <c:forEach items="${products}" var="p"> 
      <div align="center" class="col-sm-2 panel-body center">${p.pid}</div>
      <div align="center" class="col-sm-2 panel-body">${p.pname}</div>
      <div align="center" class="col-sm-2 panel-body">${p.pdesc}</div>
      <div align="center" class="col-sm-2 panel-body">${p.pstock}</div>
      <div align="center" class="col-sm-2 panel-body">${p.pprice}</div>
      <div align="center" class="col-sm-2 panel-body">
      <a href="updateproduct?id=${p.pid}" type="button" class="btn btn-warning btn-sm "  ><span class="glyphicon glyphicon-pencil"></span></a>
      <a href="deleteproduct?id=${p.pid}" type="button" class="btn btn-danger btn-sm " ><span class="glyphicon glyphicon-trash"></span></a>
      </div>
      <!-- <div class="col-sm-12 panel panel-default"></div>	 -->
      </c:forEach>      
      </div>
      
      </div>
</div></div>

<div class="container"> 
<div class="row">
<div class="col-sm-12 panel panel-default"></div>	
<div  align="center"class="col-sm-4 col-sm-offset-4">
<div class="panel panel-info">
<div align="center" class="panel-heading"><b style="font-size:150%;">Categories List</b></div>
</div>
</div>
</div>	
  <div class="row">  
    <div class="col-sm-12"> 
      <div class="panel panel-primary">
      <div align="center" class="col-sm-2 panel-heading">Category_Id</div>
      <div align="center" class="col-sm-2 panel-heading">Category_Name</div>
      <div align="center" class="col-sm-6 panel-heading">Category_Description</div>
      <div align="center" class="col-sm-2 panel-heading">Action</div>
      </div></div></div>
      <%-- <a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a> --%>
  <div class="row">  
    <div class="col-sm-12">
      <c:forEach items="${categories}" var="cat"> 
      <div align="center" class="col-sm-2 panel-body">${cat.cid}</div>
      <div align="center" class="col-sm-2 panel-body">${cat.cname}</div>
      <div align="center" class="col-sm-6 panel-body">${cat.cdesc}</div>
      <div align="center" class="col-sm-2 panel-body">
      <a href="updatecategory?id=${cat.cid}" type="button" class="btn btn-warning btn-sm "  ><span class="glyphicon glyphicon-pencil"></span></a>
      <a href="deletecategory?id=${cat.cid}" type="button" class="btn btn-danger btn-sm " ><span class="glyphicon glyphicon-trash"></span></a>
      </div>
      </c:forEach>
      </div></div>
</div>
<div class="container">
<div class="row">	
<div class="col-sm-12 panel panel-default"></div>	
<div  align="center"class="col-sm-4 col-sm-offset-4">
<div class="panel panel-info">
<div align="center" class="panel-heading"><b style="font-size:150%;">Suppliers List</b></div>
</div>
</div>
</div>	 
  <div class="row">  
    <div class="col-sm-12"> 
      <div class="panel panel-primary">
      <div align="center" class="col-sm-2 panel-heading">Supplier_Id</div>
      <div align="center" class="col-sm-2 panel-heading">Supplier_Name</div>
      <div align="center" class="col-sm-2 panel-heading">Supplier_Address</div>
      <div align="center" class="col-sm-2 panel-heading">Supplier_Email</div>
      <div align="center" class="col-sm-2 panel-heading">Supplier_Contact</div>
      <div align="center" class="col-sm-2 panel-heading">Action</div>
      </div></div></div>
      <%-- <a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a> --%>
  <div class="row">  
    <div class="col-sm-12">
      <c:forEach items="${suppliers}" var="sup"> 
      <div align="center" class="col-sm-2 panel-body">${sup.id}</div>
      <div align="center" class="col-sm-2 panel-body">${sup.name}</div>
      <div align="center" class="col-sm-2 panel-body">${sup.address}</div>
      <div align="center" class="col-sm-2 panel-body">${sup.email}</div>
      <div align="center" class="col-sm-2 panel-body">${sup.contact}</div>
      <div align="center" class="col-sm-2 panel-body">
      <a href="updatesupplier?id=${sup.id}" type="button" class="btn btn-warning btn-sm "  ><span class="glyphicon glyphicon-pencil"></span></a>
      <a href="deletesupplier?id=${sup.id}" type="button" class="btn btn-danger btn-sm " ><span class="glyphicon glyphicon-trash"></span></a>
      
      </div>
      <!-- <div class="alert alert-success alert-dismissable">
 			 <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  			<strong>Success!</strong> Indicates a successful or positive action.
	</div> -->
      </c:forEach>
      </div></div>
      <div class="col-sm-12 panel panel-default"></div>	
</div>

   
<%@include file="footer.jsp"%>

</body>
</html>