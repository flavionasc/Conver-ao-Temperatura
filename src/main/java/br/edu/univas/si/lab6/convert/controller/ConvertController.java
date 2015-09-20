package br.edu.univas.si.lab6.convert.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.univas.si.lab6.convert.service.ConvertService;

/**
 * Servlet implementation class ConvertController
 */
public class ConvertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float celsius = Float.valueOf(request.getParameter("celsius"));
		
		Float convertIndex = ConvertService.getIndex(celcius);
		
		response.getWriter().append(convertIndex.toString());
	}

}
