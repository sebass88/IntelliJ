package com.syntaxClass15;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st1=new Students();
		st1.studenName="Sebas";
		st1.studentID=12005;
		st1.numberofstudents++;

		Students st2=new Students();
		st2.studenName="Jose";
		st2.studentID=13005;
		st2.numberofstudents++;
		
		Students st3=new Students();
		st3.studenName="Jill";
		st3.studentID=13012;
		st3.numberofstudents++;
		
		System.out.println(Students.numberofstudents);
	}

}
