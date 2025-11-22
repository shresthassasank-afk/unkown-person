
/**
 * Write a description of class DefaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValue
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean t;
    public static void main(String[] args){
         DefaultValue obj=new DefaultValue();
         System.out.println("byte=" +obj.b);
         System.out.println("short=" +obj.s);
         System.out.println("int=" +obj.i);
         System.out.println("long=" +obj.l);
         System.out.println("float=" +obj.f);
         System.out.println("double=" +obj.d);
         System.out.println("char=" +obj.c);
         System.out.println("boolean=" +obj.t);
         /*
         * Explanation for local variables:
         *
         * If you tried to declare a primitive variable inside a method (a local variable)
         * without initializing it, and then tried to print or use its value,
         * the Java compiler would produce a "variable might not have been initialized"
         * error*/
         
    }
}