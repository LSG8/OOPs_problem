public class StringExample {
    public static void main(String[] args) {
        String str1 = new String("This is my  first string");//object creation using constructor
        //str1 creates in heap memory
        System.out.println(str1);
        String str2 = "This is my first string";//literal variable declaration:: still str2 is an object
        //str2 creates in heap memory

        System.out.println(str2.toUpperCase());
        String str3 = "This is my second string" +" "+ str2;
        System.out.println(str3);
        //int a = 5;
        if(str2 == str3)
            System.out.println("str2 and str3 are assigned in the same address");
        else
            System.out.println("str2 and str3 are not in same address");
        if(str1 == str3)
            System.out.println("str1 and str3 are assigned in the same address");
        else
            System.out.println("str1 and str3 are not in same address");
        if(str1.equals(str2))
            System.out.println("value of str1 and str2 are the same");
        String str4 = "a";//ascii value
        String str5 = "e";//ascii value
        System.out.println(str5.compareTo(str4));//alphabetical comparison
    }
}