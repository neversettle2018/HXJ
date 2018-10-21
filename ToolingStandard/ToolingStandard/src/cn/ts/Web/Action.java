package cn.ts.Web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.ts.Entity.Comment;
import cn.ts.Entity.PageBean;
import cn.ts.Entity.Trousers;
import cn.ts.Entity.Users;
import cn.ts.RSA.RSAUtils;
import cn.ts.Service.ServiceBusiness;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport
{
	@Resource(name = "serviceBusiness")
	private ServiceBusiness serviceBusiness;

	private Users users;
	private String logname;
	private String logpass;
	private Comment comments;
	private List<Trousers> trousers;
	private List<Users> users2;
	private ArrayList<Comment> comment;
	private PageBean<Trousers> pageBean; // 裤子
	private PageBean<Trousers> pageBean1; // 精品
	private PageBean<Trousers> pageBean2; // 上衣

	private int pageNow = 1;

	public PageBean<Trousers> getPageBean()
	{
		return pageBean;
	}

	public void setPageBean(PageBean<Trousers> pageBean)
	{
		this.pageBean = pageBean;
	}

	public PageBean<Trousers> getPageBean1()
	{
		return pageBean1;
	}

	public void setPageBean1(PageBean<Trousers> pageBean1)
	{
		this.pageBean1 = pageBean1;
	}

	public PageBean<Trousers> getPageBean2()
	{
		return pageBean2;
	}

	public void setPageBean2(PageBean<Trousers> pageBean2)
	{
		this.pageBean2 = pageBean2;
	}

	public int getPageNow()
	{
		return pageNow;
	}

	public void setPageNow(int pageNow)
	{
		this.pageNow = pageNow;
	}

	public String getLogname()
	{
		return logname;
	}

	public void setLogname(String logname)
	{
		this.logname = logname;
	}

	public String getLogpass()
	{
		return logpass;
	}

	public void setLogpass(String logpass)
	{
		this.logpass = logpass;
	}

	public Users getUsers()
	{
		return users;
	}

	public void setUsers(Users users)
	{
		this.users = users;
	}

	public List<Trousers> getTrousers()
	{
		return trousers;
	}

	public void setTrousers(List<Trousers> trousers)
	{
		this.trousers = trousers;
	}

	public List<Users> getUsers2()
	{
		return users2;
	}

	public void setUsers2(List<Users> users2)
	{
		this.users2 = users2;
	}

	public Comment getComments()
	{
		return comments;
	}

	public void setComments(Comment comments)
	{
		this.comments = comments;
	}

	public ArrayList<Comment> getComment()
	{
		return comment;
	}

	public void setComment(ArrayList<Comment> comment)
	{
		this.comment = comment;
	}

	public String login() throws IOException{
		users2 = serviceBusiness.getUserId(logname);
		boolean b = serviceBusiness.checklogin(logname, logpass);
		if (b) {
			ActionContext actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
			session.put("userid", users2.get(0).getId());
			session.put("logname", logname);
			return "success";
		} else {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setHeader("Content-type", "text/html;charset=utf-8");  
			response.setContentType("text/html;charset=utf-8");  
			response.getWriter().print("\t<script>alert('用户名或者密码错误')</script>\r\n");
			response.getWriter().print("\t<script>window.location.href =document.referrer;</script>\r\n"); //浏览器返回上一页并刷新
			return null;
		}
	}

	public String register()
	{
		try
		{
			String pas = RSAUtils.encryptWithRSA(users.getUserPassword());
			users.setUserPassword(pas);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		serviceBusiness.register(users);
		return SUCCESS;
	}

	public String trousers()
	{
		comment = serviceBusiness.getComment();
		trousers = serviceBusiness.getAllTrousers();
		return SUCCESS;
	}

	/*
	 * // 分页显示商品 public String Showtrousers() { comment =
	 * serviceBusiness.getComment(); // int pageNow = this.pageNow;//希望显示第几页
	 * 默认显示第一页 int pageSize = 6;// 每页显示多少条记录 // int pageCount;//一共有多少页 ——通过计算得到
	 * // int rowCount;//一共有多少条记录 ——从数据库查询
	 * 
	 * // 获取总记录数 rowCount rowCount = serviceBusiness.getTrousersAllRowCount();
	 * // 计算 pageCount 一共 分 多少页 this.pageCount = (rowCount + pageSize - 1) /
	 * pageSize; // 接受用户希望显示的页数（pageNow）
	 * 
	 * if (pageNow > pageCount) { pageNow = pageCount; } if (pageNow < 1) {
	 * pageNow = 1; }
	 * 
	 * System.out.println("获取到的页数值为" + pageNow); System.out.println("总页" +
	 * pageCount); trousers = serviceBusiness.getAllTrousers(pageNow, pageSize);
	 * return SUCCESS; }
	 */
	public String Showtrousers()
	{
		// 调用Service完成查询操作
		comment = serviceBusiness.getComment();
		int pageSize = 6;// 每页显示多少条记录
		this.pageBean = serviceBusiness.getAllTrousers(pageNow, pageSize);
		// 页面跳转
		return SUCCESS;
	}

	public String Showboutique()
	{
		// 调用Service完成查询操作
		comment = serviceBusiness.getComment();
		int pageSize = 6;// 每页显示多少条记录
		this.pageBean1 = serviceBusiness.getAllBoutique(pageNow, pageSize);
		// 页面跳转
		return SUCCESS;
	}

	public String Showtops()
	{
		// 调用Service完成查询操作
		comment = serviceBusiness.getComment();
		int pageSize = 6;// 每页显示多少条记录
		this.pageBean2 = serviceBusiness.getAllTops(pageNow, pageSize);
		// 页面跳转
		return SUCCESS;
	}

	public String tops()
	{
		comment = serviceBusiness.getComment();
		return SUCCESS;
	}

	public String boutique()
	{
		comment = serviceBusiness.getComment();
		return SUCCESS;
	}

	public String addComment()
	{
		comments.setuserName((String) ActionContext.getContext().getSession()
				.get("logname"));
		serviceBusiness.addComment(comments);
		return SUCCESS;
	}

	public String exit()
	{
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.clear();
		return SUCCESS;
	}

}
