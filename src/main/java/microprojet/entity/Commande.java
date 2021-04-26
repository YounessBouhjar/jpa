package microprojet.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Commande {
	@Id	@GeneratedValue(strategy= GenerationType.AUTO)
	private int numCommande;
	@ManyToOne
	private Client client;
	private Date dateCommande;
	
	public Commande() {
		super();
	}
	public Commande(Client client, Date dateCommande) {
		super();
		this.client = client;
		this.dateCommande = dateCommande;
	}
	public Commande(int numCommande, Client client, Date dateCommande) {
		super();
		this.numCommande = numCommande;
		this.client = client;
		this.dateCommande = dateCommande;
	}
	public int getNumCommande() {
		return numCommande;
	}
	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	

}