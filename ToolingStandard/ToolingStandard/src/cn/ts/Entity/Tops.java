package cn.ts.Entity;

/**
 * Tops entity. @author MyEclipse Persistence Tools
 */

public class Tops implements java.io.Serializable {

	// Fields

	private Integer id;
	private String topsId;
	private String price;

	// Constructors

	/** default constructor */
	public Tops() {
	}

	/** full constructor */
	public Tops(String topsId, String price) {
		this.topsId = topsId;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopsId() {
		return this.topsId;
	}

	public void setTopsId(String topsId) {
		this.topsId = topsId;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}