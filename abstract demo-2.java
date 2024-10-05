import java.io.*;
import java.util.Scanner;
abstract class Base
{
    Base(){
        System.out.println("Base class constructor invoked");
    }
    abstract void fun();
}
class Derived extends Base
{
    Derived(){
        super();
        System.out.println("derived class constructor invoked");
    }
     void fun()
        {
            System.out.println("derived fun is invoke");
        }
}
    class Main
    {
        public static void main(String args[])
        {
            Derived d = new Derived();
            d.fun();
        }
    }
    
    
    
    
