package cn.ts.Entity;



/**
 * GoodsComment entity. @author MyEclipse Persistence Tools
 */

public class GoodsComment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Trousers trousers;
     private String userName;
     private String releaseTime;
     private String UContent;


    // Constructors

    /** default constructor */
    public GoodsComment() {
    }

    
    /** full constructor */
    public GoodsComment(Trousers trousers, String userName, String releaseTime, String UContent) {
        this.trousers = trousers;
        this.userName = userName;
        this.releaseTime = releaseTime;
        this.UContent = UContent;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Trousers getTrousers() {
        return this.trousers;
    }
    
    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReleaseTime() {
        return this.releaseTime;
    }
    
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getUContent() {
        return this.UContent;
    }
    
    public void setUContent(String UContent) {
        this.UContent = UContent;
    }
   








}