package testentity;

import java.util.HashSet;
import java.util.Set;

/**
 * Merchant entity. @author MyEclipse Persistence Tools
 */

public class Merchant implements java.io.Serializable {

	// Fields

	private String merchantid;
	private Integer id;
	private String merchantpassword;
	private String merchantname;
	private String merchantaddress;
	private String merchantstate;
	private Set homepagelists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Merchant() {
	}

	/** minimal constructor */
	public Merchant(Integer id, String merchantstate) {
		this.id = id;
		this.merchantstate = merchantstate;
	}

	/** full constructor */
	public Merchant(Integer id, String merchantpassword, String merchantname, String merchantaddress,
			String merchantstate, Set homepagelists) {
		this.id = id;
		this.merchantpassword = merchantpassword;
		this.merchantname = merchantname;
		this.merchantaddress = merchantaddress;
		this.merchantstate = merchantstate;
		this.homepagelists = homepagelists;
	}

	// Property accessors

	public String getMerchantid() {
		return this.merchantid;
	}

	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMerchantpassword() {
		return this.merchantpassword;
	}

	public void setMerchantpassword(String merchantpassword) {
		this.merchantpassword = merchantpassword;
	}

	public String getMerchantname() {
		return this.merchantname;
	}

	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}

	public String getMerchantaddress() {
		return this.merchantaddress;
	}

	public void setMerchantaddress(String merchantaddress) {
		this.merchantaddress = merchantaddress;
	}

	public String getMerchantstate() {
		return this.merchantstate;
	}

	public void setMerchantstate(String merchantstate) {
		this.merchantstate = merchantstate;
	}

	public Set getHomepagelists() {
		return this.homepagelists;
	}

	public void setHomepagelists(Set homepagelists) {
		this.homepagelists = homepagelists;
	}

}