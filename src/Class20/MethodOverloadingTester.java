package Class20;

public class MethodOverloadingTester {
    public static void main(String[] args) {

        MethodOverloading.add(10,10);
        MethodOverloading.addDouble(10.5,10.5);
        MethodOverloading.addAddInt(10,10,10);
        MethodOverloading.AddIntDouble(10,10.5);
        int []arr={10,10};
        MethodOverloading.addArray(arr);



    }
}
