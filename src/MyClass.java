import java.util.Random;

public class MyClass {
    public void printMsg(String msg){
// TODO: your code here
    System.out.println(msg);
    }
    public boolean guessMyNumber(int n){
// TODO: your code here
        Random rn = new Random();
        rn.nextInt(10 - 0 + 1);
        if (rn.nextInt(10 - 0 + 1) == n) {
            return true;
        } else {
            return false;
        }
    }


}
