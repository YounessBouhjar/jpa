package microprojet.DAO;

import microprojet.entity.Categorie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class CategorieDAO  {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;

	public List<String> selectAll() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<String> maListe= entityManager.createNativeQuery("select a from Categorie a", Categorie.class)
				.getResultList();
		return maListe;
	}


	public void create( Categorie obj )  {
			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.persist( obj );
			entityManager.flush();

	}

	public void delete( Categorie obj) {

			entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.remove( obj  );
			entityManager.flush();

	}

	public Categorie update(Categorie obj) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
		return obj;
	}

	public Categorie findById( int id ){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Categorie.class, id );
	}

	public Categorie findByCategorie(String categorie ){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Categorie.class, categorie );
	}


}