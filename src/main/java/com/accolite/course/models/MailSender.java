package com.accolite.course.models;

public class MailSender {
	private String mail;
	private String subject;
	private String body;
	public MailSender() {}
	public MailSender(String mail, String subject, String body) {
		super();
		this.mail = mail;
		this.subject = subject;
		this.body = body;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
