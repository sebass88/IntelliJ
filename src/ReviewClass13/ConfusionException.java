package ReviewClass13;

public class ConfusionException extends Exception {
// to create checked exception we need to extend from
    //Exception class
// For non checked exceptions extend from Runtime exceptions class
    ConfusionException(String msg){
        super(msg);
    }
}
