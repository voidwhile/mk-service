package com.windawn.mksd.bean;

import java.io.Serializable;
import java.util.List;

import com.windawn.mksd.bean.Pagination;

@SuppressWarnings("serial")
public class PageResult<T> implements Serializable{

	

	/**
	 * 数据列表
	 */
	private List<T> list;

	/**
	 * 分页工具
	 */
	private Pagination pagination;
	
	public PageResult(int page,int perpage){
		this.pagination = new Pagination();
		this.pagination.setPage(page);
		this.pagination.setPerpage(perpage);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

}
