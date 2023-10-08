import java.util.Scanner;

public class TestError {
    public static void main(String[] args){
        float a ;
        float x1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
//        a = sc.next();
        a = sc.nextFloat();
//        x1 = 1/a;
//        System.out.println(x1);
        try {
            x1 = 1/a;
            System.out.println(x1);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
