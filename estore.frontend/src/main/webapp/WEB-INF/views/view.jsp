<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
<%@include file="header.jsp"%>
<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<body>

<%@include file="supplierheader.jsp"%>
<div class="container"> 
  <div class="row">  
    <div class="col-sm-14"> 
      <div class="panel panel-primary">
      <!-- <div class="col-sm-2 panel-heading">Image</div> -->
      <div class="col-sm-2 panel-heading">Id</div>
      <div class="col-sm-2 panel-heading">Name</div>
      <div class="col-sm-2 panel-heading">Description</div>
      <div class="col-sm-2 panel-heading">Stock</div>
      <div class="col-sm-2 panel-heading">Price</div>
      <div class="col-sm-2 panel-heading">Action</div>
      </div></div></div>
      <%-- <a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a> --%>
  <div class="row">  
    <div class="col-sm-12">
      <c:forEach items="${products}" var="p"> 
      <div class="col-sm-2 panel-body">${p.pid}</div>
      <div class="col-sm-2 panel-body">${p.pname}</div>
      <div class="col-sm-2 panel-body">${p.pdesc}</div>
      <div class="col-sm-2 panel-body">${p.pstock}</div>
      <div class="col-sm-2 panel-body">${p.pprice}</div>
      <div class="col-sm-2 panel-body">
      <a href="update?id=${p.pid}" type="button" class="btn btn-warning btn-sm "  ><span class="glyphicon glyphicon-pencil"></span></a>
      <a href="delete?id=${p.pid}" type="button" class="btn btn-danger btn-sm " ><span class="glyphicon glyphicon-trash"></span></a>
      </div>
      </c:forEach>
      </div></div>
      </div>
      <%@include file="footer.jsp"%>

</body>
</html>