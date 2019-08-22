package com.windawn.mksd.bean;

public class Parameter {

	private Query<String, Object> query;
	
	private Pagination pagination;
	
	private Sort sort;

	public Query<String, Object> getQuery() {
		return query;
	}

	public void setQuery(Query<String, Object> query) {
		this.query = query;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	
	
	
}
