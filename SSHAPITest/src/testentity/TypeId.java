package testentity;

/**
 * TypeId entity. @author MyEclipse Persistence Tools
 */

public class TypeId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;

	// Constructors

	/** default constructor */
	public TypeId() {
	}

	/** minimal constructor */
	public TypeId(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TypeId(Integer id, String type) {
		this.id = id;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TypeId))
			return false;
		TypeId castOther = (TypeId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}