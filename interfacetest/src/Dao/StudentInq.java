package Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Json.JackJsonUtils;
import Json.ListObject;
import Json.StatusObject;
import entity.StudentList;
import entity.Students;
import interfaces.StudentServiceImpl;
import responseUtils.ResponseUtils;

import xiangying.StatusHouse;

public class StudentInq extends HttpServlet {

	

	/**
		 * Constructor of the object.
		 */
	public StudentInq() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    List<Students> list = StudentBusiness.getAllStudents(); 
	    
	    // �����ݿ��ȡѧ�������б�  
	    ListObject listObject=new ListObject(); // ����һ�����ض���  
	    listObject.setItems(list);// �������б����ø����ض����items����  
	    listObject.setStatusObject(StatusHouse.COMMON_STATUS_OK);// ���÷��ض������Ӧ״̬��  
	    String responseText = JackJsonUtils.toJson(listObject);//�����ض���ת��Ϊjson�ַ���  
	    ResponseUtils.renderJson(response, responseText);//��������ػ������
		
		//--------------------------------------------------------
		/*response.setContentType("text/html,charset=utf-8");
		String username=request.getParameter("name"); 
		String userpw=request.getParameter("password"); 
		       //String username="123";
				//String userpw= "123";
		boolean b=new StudentBusiness().checklogin(username, userpw);
		if (b) {
			    ListObject listObject=new ListObject(); 
			    listObject.setStatusObject(StatusHouse.COMMON_STATUS_OK);
			    String responseText = JackJsonUtils.toJson(listObject);  
			    ResponseUtils.renderJson(response, responseText);
		} else {
			    ListObject listObject1=new ListObject(); 
			    listObject1.setStatusObject(StatusHouse.COMMON_STATUS_ERROR);
			    String responseText = JackJsonUtils.toJson(listObject1);  
			    ResponseUtils.renderJson(response, responseText);
		}*/
		
  /*	//     Students stu = null;
		 List<Students> list = null;
		 String str="{\"student\":[{\"userid\":\"leilei\",\"password\":23}]}";
	//	 ListObject listObject=new ListObject(); 
		 entity.StudentList studentList=JackJsonUtils.fromJson(str, entity.StudentList.class);
		 list=studentList.getStudent();
		 for(Students s:list){
			    String Userid=s.getUserid();
			    String Password=s.getPassword();
	            System.out.println(Userid);
	            System.out.println(Password);
	        }*/
		 
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
