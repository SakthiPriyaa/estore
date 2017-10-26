<!DOCTYPE html>
<html lang="en">
<%@page isELIgnored="false" %>
<%@include file="header.jsp"%>
<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<body>

<%@include file="supplierheader.jsp"%>
<div class="container"> 
  <div class="row">
  <c:forEach items="${products}" var="p">  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading" >${p.pname}</div>
        <div class="panel-body"><a href="view?id=${p.pid}"><img src="./resource/images/${p.pimg}" class="img-responsive" style="width:100%" ></a></div>
        <div class="panel-footer">Price:${p.pprice}
			<a href="view?id=${p.pid}" type="button" action="view" method="GET" class="btn btn-warning btn-sm btn-block">View Details<span class="glyphicon glyphicon-list-alt"></span>
								</a></div>
      </div>
    </div></c:forEach></div></div>
<%@include file="footer.jsp"%>

</body>
</html>