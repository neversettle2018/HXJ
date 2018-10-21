package cn.ts.Entity;



/**
 * Stock entity. @author MyEclipse Persistence Tools
 */

public class Stock  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Trousers trousers;
     private String size;
     private Long sizeNum;


    // Constructors

    /** default constructor */
    public Stock() {
    }

    
    /** full constructor */
    public Stock(Trousers trousers, String size, Long sizeNum) {
        this.trousers = trousers;
        this.size = size;
        this.sizeNum = sizeNum;
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

    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public Long getSizeNum() {
        return this.sizeNum;
    }
    
    public void setSizeNum(Long sizeNum) {
        this.sizeNum = sizeNum;
    }
   








}