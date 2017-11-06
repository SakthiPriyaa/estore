<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<div class="jumbotron">
  <div class="container text-center">
    <h1>NIIT E-Commerce Store</h1>      
    <p>Welcome to the Home of all things NIIT </p>
  </div>
</div><b>${sessionScope['name']}</b>
 <!-- Before Login Navbar -->
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><img src="./resource/images/niit-logo.jpg" class="img-rounded" alt="NIIT" width="40" height="30"> </a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    
      <ul class="nav navbar-nav">
      
        <c:if test="${sessionScope['name']=='Admin'}">
        <li><a href="stock">AdminHome</a></li>
        <li  class="dropdown"><a href="#"class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-plus"></span>Add</a>
			 <ul class="dropdown-menu">
				<li><a href="addproduct">Product</a>
				<li><a href="addcategory">Category</a>
				<li><a href="addsupplier">Supplier</a>
			</ul>
			</li>
		<li><a href="stock"><span class="glyphicon glyphicon-list-alt"></span>Products/Categories/Suppliers</a></li>
		 <li><a href="orders"><span class="glyphicon glyphicon-tasks"></span>My Orders<span class="badge">2</span> </a></li>
		</c:if>
		<c:if test="${sessionScope['name']!='Admin'}">
      <li><a href="usrhome">Home</a></li>
        <li><a href="myproducts">Products</a></li>
        </c:if>
       </ul>
	 
	 
	 
      <ul class="nav navbar-nav navbar-right">
                 		
            		 <!-- <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>LogOut</a></li> -->
          
 			 <c:choose>	
 			 <c:when test="${sessionScope['name'] eq null}">
        			<li><a href="register"><span class="glyphicon glyphicon-pencil"></span>Register</a></li>
        			<li><a href="login"><span class="glyphicon glyphicon-user"></span>Login</a></li>
        			<li><a href="mycart"><span class="glyphicon glyphicon-shopping-cart"></span>Cart<span class="badge"></span></a></li> 
       			 
        		</c:when>
				<c:when test="${sessionScope['name'] ne null}">   				          		
      		  		<li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>LogOut</a></li>
      		  	</c:when>
      		  	</c:choose>
       	</ul> 
   
    </div>
  </div>
</nav>