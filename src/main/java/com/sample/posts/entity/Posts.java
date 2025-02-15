package com.sample.posts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Getter;

@Entity
@Table(name = "posts")
public class Posts {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "body")
	private String body;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Posts(int id, int userId, String title, String body) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}
	
	public Posts() {}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
	}
	
	
	
}
