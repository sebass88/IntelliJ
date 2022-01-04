package ReviewClass13;

public class Demo4 {
    public static void main(String[] args) {
        try {
            Learning.learn("Aysha");
        }catch (ConfusionException e){
            e.printStackTrace();
        }
    }
}
