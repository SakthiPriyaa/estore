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
     
   <!--  <div class="modal fade" id="update_user_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Update</h4>
            </div>
            <div class="modal-body">
 
                <div class="form-group">
                    <label for="update_first_name">First Name</label>
                    <input type="text" id="update_first_name" placeholder="First Name" class="form-control"/>
                </div>
 
                <div class="form-group">
                    <label for="update_last_name">Last Name</label>
                    <input type="text" id="update_last_name" placeholder="Last Name" class="form-control"/>
                </div>
 
                <div class="form-group">
                    <label for="update_email">Email Address</label>
                    <input type="text" id="update_email" placeholder="Email Address" class="form-control"/>
                </div>
 
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary" onclick="UpdateUserDetails()" >Save Changes</button>
                <input type="hidden" id="hidden_user_id">
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function UpdateUserDetails() {
    // get values
    var first_name = $("#update_first_name").val();
    var last_name = $("#update_last_name").val();
    var email = $("#update_email").val();
 
    // get hidden field value
    var id = $("#hidden_user_id").val();
 
    // Update the details by requesting to the server using ajax
   /*  $.post("ajax/updateUserDetails.php", {
            id: id,
            first_name: first_name,
            last_name: last_name,
            email: email
        },
        function (data, status) {
            // hide modal popup
            $("#update_user_modal").modal("hide");
            // reload Users by using readRecords();
            readRecords();
        } 
    );*/
}
    </script>    
 -->  
<%@include file="footer.jsp"%>

</body>
</html>