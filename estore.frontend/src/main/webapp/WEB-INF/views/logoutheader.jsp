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
        <li><a href="home"><span class="glyphicon glyphicon-log-out"></span><b>Welcome! ${sessionScope['name']}</b>LogOut</a></li>
	</ul>
    </div>
  </div>
</nav>