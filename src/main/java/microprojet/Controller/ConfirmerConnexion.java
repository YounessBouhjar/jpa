package microprojet.Controller;

import microprojet.DAO.CategorieDAO;
import microprojet.DAO.ClientDAO;
import microprojet.entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/ConfirmerConnexion")
public class ConfirmerConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConfirmerConnexion() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String email=request.getParameter("email");
		String motdepasse=(String)request.getParameter("motdepasse");
		ClientDAO clientDao= new ClientDAO();
		Client client=clientDao.findByEmail(email);
		HttpSession session=request.getSession();
		CategorieDAO catDao=new CategorieDAO();

		if(client != null && motdepasse.matches(client.getMotDePasse()))
		{	
			List<String> taListe=catDao.selectAll();
			session.setAttribute("taListe", taListe);
			session.setAttribute("utilisateur",client);
			
			RequestDispatcher view=request.getRequestDispatcher("connexionReussite.jsp");
			view.forward(request, response);
		}
		else
		{	
			RequestDispatcher view=request.getRequestDispatcher("identification.jsp");
			view.forward(request, response);
		}
	}

}