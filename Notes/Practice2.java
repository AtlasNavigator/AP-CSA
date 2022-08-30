public class Practice2{
    public static void main (String[] args) {
        System.out.println("Hello world");
    }
    public static void testMethod(){
    main(new String[0]);
    }
    public static void testMethod2(){
        testMethod();
    }
}
