package com.navercorp.volleyextensions.sample.volleyer.twitter.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {

	@JsonProperty("id")
	private String id;
	@JsonProperty("id_str")
	private String idStr;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("text")
	private String text;
	@JsonProperty("user")
	private User user;
	@JsonProperty("entities")
	private Entities entities;

	public Status() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "id : " + id + "\n"
				+ "idStr : " + idStr + "\n"
				+ "createdAt : " + createdAt + "\n"
				+ "text : " + text + "\n";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Media> getMedias() {
		if (entities == null) {
			return null;
		}
		return entities.getMedias();
	}

}
