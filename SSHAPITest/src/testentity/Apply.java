package testentity;

/**
 * Apply entity. @author MyEclipse Persistence Tools
 */

public class Apply implements java.io.Serializable {

	// Fields

	private ApplyId id;
	private Users users;

	// Constructors

	/** default constructor */
	public Apply() {
	}

	/** minimal constructor */
	public Apply(ApplyId id) {
		this.id = id;
	}

	/** full constructor */
	public Apply(ApplyId id, Users users) {
		this.id = id;
		this.users = users;
	}

	// Property accessors

	public ApplyId getId() {
		return this.id;
	}

	public void setId(ApplyId id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}