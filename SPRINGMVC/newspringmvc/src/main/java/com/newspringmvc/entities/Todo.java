package com.newspringmvc.entities;

public class Todo {
private String todoTitle;
private String content;
 private String date;
public String getTodoTitle() {
	return todoTitle;
}
public void setTodoTitle(String todoTitle) {
	this.todoTitle = todoTitle;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Todo(String todoTitle, String content, String date) {
	super();
	this.todoTitle = todoTitle;
	this.content = content;
	this.date = date;
}
public Todo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Todo [todoTitle=" + todoTitle + ", content=" + content + ", date=" + date + "]";
}
 
}
