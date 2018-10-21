package cn.ts.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import cn.ts.Dao.DaoBusiness;
import cn.ts.Entity.*;
import cn.ts.RSA.RSAUtils;

public class ServiceBusiness
{
	@Resource(name = "daoBusiness")
	private DaoBusiness daoBusiness;

	/**
	 * 检查是否有该用户名
	 * 
	 * @param username
	 * @return
	 */
	public boolean checkUserName(String username)
	{
		List<Users> list = daoBusiness.checkUserName1(username);
		if (list.size() > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * 登录
	 * 
	 * @param username
	 * @param userpass
	 * @return
	 */
	public boolean checklogin(String username, String userpass)
	{

		try
		{
			Users users = daoBusiness.checkUserName(username);
			String ming;
			if (users == null)
			{
				return false;
			}
			else
			{
				ming = RSAUtils.decryptWithRSA(users.getUserPassword());
				if (ming.equals(userpass))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 注册方法
	 * 
	 * @param users
	 */
	public void register(Users users)
	{
		try
		{
			daoBusiness.register(users);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 通过用户名查询用户信息
	 * 
	 * @param userName
	 * @return
	 */
	public ArrayList<Users> getUserId(String userName)
	{
		return daoBusiness.getUserId(userName);
	}

	/**
	 * 查询所有商品信息
	 * 
	 * @return
	 */
	public ArrayList<Trousers> getAllTrousers()
	{
		return daoBusiness.getAllTrousers();
	}

	/**
	 * 通过用户Id查询用户的购物车
	 * 
	 * @param userId
	 * @return
	 */
	public ArrayList<ShoppingCart> getUserGwc(Integer userId)
	{
		return daoBusiness.getUserGwc(userId);
	}

	/**
	 * 添加商品到购物车
	 * 
	 * @param goods
	 */
	public void addGoods(ShoppingCart goods)
	{
		boolean isHave = false; // 用来标记有没有重复购物项
		// 通过UserId查询购物车中的商品信息
		ArrayList<ShoppingCart> gwcAll = getUserGwc(goods.getUserId());
		// 循环查找商品信息 若商品重复就只增加数量
		for (ShoppingCart list : gwcAll)
		{
			if (list.getGoodsId().equals(goods.getGoodsId()))
			{
				if (!list.getGoodsSize().equals(goods.getGoodsSize()))
				{
					isHave = false;
				}
				else
				{
					list.setGoodsNum(goods.getGoodsNum());
					daoBusiness.updateGoods(list);
					isHave = true;
					break;
				}
			}
		}
		// 如果不存在就添加
		if (!isHave)
		{
			daoBusiness.addGoods(goods);
		}
	}

	/**
	 * 将商品从购物车中删除
	 * 
	 * @param goods
	 */
	public void delGoods(ShoppingCart goods)
	{
		daoBusiness.delGoods(goods);
	}

	/**
	 * 商品总价
	 * 
	 * @param userId
	 * @return
	 */
	public Integer totalPrice(Integer userId)
	{
		int TotalPrice = 0;
		ArrayList<ShoppingCart> goods = daoBusiness.getUserGwc(userId);
		for (ShoppingCart list : goods)
		{
			TotalPrice += Integer.parseInt(list.getGoodsPrice())
					* list.getGoodsNum();
		}
		// System.out.println("-----------------------"+TotalPrice);
		return TotalPrice;
	}

	/**
	 * 商品总数
	 * 
	 * @param userId
	 * @return
	 */
	public Integer totalNum(Integer userId)
	{
		int TotalNum = 0;
		ArrayList<ShoppingCart> goods = daoBusiness.getUserGwc(userId);
		for (ShoppingCart list : goods)
		{
			TotalNum += list.getGoodsNum();
		}
		return TotalNum;
	}

	/**
	 * 修改商品数量
	 * 
	 * @param goodsId
	 *            商品ID
	 * @param goodsNum
	 *            修改数量
	 * @return
	 */
	public String updateGoodsNum(Integer goodsId, Integer goodsNum)
	{
		return daoBusiness.updateGoodsNum(goodsId, goodsNum);
	}

	public ArrayList<Comment> getComment()
	{
		return daoBusiness.getComment();
	}

	public void addComment(Comment comment)
	{
		daoBusiness.addComment(comment);
		;
	}

	/**
	 * 获取总记录数
	 * 
	 * @return
	 */
	public int getBoutiqueAllRowCount()
	{
		return daoBusiness.getBoutiqueAllRowCount();
	}

	public int getTopsAllRowCount()
	{
		return daoBusiness.getTopsAllRowCount();
	}

	public int getTrousersAllRowCount()
	{
		return daoBusiness.getTrousersAllRowCount();
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
	public List<Trousers> getAllBoutique1(int pageNum, int pageSize)
	{
		return daoBusiness.getAllBoutique(pageNum, pageSize);
	}

	public List<Trousers> getAllTops1(int pageNum, int pageSize)
	{
		return daoBusiness.getAllTops(pageNum, pageSize);
	}

	public List<Trousers> getAllTrousers1(int pageNum, int pageSize)
	{
		return daoBusiness.getAllTrousers1(pageNum, pageSize);
	}

	// 业务层查询商品带分页的方法
	public PageBean<Trousers> getAllTrousers(int pageNow, int pageSize)
	{
		PageBean<Trousers> pageBean = new PageBean<Trousers>();
		// 设置当前页数；
		pageBean.setPageNow(pageNow);
		// 设置每页显示记录数
		pageBean.setPageSize(pageSize);
		// 设置总记录条数
		int rowCount = this.getTrousersAllRowCount();
		pageBean.setRowCount(rowCount);
		// 设置总页数
		int pageCount = 0;
		if (rowCount % pageSize == 0)
		{
			pageCount = rowCount / pageSize;
		}
		else
		{
			pageCount = rowCount / pageSize + 1;
		}
		pageBean.setPageCount(pageCount);
		// 设置显示到页面的数据的集合
		List<Trousers> list = this.getAllTrousers1(pageNow, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public PageBean<Trousers> getAllBoutique(int pageNow, int pageSize)
	{
		PageBean<Trousers> pageBean = new PageBean<Trousers>();
		// 设置当前页数；
		pageBean.setPageNow(pageNow);
		// 设置每页显示记录数
		pageBean.setPageSize(pageSize);
		// 设置总记录条数
		int rowCount = this.getBoutiqueAllRowCount();
		pageBean.setRowCount(rowCount);
		// 设置总页数
		int pageCount = 0;
		if (rowCount % pageSize == 0)
		{
			pageCount = rowCount / pageSize;
		}
		else
		{
			pageCount = rowCount / pageSize + 1;
		}
		pageBean.setPageCount(pageCount);
		// 设置显示到页面的数据的集合
		List<Trousers> list = this.getAllBoutique1(pageNow, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public PageBean<Trousers> getAllTops(int pageNow, int pageSize)
	{
		PageBean<Trousers> pageBean = new PageBean<Trousers>();
		// 设置当前页数；
		pageBean.setPageNow(pageNow);
		// 设置每页显示记录数
		pageBean.setPageSize(pageSize);
		// 设置总记录条数
		int rowCount = this.getTopsAllRowCount();
		pageBean.setRowCount(rowCount);
		// 设置总页数
		int pageCount = 0;
		if (rowCount % pageSize == 0)
		{
			pageCount = rowCount / pageSize;
		}
		else
		{
			pageCount = rowCount / pageSize + 1;
		}
		pageBean.setPageCount(pageCount);
		// 设置显示到页面的数据的集合
		List<Trousers> list = this.getAllTops1(pageNow, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	/**
	 * 通过GoodsId查询商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	public ArrayList<Trousers> getTrousersByGoodsId(int goodsId)
	{
		return daoBusiness.getTrousersByGoodsId(goodsId);
	}

	/**
	 * 通过商品ID获取商品库存信息及尺寸信息
	 * 
	 * @param goodsId
	 *            商品ID
	 * @return
	 */
	public ArrayList<Stock> getStockInfoByGoodsId(int goodsId)
	{
		return daoBusiness.getStockInfoByGoodsId(goodsId);
	}

    /**
     * 添加订单
     * @param shoppingCart
     * @param orderInfo
     */
    public void addOrderInfo(ArrayList<ShoppingCart> shoppingCart, OrderInfo orderInfo) {
        OrderInfo oi = orderInfo;
        Set<OrderDetail> orderInfoS = new HashSet<>();// 订单信息集合
        String orderno = System.currentTimeMillis()+(int)(Math.random()*9+1)*1000+"";
        for (ShoppingCart sc : shoppingCart) {
            OrderDetail od = new OrderDetail();
            od.setGoodsId(sc.getUserId());
            od.setGoodsName(sc.getGoodsName());
            od.setGoodsNum(sc.getGoodsNum());
            od.setGoodsSize(sc.getGoodsSize());
            od.setPrice(sc.getGoodsPrice());
            od.setOrderInfo(oi);
            orderInfoS.add(od);
        }
        oi.setOrderTime(new Timestamp(System.currentTimeMillis()));
        oi.setIsSent(0);
        oi.setOrderNo(orderno);
        oi.setOrderStatus("待发货");
        oi.setOrderDetails(orderInfoS);
        daoBusiness.saveOrderInfo(oi);
    }

	public void removeShoppingCart(Integer UserId)
	{
		daoBusiness.removeShoppingCart(UserId);
	}

	public List<OrderInfo> getOrderInfoByUserId(Integer UserId)
	{
		return daoBusiness.getOrderInfoByUserId(UserId);
	}
	
	public List<OrderDetail> getOrderDetailByOrderNo(String orderNo)
	{
		return daoBusiness.getOrderDetailByOrderNo(orderNo.toString().trim());
	}
	
	public ArrayList<OrderInfo> getUserOrderInfo(Integer userId)
	{
		return (ArrayList<OrderInfo>) daoBusiness.getOrderInfoByUserId(userId);
	}
}
