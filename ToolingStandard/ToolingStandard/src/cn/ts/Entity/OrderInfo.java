package cn.ts.Entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */

public class OrderInfo implements java.io.Serializable {

	// Fields

	private String orderNo;
	private String orderUserName;
	private Timestamp orderTime;
	private Integer isSent;
	private Integer userId;
	private String orderStatus;
	private String address;
	private String phone;
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** minimal constructor */
	public OrderInfo(String orderNo) {
		this.orderNo = orderNo;
	}

	/** full constructor */
	public OrderInfo(String orderNo, String orderUserName, Timestamp orderTime, Integer isSent, Integer userId,
			String orderStatus, String address, String phone, Set orderDetails) {
		this.orderNo = orderNo;
		this.orderUserName = orderUserName;
		this.orderTime = orderTime;
		this.isSent = isSent;
		this.userId = userId;
		this.orderStatus = orderStatus;
		this.address = address;
		this.phone = phone;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderUserName() {
		return this.orderUserName;
	}

	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getIsSent() {
		return this.isSent;
	}

	public void setIsSent(Integer isSent) {
		this.isSent = isSent;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}