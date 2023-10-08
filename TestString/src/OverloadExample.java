public class OverloadExample {
    public int div(int a , int b){
        return (a / b); }

    public int div(int a , int b , int c){
        return ((a + b ) / c); }

    public static void main(String args[]){
        OverloadExample ob = new OverloadExample();
        ob.div(10 , 2);
        ob.div(10, 2 , 3);
    }
}
