package microprojet.DAO;


import microprojet.entity.Commande;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class CommandeDAO{
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;

	public List<Commande> selectAll() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		List<Commande> maListe = entityManager.createQuery("select a from Commande a", Commande.class)
				.getResultList();
		return maListe;
	}

	public void create( Commande obj )  {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();

	}


	public void delete( Commande commande) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.remove(commande);
		entityManager.flush();

	}

	public Commande update(Commande obj) {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.persist(obj);
		entityManager.flush();
		return obj;

	}


	public Commande findById(int id){

		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find( Commande.class, id );
	}


	public  Commande findLastRow(){
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
		return  entityManager.find(Commande.class,1);


	}

}