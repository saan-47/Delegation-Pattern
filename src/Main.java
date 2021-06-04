import com.sun.source.tree.WhileLoopTree;

public class Main {



    public static void main(String[] args) {
//        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        int sum1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum1 += a[i];
//        }
//
//        int sum2 = 0;
//
//        for (int j = 0; j < a.length; j++) {
//            sum2 += a[j];
//
//        }
//        System.out.println(sum1 - sum2);
//        Cow cow = new Cow();
//        cow.vocalize();
//        Dog dog  =new Dog();
//        dog.vocalize();
//
//
//        String andr = "Andrew";
//        String b = "Andrew";
//
//        if(andr.equals(b)){   //checking the equality of objects using equals() methods
//            System.out.println("andr & b are equal variables, and their respective hashvalues are:" + " "+ andr.hashCode() + " & " + b.hashCode());
//
//        }
//
//        String c = "Maria";
//        String d= "Julie";
//
//        if(!c.equals(d)){    //checking  the equality of objects using equals() method
//            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());
//
//        }

        Employee employee = new Employee(new FastCoder(), new GoodDesigner(), new DangerousTester());
        employee.code();
        employee.design();
        employee.tester();
    }
}

interface Animal
{
    void vocalize();
}
class Dog implements Animal {
    public void vocalize() { System.out.println("Woof!"); }
}
class Cow implements Animal {
    public void vocalize() { moo(); }
    public void moo() { System.out.println("Moo!"); }
}
interface Vehicle{
    int speed = 200;
    int limit = 198;

    //@invariant speed < limit;
    abstract void brake();

}
class Car implements Vehicle{

    int fuel;
    boolean engineOn;
    @Override
    public void brake() {
        if (speed > limit)  {
            System.out.printf("Brakes");
        }
    }
}

interface WhoCanCode{
    void code();
}
interface WhoCanDesign{
    void design();
}
interface WhoCanTest{
    void tester();
}

class Employee implements WhoCanCode, WhoCanDesign, WhoCanTest{

    WhoCanCode whoCanCode;
    WhoCanDesign whoCanDesign;
    WhoCanTest whoCanTest;

    public Employee(WhoCanCode whoCanCode, WhoCanDesign whoCanDesign, WhoCanTest whoCanTest) {
        this.whoCanCode = whoCanCode;
        this.whoCanDesign = whoCanDesign;
        this.whoCanTest = whoCanTest;
    }

    @Override
    public void tester() {
        whoCanTest.tester();
    }

    @Override
    public void design() {
        whoCanCode.code();
    }

    @Override
    public void code() {
        whoCanDesign.design();
    }
}
class DangerousTester implements WhoCanTest{
    @Override
    public void tester() {
        System.out.println("Software being test by a dangerous tester.");
    }
}

class FastCoder implements WhoCanCode{
    @Override
    public void code() {
        System.out.println("Coded by fastcoder");
    }
}
class GoodDesigner implements WhoCanDesign{
    @Override
    public void design() {
        System.out.println("Who can Design Good");
    }
}

//public enum Planet{
//    MERCURY(3.4580, 4.5723), VENUS(1.E452, 2.484), MARS(5.104,6.157), JUPYTER(3.274,0.6897), NEPTUNE(4.697,3.214), URANUS(1.234,3.654), SATURN(93.41,4.158), EARTH(2.215,34.654)
//}