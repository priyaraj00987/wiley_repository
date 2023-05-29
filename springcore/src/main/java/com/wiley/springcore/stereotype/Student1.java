package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student1 {
	@Value("priya")
private String StudentName;
	@Value("bihar")
private String city;
	@Value("#{temp}")
private List<String>list;
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	
	StudentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [StudentName=" + StudentName + ", city=" + city + "]";
}

}
