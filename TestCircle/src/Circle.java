public class Circle {
    //attributes
    private double radius = 3.5;//scope of this variable = Circle class
    public String colour = "green";//scope of this variable = all classes
    //constructor

    public Circle(){
    }
    //constructor overloading
    public Circle(double r, String col){
        radius = r;
        colour = col;
    }

    //behaviour
    public double getArea(){
        double area = radius * radius * Math.PI;
        System.out.println("Area of the circle is: "+area);
        return area;
    }


}
