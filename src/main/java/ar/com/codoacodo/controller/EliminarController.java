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

@WebServlet("/api/EliminarController")
public class EliminarController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String id=req.getParameter("id");
		

        Connection con=AdministradorDeConexiones.getConnection();
		if(con!=null) {
			
			//armo el sql para insertar
			String sql="DELETE FROM PRODUCTO WHERE id="+id;
			
			
			try {
			Statement st= con.createStatement();
			st.executeUpdate(sql);
			
			con.close();
			//getServletContext().getRequestDispatcher("/api/ListadoController").forward(req, resp);
			//otra forma de redirecionar
			resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
	}}