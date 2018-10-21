package cn.ts.Entity;

/**
 * Boutique entity. @author MyEclipse Persistence Tools
 */

public class Boutique implements java.io.Serializable {

	// Fields

	private Integer id;
	private String boutiqueId;
	private String price;

	// Constructors

	/** default constructor */
	public Boutique() {
	}

	/** full constructor */
	public Boutique(String boutiqueId, String price) {
		this.boutiqueId = boutiqueId;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBoutiqueId() {
		return this.boutiqueId;
	}

	public void setBoutiqueId(String boutiqueId) {
		this.boutiqueId = boutiqueId;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}