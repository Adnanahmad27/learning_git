import adnan.com.Adnan;
class Using extends Adnan{
    void meth1(){
        System.out.println(a);
        System.out.println(b);
      //  System.out.println(c);
      //  System.out.println(d);
    }
}
public class usingPackage{
    public static void main(String[] args){
        System.out.println("I am using the package adnan.com");
        Using obj=new Using();
        obj.meth1();
    }
} 
