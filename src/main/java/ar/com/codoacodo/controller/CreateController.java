package ar.com.codoacodo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.daos.ProductoDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nombre=req.getParameter("nombre");
		String precio=req.getParameter("precio");		
		String imagen=req.getParameter("imagen");
		String codigo=req.getParameter("codigo");
		
		ProductoDAO dao =new ProductoDAO();
		
		dao.crearProducto(nombre, Float.parseFloat(precio) , imagen, codigo);
		
		resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	
	}
	
}
