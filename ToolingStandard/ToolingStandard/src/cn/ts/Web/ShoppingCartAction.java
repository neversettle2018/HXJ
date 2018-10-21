package cn.ts.Web;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.ts.Entity.*;
import cn.ts.Service.ServiceBusiness;

/**
 * 购物车、商品Action
 * @author Kid
 *
 */
@SuppressWarnings("serial")
public class ShoppingCartAction extends ActionSupport
{
	@Resource(name = "serviceBusiness")
	private ServiceBusiness serviceBusiness;

	private Integer totalPrice;//总价
	private Integer totalNum;//总数量
	private String num;// 购买商品数量
	private String gid;// 商品ID
	private String orderNo;//订单编号

	private ArrayList<ShoppingCart> shoppingCart;// 购物车信息集合
	private ShoppingCart goods;// 购物车对象
	private ArrayList<Stock> stocks;// 库存信息集合
	private Trousers shangping;// 商品对象
	private OrderInfo orderInfo;// 订单信息对象
	private ArrayList<OrderInfo> orderInfos;// 订单信息集合
	private OrderDetail orderDetail;// 订单详情对象
	private ArrayList<OrderDetail> orderDetails;// 订单详情集合

	Integer userId = (Integer) ActionContext.getContext().getSession()
			.get("userid");

	public OrderInfo getOrderInfo()
	{
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo)
	{
		this.orderInfo = orderInfo;
	}

	public ArrayList<ShoppingCart> getShoppingCart()
	{
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<ShoppingCart> shoppingCart)
	{
		this.shoppingCart = shoppingCart;
	}

	public ShoppingCart getGoods()
	{
		return goods;
	}

	public void setGoods(ShoppingCart goods)
	{
		this.goods = goods;
	}

	public Integer getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public Integer getTotalNum()
	{
		return totalNum;
	}

	public void setTotalNum(Integer totalNum)
	{
		this.totalNum = totalNum;
	}

	public String getNum()
	{
		return num;
	}

	public void setNum(String num)
	{
		this.num = num;
	}

	public String getGid()
	{
		return gid;
	}

	public void setGid(String gid)
	{
		this.gid = gid;
	}

	public ArrayList<Stock> getStocks()
	{
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks)
	{
		this.stocks = stocks;
	}

	public Trousers getShangping()
	{
		return shangping;
	}

	public void setShangping(Trousers shangping)
	{
		this.shangping = shangping;
	}

	public OrderDetail getOrderDetail()
	{
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail)
	{
		this.orderDetail = orderDetail;
	}

	public ArrayList<OrderDetail> getOrderDetails()
	{
		return orderDetails;
	}

	public void setOrderDetails(ArrayList<OrderDetail> orderDetails)
	{
		this.orderDetails = orderDetails;
	}

	public ArrayList<OrderInfo> getOrderInfos()
	{
		return orderInfos;
	}

	public void setOrderInfos(ArrayList<OrderInfo> orderInfos)
	{
		this.orderInfos = orderInfos;
	}

	public String getOrderNo()
	{
		return orderNo;
	}

	public void setOrderNo(String orderNo)
	{
		this.orderNo = orderNo;
	}

	/**
	 * 购物车集合赋值
	 * @return
	 */
	public String shoppingCart()
	{
		shoppingCart = serviceBusiness.getUserGwc(userId);
		totalPrice = serviceBusiness.totalPrice(userId);
		totalNum = serviceBusiness.totalNum(userId);
		return SUCCESS;
	}

	/**
	 * 增加商品
	 * @return
	 */
	public String addGoods()
	{
		if (userId != null)
		{
			goods.setUserId(userId);
			goods.setGoodsNum(Integer.parseInt(num));
			serviceBusiness.addGoods(goods);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	/**
	 * 删除商品
	 * @return
	 */
	public String delGoods()
	{
		serviceBusiness.delGoods(goods);
		return SUCCESS;
	}

	/**
	 * 更新购物车商品数量
	 * @return
	 */
	public String updateGoodsNum()
	{
		return serviceBusiness.updateGoodsNum(Integer.parseInt(gid),
				Integer.parseInt(num));
	}

	/**
	 * 商品详情
	 * @return
	 */
	public String goodsDetail()
	{
		stocks = serviceBusiness.getStockInfoByGoodsId(Integer.parseInt(gid));
		shangping = serviceBusiness.getTrousersByGoodsId(Integer.parseInt(gid))
				.get(0);
		return SUCCESS;
	}

	/**
	 * 确认订单
	 * @return
	 */
	public String confirmOrder()
	{
		shoppingCart = serviceBusiness.getUserGwc(userId);
        orderInfo.setUserId(userId);
        serviceBusiness.addOrderInfo(shoppingCart,orderInfo);
        orderInfos = (ArrayList<OrderInfo>) serviceBusiness.getOrderInfoByUserId(userId);
        serviceBusiness.removeShoppingCart(userId);
        return SUCCESS;
	}
	
	/**
	 * 通过订单编号查询订单详情
	 * @return
	 */
	public String orderDetail()
	{
		orderDetails = (ArrayList<OrderDetail>) serviceBusiness.getOrderDetailByOrderNo(orderNo);
		return SUCCESS;
	}
	
	/**
	 * 清空购物车
	 * @param UserId
	 * 			用户Id
	 * @return
	 */
	public String removeShoppingCart()
	{
		serviceBusiness.removeShoppingCart(userId);
		return SUCCESS;
	}
	
	public String getUserOrderInfo()
	{
		orderInfos = serviceBusiness.getUserOrderInfo(userId);
		return SUCCESS;
	}
}
