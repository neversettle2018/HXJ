package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.StudentList;
import entity.Students;

public class StudentBusiness {
	
	public static List<Students> getAllStudents() {  
        List<Students> list = new ArrayList<Students>();//list对象  
        String sql = null;  
        DBHelpers db1 = null;  
        sql = "select *from users";// SQL  
        db1 = new DBHelpers(sql);//创建DBHelper对象  
        ResultSet ret = null;//创建结果集对象，执行sql后返回的数据集合  
        try {  
            ret = db1.pre.executeQuery();//这个方法就类似于执行了SELECT语句一样！  
            while (ret.next()) {  
                String userid1 = ret.getString(1);//第二列是name  
                String password2 = ret.getString(2);
                String mail3 = ret.getString(3);
                String phone4 = ret.getString(4);
                String address5 = ret.getString(5);
 
                Students students = new Students();//创建students对象  \

                Students student1 = new Students();//创建students对象  
                student1.setUserid(userid1);;//设置id  
                student1.setPassword(password2);//设置name  
                student1.setMail(mail3);//设置age  
                student1.setPhone(phone4);//设置sex  
                student1.setAddress(address5);
                StudentList studentList =  new StudentList();
                List<Students> list1 = new ArrayList<Students>();//list对象  
                list1.add(student1);
                List<String> stringtest=new ArrayList<String>();
                stringtest.add("one");
                stringtest.add("two");
                studentList.setStringtest(stringtest);
                studentList.setList(list1);
                studentList.setTest("测试");
                students.setUserid(userid1);;//设置id  
                students.setPassword(password2);//设置name  
                students.setMail(mail3);//设置age  
                students.setPhone(phone4);//设置sex  
                students.setAddress(address5);
                students.setList(studentList);
                students.setStudentlist(stringtest);
                list.add(students);//将students对象放置到列表中  
            } //循环从结果集中获取数据并设置到list列表对象中  
            ret.close();//关闭对象  
            db1.close();//关系数据库连接  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } //  
  
        return list;//返回结果  
    } 
	public boolean checklogin(String uname,String upw){
		
		boolean bool=false;
		Connection con=DBHelpers.getConnection();
		try {
		   	if(!(uname.equals("")||uname==null || upw.equals("")||upw==null) ){ 
				PreparedStatement pre=con.prepareStatement("select * from users where userid=? and password=?");
				pre.setString(1, uname);
				pre.setString(2, upw);
				ResultSet res=pre.executeQuery();
				if(res.next()){
					bool=true;
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return bool;
	}

	public boolean register(Students Students ){
		boolean bool=false;
		Connection con=DBHelpers.getConnection();
		try {
			PreparedStatement pre=con.prepareStatement(
					"insert into users values(?,?,?)");
			pre.setString(1, Students.getUserid());
			pre.setString(2, Students.getPassword());
			pre.setString(3, Students.getPhone());
			pre.execute();
			bool=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return bool;
	}
	
}
