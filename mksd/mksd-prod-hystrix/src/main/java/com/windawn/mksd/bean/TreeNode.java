package com.windawn.mksd.bean;

import java.util.List;

public class TreeNode {
	/**
	 * @Fields id : 节点的ID
	 */
	private String id;
	/**
	 * @Fields text : 节点的 Text
	 */
	private String text;
	
	private String icon;
	
	private String type;
	
	private State state;
	
	private boolean selected;
	
	private boolean opened;
	
	/**
	 * @Fields children : 子节点List
	 */
	private List<TreeNode> children;

	public TreeNode() {
	}

	public TreeNode(String id, String text, List<TreeNode> children) {
		super();
		this.id = id;
		this.text = text;
		this.children = children;
	}

	public TreeNode(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public void addChildren(List<TreeNode> children) {
		if (this.children != null && this.children.size() > 0) {
			this.children.addAll(0, children);
		} else {
			this.children = children;
		}
	}

}
