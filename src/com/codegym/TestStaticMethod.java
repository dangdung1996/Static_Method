package com.codegym;

public class TestStaticMethod {

    public static void main(String[] args) {
	// write your code here

        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Dung");
        Student s2 = new Student(222, "Tung");
        Student s3 = new Student(333, "Thinh");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
