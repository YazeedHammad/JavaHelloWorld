import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.printMsg("hi there");
        Scanner reader = new Scanner(System.in);
        for (int i = 0 ; i < 3; i++) {
            System.out.println("Enter a number: ");
            int n = reader.nextInt();
            boolean result = myclass.guessMyNumber(n);
            if (result == true ) {
                System.out.println("Congratulation!! You win!!");
                break;
            }
            if (i == 2) {
                System.out.println("Game Over!!");
            }
        }

        System.out.println("Hello World! My First Java Program!!");

//        int[] num = new int[5];
//        for ( int i = 0; i < 5; i++) {
//            System.out.println("Enter  Number:");
//            num[i] = reader.nextInt();
//        }
//        myclass.acceptAndReverse(num);
//        myclass.acceptAndReversMe(num);

        System.out.println("Enter Name:");
        String str = reader.next();
        System.out.println("Enter Counter");
        int count = reader.nextInt();
        myclass.repeatString(str, count);

    }


}
