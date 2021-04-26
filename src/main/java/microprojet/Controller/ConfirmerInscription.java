package microprojet.Controller;

import microprojet.DAO.ClientDAO;
import microprojet.entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ConfirmerInscription")
public class ConfirmerInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ConfirmerInscription() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email=request.getParameter("email");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String adresse=request.getParameter("adresse");
		String codePostal=request.getParameter("codepostal");
		String ville=request.getParameter("ville");
		String tel=request.getParameter("tel");
		String motDePasse=request.getParameter("motdepasse");
		Client utilisateur=new Client(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
		ClientDAO clientDao=new ClientDAO();
		clientDao.create(utilisateur);
		
		RequestDispatcher view=request.getRequestDispatcher("identification.jsp");
		view.forward(request, response);
	}

}