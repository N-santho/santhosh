import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String arg[])
    {
        Scanner scnr = new Scanner(System.in);
        int num;
        System.out.println("enter an integer to cheek weather it is even or odd ");
        num = scnr.nextInt();
        if(num%2==0)
        {
            System.out.println(num+"is even integer ");
        }
        else
        {
            System.out.println(num+"is odd integer ");
        }
    }
}
