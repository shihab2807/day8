package day8;


		
package com.ank.statickeyword;

class method {
	int rollno;
	String name;
	static 
	String college= "Acharya";


	 method (int r, String n) {
rollno = r;
name = n;
	 }
	 static void change() {
		 college= "AIT";
		
	 }
	 void display() {
			System.out.println(rollno+ " "+ name+ " "+ college);
		}

		

			public static void main(String[] args) {
				change();
				variable s1 = new variable (101,"Abc",college);
				variable s2 = new variable (101,"Ade",college);
				variable s3 = new variable (101,"Afg",college);
				variable s4 = new variable (101,"Ahi",college);
				
				s1.display();
				s2.display();
				s3.display();
				s4.display();

			}

		}
