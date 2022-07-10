<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<main>
<!-- ACA VA EL NAVBAR -->
<%@include file="navbar.jsp" %>
<div class="container">
<section>
<h1>Alta</h1>
<form method="POST"
action="<%=request.getContextPath()%>/CreateController">
<div class="mb-3">
 <label for="exampleFormControlInput1" class="form-label">Nombre</label>
 <input type="text" class="form-control" id="exampleFormControlInput1" name="nombre" placeholder="Nombre" maxlength="50">
</div>
<div class="mb-3">
 <label for="exampleFormControlTextarea1" class="form-label">Precio</label>
 <input type="number" name="precio" class="form-control" id="exampleFormControlTextarea1">
</div>
<div class="mb-3">
 <label for="exampleFormControlTextarea1" class="form-label">Im&aacute;gen</label>
 <input type="file"  name="imagen"  class="form-control" id="exampleFormControlTextarea1">
</div>
<div class="mb-3">
 <label for="exampleFormControlTextarea1" class="form-label">C&oacute;digo</label>
 <input type="text"  name="codigo" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
</div>
<button class="btn btn-primary">
Dar de alta
</button>
</form>
</section>
</div>
</main>
</body>
</html>