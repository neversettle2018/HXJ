package testentity;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private AdminId id;
	private String adminpassword;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(AdminId id) {
		this.id = id;
	}

	/** full constructor */
	public Admin(AdminId id, String adminpassword) {
		this.id = id;
		this.adminpassword = adminpassword;
	}

	// Property accessors

	public AdminId getId() {
		return this.id;
	}

	public void setId(AdminId id) {
		this.id = id;
	}

	public String getAdminpassword() {
		return this.adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

}