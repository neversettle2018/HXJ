package testentity;

/**
 * Sysdiagrams entity. @author MyEclipse Persistence Tools
 */

public class Sysdiagrams implements java.io.Serializable {

	// Fields

	private Integer diagramId;
	private String name;
	private Integer principalId;
	private Integer version;
	private String definition;

	// Constructors

	/** default constructor */
	public Sysdiagrams() {
	}

	/** minimal constructor */
	public Sysdiagrams(String name, Integer principalId) {
		this.name = name;
		this.principalId = principalId;
	}

	/** full constructor */
	public Sysdiagrams(String name, Integer principalId, Integer version, String definition) {
		this.name = name;
		this.principalId = principalId;
		this.version = version;
		this.definition = definition;
	}

	// Property accessors

	public Integer getDiagramId() {
		return this.diagramId;
	}

	public void setDiagramId(Integer diagramId) {
		this.diagramId = diagramId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrincipalId() {
		return this.principalId;
	}

	public void setPrincipalId(Integer principalId) {
		this.principalId = principalId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

}