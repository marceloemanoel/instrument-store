<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
        <link rel="stylesheet" href="<c:url value='/css/bootstrap-responsive.min.css'/>">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <style type="text/css">

      /* Sticky footer styles
      -------------------------------------------------- */

      html,
      body {
        height: 100%;
        /* The html and body elements cannot have any padding or margin. */
      }

      /* Wrapper for page content to push down footer */
      #wrap {
        min-height: 100%;
        height: auto !important;
        height: 100%;
        /* Negative indent footer by it's height */
        margin: 0 auto -60px;
      }

      /* Set the fixed height of the footer here */
      #footer {
        height: 60px;
        background-color: #f5f5f5;
      }

      /* Lastly, apply responsive CSS fixes as necessary */
      @media (max-width: 767px) {
        #footer {
          margin-left: -20px;
          margin-right: -20px;
          padding-left: 20px;
          padding-right: 20px;
        }
      }



      /* Custom page CSS
      -------------------------------------------------- */
      /* Not required for template or sticky footer method. */

      .container {
        width: auto;
        max-width: 680px;
      }
      .container .credit {
        margin: 20px 0;
      }

    </style>
    </head>
    <body>
    	    <!-- Part 1: Wrap all page content here -->
        <div id="wrap">
    
            <!-- Begin page content -->
            <div class="container">
                <div class="page-header">
                    <h1>My Store</h1>
                </div>
                <div class="row-fluid">
                    <div class="span12">
                        <table class="table table-condensed table-hover table-bordered table-stripped">
                            <thead>
                                <tr>
                                    <th>Description</th>
                                    <th>Price</th>
                                </tr>
                            </thead>
                            <tbody id="products"></tbody>
                        </table>
                    </div>
                </div>
            </div>
    
            <div id="push"></div>
        </div>

        <div id="footer" class="console">
          <div class="container">
            <p class="muted credit"></p>
          </div>
        </div>
    
        <input type="button" id="listar" value="Listar">
    	<input type="text" id="id" >
    	<input type="button" id="carregar" value="Carregar">
    	<br>
    	<form id="novoProduto" action="novoProduto" method="get">
    	  descrição: <input type="text" name="product.description"> <br>
    	  preço: <input type="text" name="product.price">
    	</form>
    	<input type="button" id="inserir" value="Inserir">
    	<input type="button" id="atualizar" value="Atualizar">
    	<input type="button" id="remover" value="Remover">

        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script type="text/javascript" src="<c:url value='/javascript/bootstrap.min.js'/>"></script>
        <script type="text/javascript" src="<c:url value='/js/ProductsController'/>"></script>
        <script type="text/javascript" src="<c:url value='/javascript/index.js'/>"></script>
    </body>
</html>