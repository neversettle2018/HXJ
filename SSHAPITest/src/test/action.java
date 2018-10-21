package test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import testdao.DaoBusiness;
import testentity.Users;
@Component(value="action")
@Scope("prototype")
public class action extends ActionSupport {
	@Resource(name = "daoBusiness")
	private DaoBusiness daoBusiness;
	private List<Users> users;

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public String trousers() {
		users = daoBusiness.getAllTrousers();
		return SUCCESS;
	}

}
