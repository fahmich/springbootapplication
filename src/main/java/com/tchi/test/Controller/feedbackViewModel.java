package com.tchi.test.Controller;

import javax.validation.constraints.NotNull;

public class feedbackViewModel {

	@NotNull
	private String name;
	@NotNull
	
	private String email;
	@NotNull
	private String feedback;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	@Override
	public String toString() {
		return "feedbackViewModel [name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
