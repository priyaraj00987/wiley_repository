package com.wiley.springcore.standalone.collection;

import java.util.List;

import java.util.Map;

public class Person {
private List<String>friends;
private Map<String, Integer>fee;

public Map<String, Integer> getFee() {
	return fee;
}

public void setFee(Map<String, Integer> fee) {
	this.fee = fee;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends +  ", fee=" + fee + "]";
}


}
