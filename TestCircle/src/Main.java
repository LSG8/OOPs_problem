import java.sql.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //create circle1 object

    public void testMethod(){
        //do something
//        Circle circle1;
//        circle1 = new Circle(); //constructor method call
    }
    public void anotherTest(){
        //do something
    }
    public static void main(String[] args) {
        //args is a string array::0:"abc", 1:"ser", 2:"oop"
        //String[] args consider input argument, does not matter with the inside code
        //cmd running case: Main.java <args values[0]> <args values[1]>
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        for(int i=0; i<args.length; i++)//when args=null, then args.length=0
            System.out.println(args[i]);

//        if ( ){
//            //singleplayer code
//            System.out.println("Hello singleplayer");
//        }
//        else{
//            //multiplayer code
//            System.out.println("Hello multiplayer");
//        }
        //I can access radius variable of circle class here
        System.out.println("Example source of circle class is: "+Circle.exampleSource);
        System.out.println("Example source of square class is: "+Square.exampleSource);
        //cannot access non-static members
//        System.out.println("Radius of circle class is: "+Circle.radius);
//        System.out.println("Edge of square class is: "+Square.edge);
       //create circle1 object
        Circle circle1;
        circle1 = new Circle(); //constructor method call
        //cannot access private variable from circle class
        //System.out.println(circle1.radius);
        //can access private variable using getter method::access
        System.out.println(circle1.getRadius());
        //setter method::modify
        circle1.setRadius(57.8);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColour());
        //colour is a read-only variable no setter
//        circle1.colour = "blue";
//        circle1.setColour("blue");

//        circle1.getArea();
//        System.out.println(circle1.colour);
////        circle1.colour = "green";
////        System.out.println(circle1.colour);
//        //create circle2 object
//        Circle circle2 = new Circle(5,"green");
//        circle2.getArea();
//        Square box1 = new Square(6,"blue");
//        box1.getArea();
//        double totalArea = circle1.getArea() + box1.getArea();
//
//        System.out.println("The total area of the circle and square is: "+totalArea );

    }
}
