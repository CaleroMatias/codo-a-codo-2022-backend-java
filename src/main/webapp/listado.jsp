

<%@page import="ar.com.codoacodo.dto.Producto"%>
<%@page import="java.util.List"%>
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
      <table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">TiTULO</th>
      <th scope="col">PRECIO</th>
      <th scope="col">C&Oacute;DIGO</th>
    </tr>
  </thead>
     <%
     List<Producto> listado = (List<Producto>)request.getAttribute("listado");
     %>
<tbody>
  <%
   for ( Producto unProducto : listado){	  
  %>
    <tr>
      <th scope="row"> <%=unProducto.getIdProducto()%> </th>
      <td><%=unProducto.getNombre()%></td>
      <td><%=unProducto.getPrecio()%></td>
      <td><%=unProducto.getCodigo()%></td>
    </tr>  
    <%
    };
    %> 
  </tbody>
</table>
     </section>
     </div>
  </main>
  </body>
</html>