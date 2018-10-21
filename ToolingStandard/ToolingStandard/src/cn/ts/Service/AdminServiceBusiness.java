package cn.ts.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import cn.ts.Dao.AdminDaoBusiness;
import cn.ts.Entity.*;

public class AdminServiceBusiness {
	@Resource(name = "adminDaoBusiness")
	private AdminDaoBusiness adminDaoBusiness;
	

	/**
	 * 管理员登录
	 * 
	 * @param adminname
	 * @param adminpass
	 * @return
	 */
	public boolean adminchecklogin(String adminname, String adminpass) 
	{
		List<Admin> admin = (adminDaoBusiness.Adminchecklogin(adminname, adminpass));
		if (admin.size() > 0)
			return true;
		else
			return false;
	}
	
	/**
	 * 获取所有商品信息
	 *            分类名字显示中文
	 * @return
	 */
	public ArrayList<Trousers> getAllTrousers()
	{
		ArrayList<Trousers> goods = adminDaoBusiness.getAllTrousers();
		for (int i = 0; i < goods.size(); i++)
		{
			goods.get(i).setCategory(adminDaoBusiness.getCategoryNameByCateId(goods.get(i).getCategory().getCategoryId()));
		}
		return goods;
	}
	
	/**
	 * 获取所有商品信息
	 *            分类名字显示代号
	 * @return
	 */
	public ArrayList<Trousers> getGoods()
	{
		return adminDaoBusiness.getAllTrousers();
	}
	
	/**
	 * 根据商品Id获取商品信息
	 * @param goodsId
	 * @return
	 */
	public Trousers getGoodsByGoodsId(Integer goodsId)
	{
		return adminDaoBusiness.getGoodsByGoodsId(goodsId);
	}
	
	
	/**
	 * 删除商品     先查后删
	 * @param goodsId
	 * 			商品ID
	 */
	public void delGoodsByGoodsId(Integer goodsId)
	{
		Trousers goods = getGoodsByGoodsId(goodsId);
		adminDaoBusiness.delGoods(goods);
	}
	
	public ArrayList<Category> getAllCate()
	{
		return adminDaoBusiness.getAllCate();
	}
	
	public ArrayList<OrderInfo> getAllOrderInfos()
	{
		return adminDaoBusiness.getAllOrderInfos();
	}
	
	//发货
	public void Shipments(final String OrderNo)
	{
		adminDaoBusiness.Shipments(OrderNo);
	}
	
	public void saveGoods(Trousers trousers)
	{
		//trousers.setCategory(adminDaoBusiness.getCategoryNameByCateId(cateId));
		adminDaoBusiness.save(trousers);
	}
	
	/**
	 * 修改商品
	 * 
	 * @param goods
	 */
	public void updateGoods(Trousers goods)
	{
		adminDaoBusiness.updateGoods(goods);
	}
	
	public void updataGoods(final String TrousersId, final String Price,
			final String GoodsName, final Integer CategoryId, final Integer id)
	{
		adminDaoBusiness.updataGoods(TrousersId, Price, GoodsName, CategoryId, id);
	}
}
