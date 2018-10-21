package testentity;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type implements java.io.Serializable {

	// Fields

	private TypeId id;

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** full constructor */
	public Type(TypeId id) {
		this.id = id;
	}

	// Property accessors

	public TypeId getId() {
		return this.id;
	}

	public void setId(TypeId id) {
		this.id = id;
	}

}