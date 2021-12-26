package Class31;

public class ExceptionDemo7 {
    public static void main(String[] args) {


        try{
            System.out.println("Line 1");
            System.out.println(10/0);
            System.out.println("Line 2");
        }catch (Exception e){
            System.out.println(10/0);
            System.out.println("Line 3");
        }
        finally {
            System.out.println("Line 4 ");
        }
    }
}
