package com.person.entity;

/**
 * 
 * 
 * @ClassName: BaseEntity.java
 * @Description: 翻页
 *
 * @version: v1.1.0
 * @author: She Xiangdong
 * @date: Oct 18, 2016 7:45:50 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Oct 18, 2016     She Xiangdong          v1.1.0               修改原因
 */
public class BaseEntity {
	
	private Integer page;    // 页码
	private Integer rows;    // 每页大小
	private String start;    // 开始时间（如果有查询）
	private String end;      // 结束时间（如果有查询）
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "BaseEntity [page=" + page + ", rows=" + rows + ", start=" + start + ", end=" + end + "]";
	}
}
