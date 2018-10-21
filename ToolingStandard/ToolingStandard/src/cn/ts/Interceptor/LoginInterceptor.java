package cn.ts.Interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		Object obj=request.getSession().getAttribute("logname");
		if (obj!=null) {
			return arg0.invoke();
		} 
		return "fairly";
		
	}

}
