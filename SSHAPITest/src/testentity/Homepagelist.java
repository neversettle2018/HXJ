package testentity;

/**
 * Homepagelist entity. @author MyEclipse Persistence Tools
 */

public class Homepagelist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Merchant merchant;
	private String title;
	private String area;
	private String city;
	private String salary;
	private String sex;
	private String tabName;
	private String dpType;
	private String apply;
	private String releaseTime;
	private String img;
	private String jobContent;
	private String people;
	private String way;
	private String linkman;
	private String linkway;
	private Integer audit;

	// Constructors

	/** default constructor */
	public Homepagelist() {
	}

	/** minimal constructor */
	public Homepagelist(Integer audit) {
		this.audit = audit;
	}

	/** full constructor */
	public Homepagelist(Merchant merchant, String title, String area, String city, String salary, String sex,
			String tabName, String dpType, String apply, String releaseTime, String img, String jobContent,
			String people, String way, String linkman, String linkway, Integer audit) {
		this.merchant = merchant;
		this.title = title;
		this.area = area;
		this.city = city;
		this.salary = salary;
		this.sex = sex;
		this.tabName = tabName;
		this.dpType = dpType;
		this.apply = apply;
		this.releaseTime = releaseTime;
		this.img = img;
		this.jobContent = jobContent;
		this.people = people;
		this.way = way;
		this.linkman = linkman;
		this.linkway = linkway;
		this.audit = audit;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTabName() {
		return this.tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getDpType() {
		return this.dpType;
	}

	public void setDpType(String dpType) {
		this.dpType = dpType;
	}

	public String getApply() {
		return this.apply;
	}

	public void setApply(String apply) {
		this.apply = apply;
	}

	public String getReleaseTime() {
		return this.releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getJobContent() {
		return this.jobContent;
	}

	public void setJobContent(String jobContent) {
		this.jobContent = jobContent;
	}

	public String getPeople() {
		return this.people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getWay() {
		return this.way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkway() {
		return this.linkway;
	}

	public void setLinkway(String linkway) {
		this.linkway = linkway;
	}

	public Integer getAudit() {
		return this.audit;
	}

	public void setAudit(Integer audit) {
		this.audit = audit;
	}

}