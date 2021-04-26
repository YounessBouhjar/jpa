package microprojet.entity;

import javax.persistence.*;

@Entity
public class Article {
	@Id	@GeneratedValue(strategy= GenerationType.AUTO)
	private int CodeArticle;
	private String Designation;
	private double Prix;
	private int Stock;
	@ManyToOne
	public Categorie categorie;
	private String image;
	
	public Article() {
		super();
	}
	public Article(int CodeArticle, String Designation, double Prix, int Stock, Categorie categorie, String image) {
		super();
		this.CodeArticle = CodeArticle;
		this.Designation = Designation;
		this.Prix = Prix;
		this.Stock = Stock;
		this.categorie = categorie;
		this.image = image;
	}
	public Article(String designation, double prix, int stock, Categorie categorie, String image) {
		super();
		this.Designation = designation;
		this.Prix = prix;
		this.Stock = stock;
		this.categorie = categorie;
		this.image = image;
	}

	public int getCodeArticle() {
		return CodeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		CodeArticle = codeArticle;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		Prix = prix;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
