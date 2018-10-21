package cn.ts.Web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.ts.Entity.Users;
import cn.ts.Service.ServiceBusiness;

@SuppressWarnings("serial")
public class Verification extends ActionSupport {
	@Resource(name = "serviceBusiness")
	private ServiceBusiness serviceBusiness;

	private Users users;
	private String password2;
	
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String checkusername() throws IOException {
		boolean b = serviceBusiness.checkUserName(users.getUserName());
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Content-type", "text/html;charset=utf-8");  
		response.setContentType("text/html;charset=utf-8");  
		if (users.getUserName() != "" && !users.getUserName().equals("")) {
			if (b) {
				response.getWriter().print("<font color='red'>用户名已存在</font>");
			} else {
				response.getWriter().print("用户名可用");
			}
		} else {
			response.getWriter().print("<font color='red'>用户名不能为空</font>");
		}
		return null;
	}
	

}
