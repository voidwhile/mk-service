package com.windawn.mksd.bean;

import java.io.Serializable;

import com.windawn.mksd.bean.Constants;

public class Pagination implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 偏移
	 */
	private int offset;
	
	/**
	 * 页码 
	 */
	private int page;
	
	/**
	 * 页数
	 */
	private int pages;
	
	/**
	 * 数量
	 */
	private int perpage;
	
	/**
	 * 总数
	 */
	private int total;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPages() {
		this.pages = ((this.getTotal() - 1) / this.getPerpage()) + 1;
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPerpage() {
		if(this.perpage <= 0) {
			this.perpage = Constants.PAGE_SIZE;
		}
		return perpage;
	}

	public void setPerpage(int perpage) {
		this.perpage = perpage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getOffset() {
		this.offset = (this.getPage() - 1) * this.getPerpage();
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	
}
