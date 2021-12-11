package com.syntaxClass06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * rules:
		 * values in case must be same DataTypes as a Variable in Switch
		 * We can not have Duplicate Cases
		 */
		
		char gender='f';
		String description;
		
		switch(gender) {
		
		case'm':
			description="male";
			break;
		case'M':
			description="Male";
		case 'f':
			description="female";
			break;
		default:
			description="unknown";
		}
		
System.out.println(gender +" means "+description);

/*
 * Limitations of operators
 * 1. We cannot use logical operators
 * 2. We cannot use Relational operators
 * 
 * Limitations of data types
 * 1.Cannot use boolean
 * 2.Cannot be used with double/float
 * 3.Cannot be used with long
 */


	}

}
