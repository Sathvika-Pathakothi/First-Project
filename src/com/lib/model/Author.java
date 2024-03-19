package com.lib.model;

public class Author {
	private String authorName;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Author(String authorName) {
		super();
		this.authorName = authorName;
	}
}
