package cn.ts.Entity;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class ShoppingCart implements java.io.Serializable
{
	// Fields

	private Integer id;
	private Integer userId;
	private String goodsPrice;
	private Integer goodsNum;
	private String imageUrl;
	private String goodsId;
	private String goodsName;
	private String goodsSize;

	// Constructors

	/** default constructor */
	public ShoppingCart()
	{
	}

	/** full constructor */
	public ShoppingCart(Integer userId, String goodsPrice,
			Integer goodsNum, String imageUrl,String goodsName,String goodsSize)
	{
		this.userId = userId;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.imageUrl = imageUrl;
		this.goodsName = goodsName;
		this.goodsSize = goodsSize;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getUserId()
	{
		return this.userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getGoodsPrice()
	{
		return this.goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice)
	{
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsNum()
	{
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum)
	{
		this.goodsNum = goodsNum;
	}

	public String getImageUrl()
	{
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public String getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(String goodsId)
	{
		this.goodsId = goodsId;
	}

	public String getGoodsName()
	{
		return goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	public String getGoodsSize()
	{
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize)
	{
		this.goodsSize = goodsSize;
	}


}