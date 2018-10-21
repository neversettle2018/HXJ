package cn.ts.Entity;

import java.util.List;  

/** 
 * 分页类的封装 
 * @author hxj
 * @param <T> 
 * 
 */  
public class PageBean<T> {  
    private int pageNow;   //当前页数  
    private int rowCount;   //总记录数  
    private int pageCount;    //总页数  
    private int pageSize;        //每页显示的记录数  
    private List<T> list;     //每页显示数据的集合  
 
    public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getList() {  
        return list;  
    }  
    public void setList(List<T> list) {  
        this.list = list;  
    }  
}  