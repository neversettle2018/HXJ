package springaop;

import org.springframework.stereotype.Component;

@Component
public class PersonServerBean implements PersonServer {

	   public void save(String name) {
	        System.out.println("save����");
	    }
	    public void update(String name, Integer id) {
	        System.out.println("update����");
	    }
	    public String getPersonName(Integer id) {
	        System.out.println("getPersonName����");
	        return "myName";
	    }
}
