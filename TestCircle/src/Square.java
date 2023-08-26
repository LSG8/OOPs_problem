public class Square {
    //attributes
    public double edge;
    public String colour;
    public static String exampleSource = "TestCircle";
    //constructor
    public Square(double e, String col){
        edge = e;
        colour = col;
    }
    //behaviour
    public double getArea(){

        double area = edge*edge;
        System.out.println("Area of the square is: "+area);
        return area;
    }
}
