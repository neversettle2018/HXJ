package cn.ts.Entity;

/**
 * OrderDetail entity. @author MyEclipse Persistence Tools
 */

public class OrderDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private OrderInfo orderInfo;
	private Integer goodsId;
	private String goodsName;
	private Integer goodsNum;
	private String price;
	private String goodsSize;

	// Constructors

	/** default constructor */
	public OrderDetail() {
	}

	/** minimal constructor */
	public OrderDetail(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	/** full constructor */
	public OrderDetail(OrderInfo orderInfo, Integer goodsId, String goodsName, Integer goodsNum, String price,String goodsSize) {
		this.orderInfo = orderInfo;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.price = price;
		this.goodsSize = goodsSize;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderInfo getOrderInfo() {
		return this.orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsSize()
	{
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize)
	{
		this.goodsSize = goodsSize;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}