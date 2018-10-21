package cn.ts.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.ts.Entity.*;

@Transactional
public class AdminDaoBusiness extends HibernateDaoSupport
{
	/**
	 * 管理员登录
	 * 
	 * @param adminname
	 * @param adminpass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Admin> Adminchecklogin(String adminname, String adminpass)
	{
		return (List<Admin>) getHibernateTemplate().find(
				"from Admin where adminId=? and adminPas=?", adminname,
				adminpass);
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
	 * 根据商品Id获取商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	public Trousers getGoodsByGoodsId(Integer goodsId)
	{
		return (Trousers) getHibernateTemplate().find(
				"from Trousers where Id=?", goodsId).get(0);
	}

	public void save(Trousers trousers)
	{
		getHibernateTemplate().save(trousers);
	}

	/**
	 * 根据分类Id获得分类名称
	 * 
	 * @param CateId
	 *            分类Id
	 * @return
	 */
	public Category getCategoryNameByCateId(Integer CateId)
	{
		return (Category) getHibernateTemplate().find(
				"from Category where categoryId=?", CateId).get(0);
	}

	/**
	 * 删除商品
	 * 
	 * @param goods
	 */
	public void delGoods(Trousers goods)
	{
		getHibernateTemplate().delete(goods);
	}

	/**
	 * 修改商品
	 * 
	 * @param goods
	 */
	public void updateGoods(Trousers goods)
	{
		getHibernateTemplate().update(goods);
	}

	/**
	 * 获得所有分类
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Category> getAllCate()
	{
		return (ArrayList<Category>) getHibernateTemplate().find(
				"from Category");
	}

	/**
	 * 获得所有订单信息
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<OrderInfo> getAllOrderInfos()
	{
		return (ArrayList<OrderInfo>) getHibernateTemplate().find(
				"from OrderInfo");
	}

	/**
	 * 发货的方法
	 */
	@SuppressWarnings("unchecked")
	public void Shipments(final String OrderNo)
	{
		final String OrderState = "已发货";
		getHibernateTemplate().execute(new HibernateCallback()
		{
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException
			{
				Query query = session
						.createQuery("update OrderInfo o set o.orderStatus=? where o.orderNo=?");
				query.setParameter(0, OrderState);
				query.setParameter(1, OrderNo);
				query.executeUpdate();
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public void updataGoods(final String TrousersId, final String Price,
			final String GoodsName, final Integer CategoryId, final Integer id)
	{
		getHibernateTemplate().execute(new HibernateCallback()
		{
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException
			{
				Query query = session
						.createQuery("update Trousers t set t.trousersId=?,t.price=?,t.goodsName=?,t.category.categoryId=? where t.id=?");
				query.setParameter(0, TrousersId);
				query.setParameter(1, Price);
				query.setParameter(2, GoodsName);
				query.setParameter(3, CategoryId);
				query.setParameter(4, id);
				query.executeUpdate();
				return null;
			}
		});
	}

	/**
	 * 测试mian方法
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AdminDaoBusiness d = (AdminDaoBusiness) ct.getBean("adminDaoBusiness");
		// List<Trousers> l=d.getAllTrousers();
		// for (Trousers Trousers : l)
		// {
		// System.out.println(d.getCategoryNameByCateId(Trousers.getCategory().getCategoryId()).getCategoryName());
		// }
		Trousers t = d.getGoodsByGoodsId(28);
		System.out.println(t.getCategory().getCategoryId());

	}
}
