package cn.ts.Entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Trousers entity. @author MyEclipse Persistence Tools
 */

public class Trousers implements java.io.Serializable
{

	// Fields

	private Integer id;
	private Category category;
	private String trousersId;
	private String price;
	private String goodsName;
	private Set stocks = new HashSet(0);
	private Set goodsComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Trousers()
	{
	}

	/** minimal constructor */
	public Trousers(String trousersId)
	{
		this.trousersId = trousersId;
	}

	/** full constructor */
	public Trousers(Category category, String trousersId, String price,
			String goodsName, Set stocks, Set goodsComments)
	{
		this.category = category;
		this.trousersId = trousersId;
		this.price = price;
		this.goodsName = goodsName;
		this.stocks = stocks;
		this.goodsComments = goodsComments;
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

	public Category getCategory()
	{
		return this.category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public String getTrousersId()
	{
		return this.trousersId;
	}

	public void setTrousersId(String trousersId)
	{
		this.trousersId = trousersId;
	}

	public String getPrice()
	{
		return this.price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getGoodsName()
	{
		return this.goodsName;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}

	public Set getStocks()
	{
		return this.stocks;
	}

	public void setStocks(Set stocks)
	{
		this.stocks = stocks;
	}

	public Set getGoodsComments()
	{
		return this.goodsComments;
	}

	public void setGoodsComments(Set goodsComments)
	{
		this.goodsComments = goodsComments;
	}

}