package com.test;

public class Test {
	String getstudentname(String name) {
		return name;
	}
public static void main(String[] args) {
	Test test = new Test ();
	String s = test.getstudentname("ram");
	System.out.println("student name>>"+s);
		
	
}

}
