package Class20;

public class MethodOverloading2 {

    static void add(int...arr){//Can handle any number of parameters
        int sum=0;
        for(int number:arr){
            sum=sum+number;
        }
        System.out.println(sum);
    }
     static void add(int num1, int num2){

        System.out.println(num1+num2);
    }
    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }

    static void addAddInt(int num1,int num2,int num3){

        System.out.println(num1+num2+num3);
    }

    static void add(double num1,int num2){

        System.out.println(num1+num2);
    }
    static void AddIntDouble(int num1,double num2){

        System.out.println(num1+num2);
    }
    static void addArray(int[] array){
        int sum=0;
      for(int number:array){
            sum=sum+number;
        }
        System.out.println(sum);
    }



}
