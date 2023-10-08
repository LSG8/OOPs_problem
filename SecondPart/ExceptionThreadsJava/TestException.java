package ExceptionThreadsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
    public static void main (String[] args) {
        final int a=5;
        int b=1;
//        try{
//            int output = a/b;
//        }
//      catch(ArithmeticException e){
//          //System.out.println(e.toString());
//          System.out.println("division by zero");
//        }
////        catch(Exception e){
////            //System.out.println(e.toString());
////            e.printStackTrace();
////        }
//        finally {
//            System.out.println("after division");
//        }
        try {
            //findFile();
            divisionWork(a,b);
            arrayOperation();
            otherOperations();
            //int out = a/b;
        }
//        catch (FileNotFoundException e) {
//            System.out.println(e.toString());
//        }
        catch(ArithmeticException e){
          System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("after exception throw");
            //define method
        }


    }
//    public static void findFile() throws FileNotFoundException{
//        File f1 = new File("/test.txt");
//        FileInputStream stream = new FileInputStream(f1);
//    }
    public static void divisionWork(int a, int b) throws ArithmeticException{
        int out = a/b;
    }
    public static void arrayOperation() throws IndexOutOfBoundsException{
    }
    public static void otherOperations() throws Exception{

        int a=5;
        int b=1;
        int out = a/b;
        throw new ArithmeticException();

        //....
    }

//    public static void findFile() throws IOException {
//        File newFile = new File("test.txt");
//        FileInputStream stream = new FileInputStream(newFile);
//    }
}
