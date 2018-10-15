package Json;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AbstractJsonObject {
    private String code;  
    //msg  
    private String msg; 
   
	public String getCode() {  
        return code;  
    }  
  
    public void setCode(String code) {  
        this.code = code;  
    }  
  
    /** 
     * @return the time 
     */  
  //  public long getTime() {  
    //    return time;  
   // }  
  
    /** 
     * @param time 
     *            the time to set 
     */  
  //  public void setTime(long time) {  
   //     this.time = time;  
   // }  
  
    public String getMsg() {  
        return msg;  
    }  
  
    public void setMsg(String msg) {  
        this.msg = msg;  
    }  
  
    public void setContent(String code, String msg) {  
        this.code = code;  
        this.msg = msg;  
    }  
  
    public void setStatusObject(StatusObject statusObject) {  
        this.code = statusObject.getCode();  
        this.msg = statusObject.getMsg();  
    } 
 
}
