package microprojet.Controller;

import microprojet.DAO.ArticleDAO;
import microprojet.entity.Article;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/GenererArticle")
public class GenererArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GenererArticle() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Code Article = " + request.getParameter("param"));
		ArticleDAO articleDao=new ArticleDAO();
		Article article=articleDao.findById(Integer.valueOf(request.getParameter("param")));
		request.setAttribute("article", article);
		
		RequestDispatcher view=request.getRequestDispatcher("article.jsp");
		view.forward(request, response);
			}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}