public class InheritanceExample{
    public static void main(String[] args){
        System.out.println("Hello inheritance example");
        CircleForm circle1 = new CircleForm();//object class
        System.out.println(circle1.getArea());
//        System.out.println(circle1.getPerimeter());
//        System.out.println(circle1.getRadius());
//        System.out.println(circle1.getColor());
//        System.out.println(circle1.subClassGetRadius());
        GeneralForm form1 = new GeneralForm(6.3,"White",125.3,25.6);
//        System.out.println(form1.getRadius());
//        System.out.println(form1.getColor());
//        System.out.println(form1.getLen());
//        System.out.println(form1.getWidth());
        System.out.println(form1.getArea());
        System.out.println(circle1.toString());
    }
}
//superclass
class Circle{
    //instance variable
    private double radius;//scope circle
    private String color;
    public int superVar;
    //constructor overloading
    public Circle(){
        this.radius = 6.3;
        this.color = "Red";
        this.superVar = 10;
    }
    public Circle(double r){
        this.radius = 2.5;
    }
    public Circle(double r,String c){
        this.radius = r;
        this.color = c;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    //getter
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
}
//subclass
class CircleForm extends Circle{
    //subclass instance variable
    private double radius;//scope=circleform
    private String color;
    private int superVar;
    //constructor
    public CircleForm(){
        super();//call superclass constructor
        this.radius = 4;
        this.superVar = 55;
    }
    public double subClassGetRadius(){
        System.out.println(super.superVar);
        return this.radius;
    }
}
class GeneralForm extends Circle{
    //instance variable
    private double length;
    private double width;
    //constructor
    public GeneralForm(double r,String c,double l,double w){
        super(r,c);
        this.length = l;
        this.width = w;
    }
    //getters
    public double getLen(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getArea(){//polymorphism:: overriding superclass method
        return this.length*this.width;
    }

}
