package cal;
//import java.util.*;
class calculator{
    public void calculator(int a,int b){
        System.out.println("Your result is "+ a+b);
    }
}
class Sccalculator{
    public void calculator(int a,int b){
        System.out.println("Your result is "+ Math.sin(a+b));
    }
}
class Hycalculator{
    public void calculator(int a,int b){
        System.out.println("Your result is "+ a+b);
        System.out.println("Your result is "+ Math.sin(a+b));
    }
}
public class problem1{
    public static void main(String[] args){
        System.out.println("I am main method");
    }
}