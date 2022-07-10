package ar.com.codoacodo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateController")
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
			String sql="INSERT INTO producto(nombre,precio,fecha_creacion,imagen,codigo) ";
			sql += "VALUES('"+nombre+"',"+precio+",CURRENT_DATE,'"+imagen+"','"+codigo+"')";
			
			try {
			Statement st= con.createStatement();
			st.execute(sql);
			
			con.close();
			//getServletContext().getRequestDispatcher("/api/ListadoController").forward(req, resp);
			//otra forma de redirecionar
			resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
	}

}
