<!DOCTYPE html>
<html lang="en">
<%@include file="header.jsp"%>
<body>

<div class="jumbotron">
  <div class="container text-center">
	<img src="./resource/images/logo1.jpg" class="img-rounded" alt="NIIT" width="200" height="120">
    <h1>NIIT E-Commerce Store</h1>      
    <p>Welcome to the Home of all things NIIT </p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><img src="./resource/images/Capture.jpg" class="img-rounded" alt="NIIT" width="40" height="30"> </a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="myproducts">Products</a></li>
		
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="mycart"><span class="glyphicon glyphicon-shopping-cart"></span>Cart<span class="badge">2</span> </a></li>
        <li><a href="home"><span class="glyphicon glyphicon-log-out"></span>LogOut</a></li>
	</ul>
    </div>
  </div>
</nav>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Dead Space 3 Limited Edition</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/DS31.jpg" class="img-responsive" style="width:100%" alt="Image" ></a></div>
        <div class="panel-footer">Price: $20.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Hitman Absolution Professional Edition</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/HAPE1.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $10.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">OPERATION FLASHPOINT RED RIVER</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/OFRR.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
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
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/lf.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $23.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">POLITICALLY INCORRECT</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/pi.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $22.00</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">THE BONE BED</div>
        <div class="panel-body"><a href="myprodesc"><img src="./resource/images/bb.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="panel-footer">Price: $19.99</div>
      </div>
    </div>
  </div>
</div><br><br>


<%@include file="footer.jsp"%>

</body>
</html>
