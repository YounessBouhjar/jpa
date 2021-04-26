	package microprojet.DAO;

	import microprojet.entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class ArticleDAO  {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;

	public List<Article> selectAll() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<Article> maListe = entityManager.createQuery("select a from Article a", Article.class)
				.getResultList();
		return maListe;
	}

	public List<Article> selectAllBbyCategorie(String categorie) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<Article> maListe = entityManager.createQuery("select a from Article a where categorie="+categorie, Article.class)
				.getResultList();
		return maListe;
	}

	public void create( Article article )  {
			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.persist(article);
			entityManager.flush();

	}

	public void delete( Article article ) {
			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.remove(article);
			entityManager.flush();
	}

	public Article update(Article obj) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
		return obj;
	}

	public Article findById( long id ){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Article.class, id);
	}



}