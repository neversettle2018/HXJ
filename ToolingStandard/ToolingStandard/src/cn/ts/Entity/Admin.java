package cn.ts.Entity;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String adminId;
	private String adminPas;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminId, String adminPas) {
		this.adminId = adminId;
		this.adminPas = adminPas;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPas() {
		return this.adminPas;
	}

	public void setAdminPas(String adminPas) {
		this.adminPas = adminPas;
	}

}