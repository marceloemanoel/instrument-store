<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
        <link rel="stylesheet" href="<c:url value='/css/bootstrap-responsive.min.css'/>">
        <link rel="stylesheet" href="<c:url value='/css/font-awesome.min.css'/>">
        <!--[if IE 7]>
        <link rel="stylesheet" href="<c:url value='/css/font-awesome-ie7.min.css'/>">
        <![endif]-->
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                margin-top: 120px;
                background-color: white;
            }
            #wrapper {
                width: 700px;
            }
            #categories {
                width: 250px;
                float: left;
            }
            #myCarousel {
                padding-bottom: 30px;
                height: 508px;
            }
            .navbar .brand {
                padding-top: 5px;
                padding-bottom: 5px;
            }
            .navbar .nav {
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <div id="#wrapper" class="container" >
            <div class="navbar navbar-fixed-top">
               <div class="navbar-inner">
                 <div class="container">
                   <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                   </a>
                   <a class="brand" href="<c:url value='/' />" title="Instrument Store">
                        <img alt="Instrument Store" src="<c:url value='/img/logo.png'/>" height="96"/>
                   </a>
                   <div class="nav-collapse collapse" id="main-menu">
                    <ul class="nav" id="main-menu-left">
                      <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Guitars <b class="caret"></b></a>
                        <ul class="dropdown-menu" id="guitars-menu">
                            <c:forEach var="category" items="${guitars}" varStatus="it">
                              <li>
                                <a href="<c:url value='/categories/guitars/${category.id}'/>">${category.name}</a>
                              </li>
                              <c:if test="${not it.last}">
                                <li class="divider"></li>
                              </c:if>
                            </c:forEach>
                        </ul>
                      </li>
                      <li class="dropdown" id="drums-menu">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Drums <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <c:forEach var="category" items="${drums}" varStatus="it">
                              <li>
                                <a href="<c:url value='/categories/drums/${category.id}'/>">${category.name}</a>
                              </li>
                              <c:if test="${not it.last}">
                                <li class="divider"></li>
                              </c:if>
                            </c:forEach>
                        </ul>
                      </li>
                    </ul>
                    <ul class="nav pull-right" id="main-menu-right">
                      <li>
                          <a rel="tooltip" href="#" title="Shopping Cart"><i class="icon-shopping-cart"></i>My Cart</a>
                      </li>
                      <li>
                          <a rel="tooltip" href="#" title="Login"><i class="icon-user"></i>Login</a>
                      </li>
                    </ul>
                   </div>
                 </div>
               </div>
             </div>
             
            <div id="myCarousel" class="carousel slide">
                <ol class="carousel-indicators">
                    <c:forEach items="${onSale}" varStatus="it">
                        <li data-target="#myCarousel" data-slide-to="${it.index}" <c:if test="${it.first}">class="active"</c:if>></li>
                    </c:forEach>
                </ol>
                <!-- Carousel items -->
                <div class="carousel-inner">
                    <c:forEach items="${onSale}" var="promotion" varStatus="it">
                        <div class="item <c:if test='${it.first}'>active</c:if>">
                            <img alt="${promotion.product.description}" src="<c:url value='/img/${promotion.image}'/>">
                            <div class="carousel-caption">
                                <h4>${promotion.product.name}</h4>
                                <p>${promotion.product.description}</p>
                            </div>                        
                        </div>
                    </c:forEach>
                </div>
                <!-- Carousel nav -->
                <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
                <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
            </div>
             
            <div id="categories" class="well">
                <ul class="nav nav-list">
                    <li class="nav-header">Categories</li>
                </ul>
            </div>
        </div>
        
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
        <script src="<c:url value='/javascript/bootstrap.min.js'/>"></script>
        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <script type="text/javascript">
           $(function(){
               $('.carousel').carousel();               
           });        
        </script>
    </body>
</html>