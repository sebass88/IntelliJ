package com.syntaxClass09;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		System.out.println(num);
		
		System.out.println("------------------------------------");
		
		int [] array=new int[4]; // Storing elements
		array[0]=12;
		array[1]=10;
		array[2]=13;
		array[3]=14;
		
		System.out.println(array[2]+array[0]);
		System.out.println(array[3]);
		
		// I need to create an array that will hold 3 element ofo double date types of value
		
		double[] arr=new double[3];// Storing 3 elements that we named arr
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		
		// can i replace value from an array?
		arr[1]=100.99;
		System.out.println(arr[1]);// after changing the value of an element
		System.out.println("---------------------------------");
		
		
       
       String[]c=new String[4];// storing elements
	
		c[1]="blue";
		c[2]="black";
		c[3]="yellow";
      
        // see how many elements inside array/ what is the size of an array.
        System.out.println(" size of array is "+c.length);
        
        System.out.println(c[1]);
				
		

	}

}
