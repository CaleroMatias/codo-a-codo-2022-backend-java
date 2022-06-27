package ar.com.codoacodo.controller;

import java.io.IOException;
import java.sql.Connection;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreateController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recibe los datos del front 
				
		//en req vienen los datos que manda el formulario html
		//clave valor
		
		String nombre=req.getParameter("nombre");
		String precio=req.getParameter("precio");//se debe convertir en float
		String fechaCreacion= ""; // este parametro lo damos nosotros en sql
		String imagen=req.getParameter("imagen");
		String codigo=req.getParameter("codigo");
		
		//pide una conexion a la clase AdministradorDeConexion.getConnection();
		
        Connection con=AdministradorDeConexiones.getConnection();
		if(con!=null) {
			
			//armo el sql para insertar
			String sql="INSERT INTO PRODUCTO(nombre,precio,fecha_creacion,imegen,codigo";
			sql += "VALUES('"+nombre+"',"+precio+",CURDATE(),'"+imagen+"','"+codigo+"')";
		}
		
		
	}

}
