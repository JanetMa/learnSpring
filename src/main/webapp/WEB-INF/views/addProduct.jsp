<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"	%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
  <section>
    <div class="jumbotron">
      <div class="container">
        <h1>Products</h1>
        <p>Add products</p>
          
      </div>
      <a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">logout</a>
    </div>
  </section>
  
  
  <section class="container">

   <form:form  modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
      <fieldset>
        <legend>Add new product</legend>

        
         <div class="form-group">
          <label class="control-label col-lg-2" for="productId">ProductId</label>
          <div class="col-lg-10">
            <form:input path="productId" type="text"/>
          </div>
        </div>
        

 <div class="form-group">
          <label class="control-label col-lg-2" for="description">Description</label>
          <div class="col-lg-10">
            <form:input path="description" type="text" rows = "2"/>
          </div>
        </div>


        <div class="form-group">
  <label class="control-label col-lg-2" for="unitsInOrder">Units In
    Order</label>
  <div class="col-lg-10">
  </div>
</div>
     <div class="form-group">
  <label class="control-label col-lg-2" for="discontinued">Discontinued</label>
  <div class="col-lg-10">
    
  </div>
</div>

		<div class="form-group">
          <label class="control-label col-lg-2" for="productImage">productImage</label>
          <div class="col-lg-10">
            <form:input path="productImage" type="file" class = "form:input-large"/>
          </div>
 		</div>
	    
        <div class="form-group">
          <div class="col-lg-offset-2 col-lg-10">
            <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
          </div>
        </div>
      </fieldset>
    </form:form>
  </section>
</body>
</html>
