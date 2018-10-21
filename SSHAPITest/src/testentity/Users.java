package testentity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String userid;
	private Integer id;
	private String userpassword;
	private String username;
	private String useremail;
	private String userphone;
	private String useraddress;
	private String userimg;
	private String userstate;
	private Set applies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Integer id, String userstate) {
		this.id = id;
		this.userstate = userstate;
	}

	/** full constructor */
	public Users(Integer id, String userpassword, String username, String useremail, String userphone,
			String useraddress, String userimg, String userstate, Set applies) {
		this.id = id;
		this.userpassword = userpassword;
		this.username = username;
		this.useremail = useremail;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.userimg = userimg;
		this.userstate = userstate;
		this.applies = applies;
	}

	// Property accessors

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return this.useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphone() {
		return this.userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseraddress() {
		return this.useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserimg() {
		return this.userimg;
	}

	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}

	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	public Set getApplies() {
		return this.applies;
	}

	public void setApplies(Set applies) {
		this.applies = applies;
	}

}