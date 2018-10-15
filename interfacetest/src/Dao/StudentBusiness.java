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
        List<Students> list = new ArrayList<Students>();//list����  
        String sql = null;  
        DBHelpers db1 = null;  
        sql = "select *from users";// SQL  
        db1 = new DBHelpers(sql);//����DBHelper����  
        ResultSet ret = null;//�������������ִ��sql�󷵻ص����ݼ���  
        try {  
            ret = db1.pre.executeQuery();//���������������ִ����SELECT���һ����  
            while (ret.next()) {  
                String userid1 = ret.getString(1);//�ڶ�����name  
                String password2 = ret.getString(2);
                String mail3 = ret.getString(3);
                String phone4 = ret.getString(4);
                String address5 = ret.getString(5);
 
                Students students = new Students();//����students����  \

                Students student1 = new Students();//����students����  
                student1.setUserid(userid1);;//����id  
                student1.setPassword(password2);//����name  
                student1.setMail(mail3);//����age  
                student1.setPhone(phone4);//����sex  
                student1.setAddress(address5);
                StudentList studentList =  new StudentList();
                List<Students> list1 = new ArrayList<Students>();//list����  
                list1.add(student1);
                List<String> stringtest=new ArrayList<String>();
                stringtest.add("one");
                stringtest.add("two");
                studentList.setStringtest(stringtest);
                studentList.setList(list1);
                studentList.setTest("����");
                students.setUserid(userid1);;//����id  
                students.setPassword(password2);//����name  
                students.setMail(mail3);//����age  
                students.setPhone(phone4);//����sex  
                students.setAddress(address5);
                students.setList(studentList);
                students.setStudentlist(stringtest);
                list.add(students);//��students������õ��б���  
            } //ѭ���ӽ�����л�ȡ���ݲ����õ�list�б������  
            ret.close();//�رն���  
            db1.close();//��ϵ���ݿ�����  
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } //  
  
        return list;//���ؽ��  
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
