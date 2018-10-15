package entity;

import java.util.List;

public class Students {
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	



	public StudentList getList() {
		return list;
	}
	public void setList(StudentList list) {
		this.list = list;
	}




	private String userid;
	private String password;
	private String mail;
	private String phone;
	private String address;
	private StudentList list;
	private List<String> studentlist;
	public List<String> getStudentlist() {
		return studentlist;
	}
	public void setStudentlist(List<String> studentlist) {
		this.studentlist = studentlist;
	}
	
 	
}
