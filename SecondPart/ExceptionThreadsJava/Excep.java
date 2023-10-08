package ExceptionThreadsJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excep {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            // findFile();
            File f1=new File("/test.txt");
            FileInputStream stream = new FileInputStream(f1);
            //int out=a/b;
        }
        catch(FileNotFoundException e){
          System.out.println(e.toString());
        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }
    }
}

