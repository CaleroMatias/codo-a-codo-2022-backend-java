package ar.com.codoacodo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.daos.ProductoDAO;
import ar.com.codoacodo.dto.Producto;

@WebServlet("/api/ListadoController")
public class ListadoController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  ProductoDAO dao= new ProductoDAO();
		  List<Producto> listado =dao.listarProductos();
		  
		  req.setAttribute("listado", listado);
		  
		  getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);

	}
}
