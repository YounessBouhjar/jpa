package microprojet.DAO;

import microprojet.entity.Achat;
import microprojet.entity.Article;
import microprojet.entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientDAO  {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;

	public List<Article> selectAll() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<Article> maListe = entityManager.createNativeQuery("select a from Client a", Article.class)
				.getResultList();
		return maListe;
	}
	public List<Achat> selectAllbyClient(int id) {
		List<Achat> maListe =  entityManager.createNativeQuery("SELECT a.CodeArticle,a.Designation,a.Prix,l.qteCde,c.dateCommande" +
				  " from Lignescommande l,Article a,Commande c WHERE a.CodeArticle=l.code_article AND l.numCommande=c.numCommande AND c.id="+id, Client.class)
				.getResultList();
		return maListe;

	}

	public void create( Client obj )  {
			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.persist( obj );
			entityManager.flush();
	}

	public void delete( Client client) {
			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.remove(  client );
			entityManager.flush();

	}

	public Client update(Client obj) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
		return obj;
	}

	public Client findById(int id){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Client.class, id );
	}

	public Client findByEmail(String email){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Client.class, email );
	}

}