<!DOCTYPE html>
<html lang="en">
<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<body>
<%@include file="navbar.jsp" %>

<!-- <script>
$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
});
</script>

<div class="container"> 
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">Dead Space 3 Limited Edition</div>
        <div class="panel-body"><img src="./resource/images/DS31.jpg" class="img-responsive" style="width:100%" height="auto" ></div>
        <div class="panel-footer">Price: $20.00</div></a>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">Hitman Absolution Professional Edition</div>
        <div class="panel-body"><img src="./resource/images/HAPE1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Price: $10.00</div></a>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">OPERATION FLASHPOINT RED RIVER</div>
        <div class="panel-body"><img src="./resource/images/OFRR.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Price: $11.12</div></a>
      </div>
    </div>
  </div>
</div><br>

<div class="container">   
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">A LONG WALK TO FREEDOM</div>
        <div class="panel-body"><img src="./resource/images/lf.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Price: $23.00</div></a>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">POLITICALLY INCORRECT</div>
        <div class="panel-body"><img src="./resource/images/pi.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Price: $22.00</div></a>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary"><a href="login" data-toggle="popover" title="Description" data-trigger="hover" data-content="A journey across space to discover the source of the Neucromorph outbreak">
        <div class="panel-heading">THE BONE BED</div>
        <div class="panel-body"><img src="./resource/images/bb.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Price: $19.99</div></a>
      </div>
    </div>
  </div></a>
</div><br><br>
 -->
 <div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Dead Space 3 Limited Edition</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/DS31.jpg" class="img-responsive" style="width:100%" alt="Image" ></a></div>
        <div class="panel-footer">Price: $20.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Hitman Absolution Professional Edition</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/HAPE1.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $10.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">OPERATION FLASHPOINT RED RIVER</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/OFRR.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $11.12</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">A LONG WALK TO FREEDOM</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/lf.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $23.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">POLITICALLY INCORRECT</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/pi.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $22.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">THE BONE BED</div>
        <div class="panel-body"><a href="prodesc"><img src="./resource/images/bb.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $19.99</div>
      </div>
    </div>
  </div>
</div><br><br>
<%@include file="footer.jsp" %>

</body>
</html>
