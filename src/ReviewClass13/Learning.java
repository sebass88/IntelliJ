package ReviewClass13;

public class Learning {
    public static void learn(String student) throws ConfusionException{
        if(student.equals("Aysha")){
            throw new ConfusionException("I am confused");
        }else {
            System.out.println("easy peasy");
        }
    }
}
