package cn.ts.Web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.ts.Entity.*;
import cn.ts.Service.AdminServiceBusiness;

public class AdminAction extends ActionSupport
{
	@Resource(name = "adminServiceBusiness")
	private AdminServiceBusiness adminServiceBusiness;
	
	private List<Trousers> Goods;//商品对象集合
	private ArrayList<Category> Categorys;//分类集合
	private ArrayList<OrderInfo> orderInfos;
	private Trousers ware;//商品对象

	private String cateId;
	private String adminlogname;//管理员账号
	private String adminlogpass;//管理员密码
	private Integer goodsId; //商品ID
	private String orderNo;//订单编号
    private File image; //上传的文件
    private String imageFileName; //文件名称
    private String imageContentType; //文件类型
  

	String adminName = (String) ActionContext.getContext().getSession()
			.get("adminlogname");
	
	
	public String getAdminlogname()
	{
		return adminlogname;
	}

	public void setAdminlogname(String adminlogname)
	{
		this.adminlogname = adminlogname;
	}

	public String getAdminlogpass()
	{
		return adminlogpass;
	}

	public void setAdminlogpass(String adminlogpass)
	{
		this.adminlogpass = adminlogpass;
	}

	public List<Trousers> getGoods()
	{
		return Goods;
	}

	public void setGoods(List<Trousers> goods)
	{
		Goods = goods;
	}

	public String getAdminName()
	{
		return adminName;
	}

	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}

	public Trousers getWare()
	{
		return ware;
	}

	public void setWare(Trousers ware)
	{
		this.ware = ware;
	}

	public Integer getGoodsId()
	{
		return goodsId;
	}

	public void setGoodsId(Integer goodsId)
	{
		this.goodsId = goodsId;
	}

	public ArrayList<Category> getCategorys()
	{
		return Categorys;
	}

	public void setCategorys(ArrayList<Category> categorys)
	{
		Categorys = categorys;
	}

	public String getOrderNo()
	{
		return orderNo;
	}

	public void setOrderNo(String orderNo)
	{
		this.orderNo = orderNo;
	}

	public ArrayList<OrderInfo> getOrderInfos()
	{
		return orderInfos;
	}

	public void setOrderInfos(ArrayList<OrderInfo> orderInfos)
	{
		this.orderInfos = orderInfos;
	}
	public File getImage()
	{
		return image;
	}

	public void setImage(File image)
	{
		this.image = image;
	}

	public String getImageFileName()
	{
		return imageFileName;
	}

	public void setImageFileName(String imageFileName)
	{
		this.imageFileName = imageFileName;
	}

	public String getImageContentType()
	{
		return imageContentType;
	}

	public void setImageContentType(String imageContentType)
	{
		this.imageContentType = imageContentType;
	}

	public String getCateId()
	{
		return cateId;
	}

	public void setCateId(String cateId)
	{
		this.cateId = cateId;
	}

	/**
	 * 管理员登录
	 * @return
	 */
	public String adminlogin()
	{
		boolean b = adminServiceBusiness.adminchecklogin(adminlogname,
				adminlogpass);
		if (b)
		{
			ActionContext.getContext().getSession()
					.put("adminlogname", adminlogname);
			return "success";
		}
		else
		{
			return "fairly";
		}
	}

	/**
	 * 获取所有商品
	 * @return
	 */
	public String getAllGoods()
	{
		Goods = adminServiceBusiness.getAllTrousers();
		return SUCCESS;
	}
	
	/**
	 * 根据商品Id获取商品信息
	 * @param goodsId
	 * @return
	 */
	public String getGoodsByGoodsId()
	{
		ware = adminServiceBusiness.getGoodsByGoodsId(goodsId);
		Categorys = adminServiceBusiness.getAllCate();
		return SUCCESS;
	}
	
	/**
	 * 删除商品
	 * @param goodsId
	 * @return
	 */
	public String delGoods()
	{
		adminServiceBusiness.delGoodsByGoodsId(goodsId);
		return SUCCESS;
	}
	
	public String showOrderInfo()
	{
		orderInfos = adminServiceBusiness.getAllOrderInfos();
		return SUCCESS;
	}
	
	/**
	 * 发货
	 * @return
	 */
	public String Shipments()
	{
		adminServiceBusiness.Shipments(orderNo);
		return SUCCESS;
	}
	
	/**
	 * 文件上传
	 * @return
	 * @throws IOException 
	 */
    public String upload() throws IOException{
        String realpath = ServletActionContext.getServletContext().getRealPath("/img");
        System.out.println("realpath: "+realpath);
        if(image != null){
            File savefile = new File(new File(realpath), imageFileName);
            System.out.println(savefile);
            System.out.println(savefile.getParentFile());
            if(savefile.getParentFile().exists()){
                try {
                    savefile.getParentFile().mkdirs();
                    FileUtils.copyFile(image, savefile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ActionContext.getContext().put("message", "预览图上传上传成功");
            }
            ware.setTrousersId(imageFileName);
        	adminServiceBusiness.saveGoods(ware);
            return "success";
        }
        else{
        	HttpServletResponse response = ServletActionContext.getResponse();
			response.setHeader("Content-type", "text/html;charset=utf-8");  
			response.setContentType("text/html;charset=utf-8");  
			response.getWriter().print("\t<script>alert('请上传图片')</script>\r\n");
			return ERROR;
        }
        
    }

    public String updateUpload() throws IOException{
      	String goodname=ware.getGoodsName();
    	String goodprice=ware.getPrice();
    	String goodtid=imageFileName;
    	Integer goodcateid=ware.getCategory().getCategoryId();
    	Integer id=ware.getId();
        String realpath = ServletActionContext.getServletContext().getRealPath("/img");
        System.out.println("realpath: "+realpath);
        if(image != null){
            File savefile = new File(new File(realpath), imageFileName);
            System.out.println(savefile);
            System.out.println(savefile.getParentFile());
            if(savefile.getParentFile().exists()){
                try {
                    savefile.getParentFile().mkdirs();
                    FileUtils.copyFile(image, savefile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ActionContext.getContext().put("message", "预览图上传上传成功");
            }
            adminServiceBusiness.updataGoods(goodtid,goodprice,goodname,goodcateid,id);
            return "success";
        }
        else{
      
        	System.out.println("-------------------"+ware.getGoodsName()+ware.getPrice()+ware.getTrousersId()+ware.getCategory().getCategoryId());
        	System.out.println(goodtid+goodprice+goodname+goodcateid+id);
        	adminServiceBusiness.updataGoods(goodtid,goodprice,goodname,goodcateid,id);
            return "success";
        }
      
    }
    
    //上架商品
    public String AddGoods(){
    	Categorys = adminServiceBusiness.getAllCate();
    	return SUCCESS;
    }
    
  //修改商品
    public String UpdateGoods(){
    	adminServiceBusiness.updateGoods(ware);
    	return SUCCESS;
    }

    /**
     * 管理员图片
     * @return
     */
	public String exit()
	{
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.clear();
		return SUCCESS;
	}

}
