package microprojet.Controller;

import microprojet.DAO.ArticleDAO;
import microprojet.entity.Article;
import microprojet.entity.Client;
import microprojet.entity.Panier;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SupprimerArticle")
public class SupprimerArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SupprimerArticle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		int articleaSupprimer=Integer.valueOf(request.getParameter("articleasupp"));
		int quantite=Integer.valueOf(request.getParameter("quantite"));
		Client utilisateur=(Client) session.getAttribute("utilisateur");
		ArticleDAO articleDao=new ArticleDAO();
		Article article=articleDao.findById(articleaSupprimer);
		Panier panier=new Panier(article,quantite);
		utilisateur.SupprimerDuPanier(panier);
		session.setAttribute("utilisateur", utilisateur);
		
		RequestDispatcher view=request.getRequestDispatcher("voirPanier.jsp");
		view.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}