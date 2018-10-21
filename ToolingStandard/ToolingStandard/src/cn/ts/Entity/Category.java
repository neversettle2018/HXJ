package cn.ts.Entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable
{

	// Fields

	private Integer categoryId;
	private String categoryName;
	private Set trouserses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Category()
	{
	}

	/** full constructor */
	public Category(String categoryName, Set trouserses)
	{
		this.categoryName = categoryName;
		this.trouserses = trouserses;
	}

	// Property accessors

	public Integer getCategoryId()
	{
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getCategoryName()
	{
		return this.categoryName;
	}

	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}

	public Set getTrouserses()
	{
		return this.trouserses;
	}

	public void setTrouserses(Set trouserses)
	{
		this.trouserses = trouserses;
	}

}