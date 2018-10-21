package testentity;

/**
 * Banner entity. @author MyEclipse Persistence Tools
 */

public class Banner implements java.io.Serializable {

	// Fields

	private Integer id;
	private String img;
	private String url;

	// Constructors

	/** default constructor */
	public Banner() {
	}

	/** full constructor */
	public Banner(String img, String url) {
		this.img = img;
		this.url = url;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}