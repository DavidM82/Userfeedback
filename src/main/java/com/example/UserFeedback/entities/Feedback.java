package com.example.UserFeedback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	public Feedback() {
		
	}
	
	public Feedback(String user, int rating, String comments) {
		this.user = user;
		this.rating = rating;
		this.comments = comments;
	}
	
	public String getUser() {
		return user;
	}
}