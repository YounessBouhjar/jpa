package microprojet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id	@GeneratedValue(strategy= GenerationType.AUTO)
	private int refCat;
	private String name;
	
	
	
	public Categorie() {
		super();
	}
	public Categorie(int refCat, String name) {
		super();
		this.refCat = refCat;
		this.name = name;
	}
	
	public int getRefCat() {
		return refCat;
	}
	public void setRefCat(int refCat) {
		this.refCat = refCat;
	}
	public String getName() {
		return name;
	}
	public void setCategorie(String categorie) {
		this.name = categorie;
	}
	

}