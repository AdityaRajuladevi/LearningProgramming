/**
 * TestClass
 */
public class TestClass {

    private static Rectangle r=null;
    private static Square s= null;
    private static figure f=null;
    public static void main(String[] args) {
        r= new Rectangle();
       // r.draw();

        s= new Square();
       // s.draw();

        f= new Rectangle();
       // f.draw();

       testCall();
       testCall2();
       testCall3();
       testCall4();
       testCall5();

       f = new Circle();
       testCall4();
       testCall5();

       Circle c= new Circle();
       c.erase();

       figure f2 = new Circle();
       Circle ck = (Circle) f2;
       ck.erase();
    

    }

    static void testCall()
    {
        System.out.println("Test1 .. ");
        s.draw();
    }

    static void testCall2()
    {
        System.out.println("Test2 .. ");
        s.draw();
    }
    static void testCall3()
    {
        System.out.println("Test3 .. ");
        r.draw();
    }
    static void testCall4()
    {
        System.out.println("Test4 .. ");
        f.draw();
    }
    static void testCall5()
    {
        System.out.println("Test5 .. ");
        f.draw();
    }
}