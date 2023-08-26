public class Circle {
    //attributes
    private double radius = 3.5;//scope of this variable = Circle class
    private String colour = "green";//scope of this variable = all classes
    public static String exampleSource = "TestCircle";
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

    //getter method
    public double getRadius(){
        return this.radius;
    }
    //setter method
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    //getter method
    public String getColour(){
        return this.colour;
    }

//    public static importantMethod(){
//        //do something
//        radius //accessible
//        colour // not accessible
          //getArea() // not accessible
//    }


}
