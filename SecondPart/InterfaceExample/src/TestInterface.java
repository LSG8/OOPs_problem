import java.util.Scanner;
import java.util.Set;

//interface Area {
//    void AreaCalculation();
//    //void perimeterCalculation();
//}
//abstract class Area {
//    abstract void AreaCalculation();
//    void test(){
//        System.out.println("test is fun");
//    }
//}
class Circle implements Area {
    int radius;
    public Circle(int r){//r = #35 = copy of radius
        this.radius = r;
    }
    public void AreaCalculation(){
        double area = Math.PI*this.radius*this.radius;
        System.out.println(area);
    }
    public void PerimeterCalculation(){
        double peri = 2*Math.PI*radius;
        System.out.println(peri);
    }
}
class Square implements Area,Perimeter{
    int edge;
    public Square(int e){
        this.edge = e;
    }
    public void AreaCalculation(){
        double area = edge * edge;
        System.out.println(area);
    }
    public void PerimeterCalculation(){
        double peri = 4*edge;
        System.out.println(peri);
    }
}
public class TestInterface {
    public static void main(String[] args) {
        //circle part
        System.out.println("Enter the radius of circle");
        Scanner inputCollect = new Scanner(System.in);
        int radius = inputCollect.nextInt();//radius address = #34
        Circle circleobj = new Circle(radius);//#34
        System.out.print("The area of circle is: ");
        circleobj.AreaCalculation();
        System.out.print("The perimeter of circle is: ");
        circleobj.PerimeterCalculation();

        //square part
        System.out.println("Enter the edge of square");
        Scanner inputCollect2 = new Scanner(System.in);
        int edge = inputCollect2.nextInt();
        Square squareobj = new Square(edge);
        System.out.print("The area of the square is: ");
        squareobj.AreaCalculation();
        System.out.print("The perimeter of the square is: ");
        squareobj.PerimeterCalculation();
    }
}