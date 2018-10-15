package Json;

import java.util.List;

public class ListObject  extends AbstractJsonObject {

	private List<?> items;  
    
    public List<?> getItems() {  
        return items;  
    }  
  
    public void setItems(List<?> items) {  
        this.items = items;  
    }  
}
