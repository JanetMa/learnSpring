<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset=ISO-8859-1">
<link rel="stylesheet"
href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Prodicts</title>
<head>
<body>
	<section>
		<div class="jumbotron">
		<div class="container">
			<h1>Products</h1>
			<p>All the available products in our store</p>
		</div>
		</div>
	</section>
	
	<section class="container">
		<div class="row">
		<c:forEach items="${products}" var="product">
			<div class="col-sm-6 col-md-3" style="padding-botom: 15px">
				<div class="thumnail">
					<div class="caption">
						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>${product.unitPrice} USD</p>
						<p>Available ${product.unitsInStock} units in stock</p>
					</div>
				</div>
			</div>
			</c:forEach>
		</div>
	</section>
</body>
</head>