package springaop;

import org.springframework.stereotype.Component;

@Component
public class PersonServerBean implements PersonServer {

	   public void save(String name) {
	        System.out.println("save方法");
	    }
	    public void update(String name, Integer id) {
	        System.out.println("update方法");
	    }
	    public String getPersonName(Integer id) {
	        System.out.println("getPersonName方法");
	        return "myName";
	    }
}
