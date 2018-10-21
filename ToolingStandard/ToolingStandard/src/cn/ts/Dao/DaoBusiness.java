package cn.ts.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import cn.ts.Entity.*;

@Transactional
public class DaoBusiness extends HibernateDaoSupport
{

	/**
	 * 登录
	 * 
	 * @param username
	 * @param userpass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Users> checklogin1(String username, String userpass)
	{
		return (List<Users>) getHibernateTemplate().find(
				"from Users where UserName=? and UserPassword=?", username,
				userpass);
	}

	/**
	 * 检查用户名是否存在(当前在用)
	 * 
	 * @param username
	 * @return
	 */
	public Users checkUserName(String username)
	{
		if ((getHibernateTemplate().find("from Users Where UserName=?",
				username).size()) > 0)
		{
			return (Users) getHibernateTemplate().find(
					"from Users Where UserName=?", username).get(0);
		}
		else
		{
			return null;
		}
	}

	/**
	 * 检查用户名是否存在1
	 * 
	 * @param username
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Users> checkUserName1(String username)
	{
		return (List<Users>) getHibernateTemplate().find(
				"from Users Where UserName=?", username);
	}

	/**
	 * 注册
	 * 
	 * @param users
	 * @throws Exception
	 */
	public void register(Users users) throws Exception
	{
		getHibernateTemplate().save(users);
	}

	/**
	 * 获取所有商品信息
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Trousers> getAllTrousers()
	{
		return (ArrayList<Trousers>) getHibernateTemplate().find(
				"from Trousers");
	}

	/**
	 * 通过GoodsId查询商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Trousers> getTrousersByGoodsId(int goodsId)
	{
		return (ArrayList<Trousers>) getHibernateTemplate().find(
				"from Trousers where id = ?", goodsId);
	}

	/**
	 * 通过商品ID获取商品库存信息及尺寸信息
	 * 
	 * @param goodsId
	 *            商品ID
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Stock> getStockInfoByGoodsId(int goodsId)
	{
		return (ArrayList<Stock>) getHibernateTemplate().find(
				"from Stock s where s.trousers.id  = ?", goodsId);
	}

	/**
	 * 通过USerId查询用户信息
	 * 
	 * @param userName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Users> getUserId(String userName)
	{
		return (ArrayList<Users>) getHibernateTemplate().find(
				"from Users where UserName = ?", userName);
	}

	/**
	 * 通过用户Id获取购物车信息
	 * 
	 * @param userId
	 *            用户Id
	 * @return 购物车数组集合
	 */
	public ArrayList<ShoppingCart> getUserGwc(Integer userId)
	{
		@SuppressWarnings("unchecked")
		ArrayList<ShoppingCart> cart = (ArrayList<ShoppingCart>) getHibernateTemplate()
				.find("from ShoppingCart where UserId=?", userId);
		return cart;
	}
	
	/**
	 * 通过用户Id获取订单信息
	 * 
	 * @param userId
	 *            用户Id
	 * @return 购物车数组集合
	 */
	public ArrayList<OrderInfo> getUserOrderInfo(Integer userId)
	{
		@SuppressWarnings("unchecked")
		ArrayList<OrderInfo> oi = (ArrayList<OrderInfo>) getHibernateTemplate()
				.find("from OrderInfo where userId=?", userId);
		return oi;
	}

	/**
	 * 添加商品到购物车
	 * 
	 * @param goods
	 *            商品
	 */
	public void addGoods(ShoppingCart goods)
	{
		getHibernateTemplate().save(goods);
	}

	/**
	 * 修改购物车信息
	 * 
	 * @param goods
	 *            商品
	 */
	public void updateGoods(ShoppingCart goods)
	{
		getHibernateTemplate().update(goods);
	}

	public String updateGoodsNum(final Integer goodsId, final Integer goodsNum)
	{
		@SuppressWarnings(
		{ "unchecked" })
		Object o = getHibernateTemplate().execute(new HibernateCallback()
		{

			public Object doInHibernate(Session session)
					throws HibernateException
			{
				SQLQuery query = session
						.createSQLQuery("update ShoppingCart set goodsNum="
								+ goodsNum + " where id=" + goodsId);
				try
				{
					int ii = query.executeUpdate();
					return "success";
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return "fail";
			}
		});
		return o.toString();
	}

	/**
	 * 删除商品
	 * 
	 * @param goodsId
	 *            商品Id
	 */
	public void delGoods(ShoppingCart goods)
	{
		getHibernateTemplate().delete(goods);
	}

	public ShoppingCart getGoodsById(Integer goodsId)
	{
		return (ShoppingCart) getHibernateTemplate().find(
				"from ShoppingCart where Id=?", goodsId).get(0);
	}

	/**
	 * 获取评论
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Comment> getComment()
	{
		return (ArrayList<Comment>) getHibernateTemplate().find("from Comment");
	}

	/**
	 * 添加评论
	 * 
	 * @param comment
	 */
	public void addComment(Comment comment)
	{
		getHibernateTemplate().save(comment);
	}

	/**
	 * 分页获取商品
	 * 
	 * @param pageNum
	 *            客户需要显示的页面
	 * @param pageSize
	 *            页面大小
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Trousers> getAllTrousers(int pageNum, int pageSize)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Trousers.class);
		List<Trousers> list = (List<Trousers>) this.getHibernateTemplate()
				.findByCriteria(criteria, (pageNum - 1) * pageSize, pageSize);
		return list;
	}

	/**
	 * 强行重复写的分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Trousers> getAllBoutique(final int pageNum, final int pageSize)
	{
		return getHibernateTemplate().executeWithNativeSession(
				new HibernateCallback<List<Trousers>>()
				{
					@Override
					public List<Trousers> doInHibernate(Session session)
							throws HibernateException
					{
						String hql = "from Trousers t where t.category.categoryId=1"; // 精品
						return session.createQuery(hql)
								.setFirstResult((pageNum - 1) * pageSize)
								.setMaxResults(pageSize).list();
					}
				});
	}

	/**
	 * 强行重复写的分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Trousers> getAllTops(final int pageNum, final int pageSize)
	{
		return getHibernateTemplate().executeWithNativeSession(
				new HibernateCallback<List<Trousers>>()
				{
					@Override
					public List<Trousers> doInHibernate(Session session)
							throws HibernateException
					{
						String hql = "from Trousers t where t.category.categoryId=2"; // 上衣
						return session.createQuery(hql)
								.setFirstResult((pageNum - 1) * pageSize)
								.setMaxResults(pageSize).list();
					}
				});
	}

	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Trousers> getAllTrousers1(final int pageNum, final int pageSize)
	{
		return getHibernateTemplate().executeWithNativeSession(
				new HibernateCallback<List<Trousers>>()
				{
					@Override
					public List<Trousers> doInHibernate(Session session)
							throws HibernateException
					{
						String hql = "from Trousers t where t.category.categoryId=3"; // 裤子
						return session.createQuery(hql)
								.setFirstResult((pageNum - 1) * pageSize)
								.setMaxResults(pageSize).list();
					}
				});
	}

	/**
	 * 获取商品总记录数
	 * 
	 * @return
	 */
	public int getBoutiqueAllRowCount()
	{
		return getHibernateTemplate().find(
				"from Trousers t where t.category.categoryId=1").size(); // 精品
	}

	public int getTopsAllRowCount()
	{
		return getHibernateTemplate().find(
				"from Trousers t where t.category.categoryId=2").size(); // 上衣
	}

	public int getTrousersAllRowCount()
	{
		return getHibernateTemplate().find(
				"from Trousers t where t.category.categoryId=3").size(); // 裤子
	}

	/**
	 * 保存订单信息
	 * @param orderInfo
	 */
	public void saveOrderInfo(OrderInfo orderInfo)
	{
		getHibernateTemplate().save(orderInfo);
	}

	/**
	 * 清空购物车
	 * @param UserId
	 */
	@SuppressWarnings(
	{ "rawtypes", "unchecked" })
	public void removeShoppingCart(final Integer UserId)
	{
		getHibernateTemplate().execute(new HibernateCallback()
		{

			public Object doInHibernate(Session session)
					throws HibernateException
			{
				Query query = session
						.createQuery("delete ShoppingCart where UserId=?");
				query.setParameter(0, UserId);
				query.executeUpdate();
				return null;
			}
		});
	}

	/**
	 * 根据用户Id查询该用户的订单信息
	 * @param UserId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<OrderInfo> getOrderInfoByUserId(Integer UserId)
	{
		return (List<OrderInfo>) getHibernateTemplate().find("from OrderInfo where userId=?", UserId);
	}
	
	/**
	 * 根据订单编号查询该用户的订单详情
	 * @param UserId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<OrderDetail> getOrderDetailByOrderNo(final String orderNo)
	{
		return getHibernateTemplate().execute(new HibernateCallback<List<OrderDetail>>()
		{

			public List<OrderDetail> doInHibernate(Session session)
					throws HibernateException
			{
				Query query = session
						.createQuery("from OrderDetail where orderNo=?");
				query.setParameter(0, orderNo);
				List<OrderDetail> list=query.list();
				return  list;
			}
		});
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
		DaoBusiness d=(DaoBusiness) ct.getBean("daoBusiness");
		String a= "1530000520320";
		List<OrderDetail> l=d.getOrderDetailByOrderNo(a);
		for (OrderDetail orderDetail : l)
		{
			System.out.println(orderDetail.getPrice());
		}
		
		
	}
}
