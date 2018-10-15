package interfaces;

import java.util.List;

import Dao.StudentBusiness;
import entity.Students;

public class StudentServiceImpl {
    public List<Students> getAllStudents() {  
        // TODO Auto-generated method stub  
        return StudentBusiness.getAllStudents();  
    }  
}
