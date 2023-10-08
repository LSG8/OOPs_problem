public class SimpleAbstract {
    public static void main(String args[]){
        B obj1 = new B(20,5);
        R obj2 = new R(5);
        S obj3 = new S(10);
        System.out.println(obj1.getArea());//=100//=100
        System.out.println(obj2.getArea());//=3.14*25=78.5
        System.out.println(obj3.getArea());//=10*10 = 100
    }
}
abstract class A{
    abstract double getArea();
}
class B extends A{
    private int length = -1;
    private int width = -1;
    public B(int l,int w){
        this.length = l;
        this.width = w;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
class R extends A{
    private int radius = -1;
    public R(int r){
        this.radius = r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class S extends A{
    private int edge = -1;
    public S(int e){
        this.edge = e;
    }
    public double getArea(){
        return edge*edge;
    }
}