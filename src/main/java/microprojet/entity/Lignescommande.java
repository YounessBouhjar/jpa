package microprojet.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity

public class Lignescommande {
	@ManyToOne
	public Commande commande;
	@ManyToOne
	public Article article;
	public int qteCde;
	
	
	public Lignescommande() {
		super();
	}


	public Lignescommande(Commande commande, Article article, int qteCde) {
		super();
		this.commande = commande;
		this.article = article;
		this.qteCde = qteCde;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public int getQteCde() {
		return qteCde;
	}


	public void setQteCde(int qteCde) {
		this.qteCde = qteCde;
	}



	
	

}