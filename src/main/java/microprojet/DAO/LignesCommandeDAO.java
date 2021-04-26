package microprojet.DAO;


import microprojet.entity.Article;
import microprojet.entity.Lignescommande;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class LignesCommandeDAO  {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;

	public List<Lignescommande> selectAll() {

		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<Lignescommande> maListe = entityManager.createNativeQuery("select a from Lignescommande a", Article.class)
				.getResultList();
		return maListe;
	}
	

	public void create( Lignescommande obj)  {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
	}

	public void delete( Lignescommande obj ) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.remove(obj);
		entityManager.flush();
	}

	public void update(Lignescommande obj) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
	}


	public Lignescommande findById( long id ){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Lignescommande.class, id);
	}

}