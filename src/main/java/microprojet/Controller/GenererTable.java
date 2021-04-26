package microprojet.Controller;

import microprojet.DAO.ArticleDAO;
import microprojet.DAO.CategorieDAO;
import microprojet.entity.Article;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class GenererTable
 */
@WebServlet("/GenererTable")
public class GenererTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GenererTable() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String cat=(String) request.getParameter("categorie");
		
			CategorieDAO catDao=new CategorieDAO();
			ArticleDAO artDao=new ArticleDAO();
			
			List<Article> maListe=artDao.selectAllBbyCategorie(cat);
			HttpSession session=request.getSession();
		
		 
			List<String> taListe=catDao.selectAll();
			session.setAttribute("selected", cat);
			session.setAttribute("taListe", taListe);
			request.setAttribute("maListe", maListe);
			
			RequestDispatcher view=request.getRequestDispatcher("afficherCatalogue.jsp");
			view.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    			doGet(request, response);
	}

}