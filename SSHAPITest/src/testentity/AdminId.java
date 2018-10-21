package testentity;

/**
 * AdminId entity. @author MyEclipse Persistence Tools
 */

public class AdminId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String adminid;

	// Constructors

	/** default constructor */
	public AdminId() {
	}

	/** full constructor */
	public AdminId(Integer id, String adminid) {
		this.id = id;
		this.adminid = adminid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminid() {
		return this.adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AdminId))
			return false;
		AdminId castOther = (AdminId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getAdminid() == castOther.getAdminid()) || (this.getAdminid() != null
						&& castOther.getAdminid() != null && this.getAdminid().equals(castOther.getAdminid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getAdminid() == null ? 0 : this.getAdminid().hashCode());
		return result;
	}

}