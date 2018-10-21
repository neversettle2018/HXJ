package testentity;

/**
 * ApplyId entity. @author MyEclipse Persistence Tools
 */

public class ApplyId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String merchantid;

	// Constructors

	/** default constructor */
	public ApplyId() {
	}

	/** minimal constructor */
	public ApplyId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ApplyId(Integer id, Users users, String merchantid) {
		this.id = id;
		this.users = users;
		this.merchantid = merchantid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getMerchantid() {
		return this.merchantid;
	}

	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApplyId))
			return false;
		ApplyId castOther = (ApplyId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getUsers() == castOther.getUsers()) || (this.getUsers() != null
						&& castOther.getUsers() != null && this.getUsers().equals(castOther.getUsers())))
				&& ((this.getMerchantid() == castOther.getMerchantid())
						|| (this.getMerchantid() != null && castOther.getMerchantid() != null
								&& this.getMerchantid().equals(castOther.getMerchantid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getUsers() == null ? 0 : this.getUsers().hashCode());
		result = 37 * result + (getMerchantid() == null ? 0 : this.getMerchantid().hashCode());
		return result;
	}

}