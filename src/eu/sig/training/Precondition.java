package eu.sig.training;

public class Precondition {

    public static void checkArgument(boolean condition, String message) {
        if(!condition){
            throw new IllegalArgumentException(message);
        }
    }
}
