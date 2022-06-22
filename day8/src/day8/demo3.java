package com.ank.statickeyword;
class variable {
	int rollno;
	String name;
	String college;


	 variable (int rollno, String name, String college) {
this.rollno = rollno;
this.name = name;
this.college= college;
}
void display() {
	System.out.println(rollno+ " "+ name+ " "+ college);
}

public class stud {

}

	public static void main(String[] args) {
		variable s1 = new variable (101,"Abc","Acharya");
		variable s2 = new variable (101,"Ade","Acharya");
		variable s3 = new variable (101,"Afg","Acharya");
		variable s4 = new variable (101,"Ahi","Acharya");
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
