package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.IClientsLocal;
import com.dao.IVillageLocal;
import com.entities.Clients;
import com.entities.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/Client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private IClientsLocal clients_dao;
	@EJB
	private IVillageLocal village_dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("village",village_dao.liste());
				request.getRequestDispatcher("/WEB-INF/clients/add.jsp").forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Clients clients = new Clients ();
		String nom = request.getParameter("nom").toString();
		String adresse = request.getParameter("adresse").toString();
		String prenom = request.getParameter("prenom").toString();
		String numero = request.getParameter("numero").toString();
		int idvillage = Integer.parseInt(request.getParameter("idVillage")); 
		Village village = new Village();
		village = village_dao.getVillage(idvillage);
		clients.setNom(nom);
		clients.setPrenom(prenom);
		clients.setAdresse(adresse);
		clients.setNumero(numero);
		clients.setVillage(village);
		clients_dao.add(clients);
		doGet(request, response);
	}

}
