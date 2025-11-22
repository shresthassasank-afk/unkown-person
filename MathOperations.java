
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
        int a=4;
        int b=4;
        System.out.println("====================================\n"+// This operator represents arithmetic operation.
        "\tArithmetic operator\n"+
        "=====================================");
        System.out.println("addition=" +(a+b));
        System.out.println("subtraction="+(a-b));
        System.out.println("multiply="+(a*b));
        System.out.println("divide="+(a/b));
        System.out.println("remainder="+(a%b));
        System.out.println("==========unary operator=========");
        System.out.println(+(++b)); // pre increment.
        System.out.println(+(b++)); // post increment.
        System.out.println(+b);  // It increase value the second time only.
        System.out.println("===========Relational operators===========");
        int age=18;
        var is_adult=(age>=18);
        System.out.println("is adult =" +is_adult);//This operator show the relation like equals to e.t.c.
        System.out.println("=============logical operators==============");
        var hasLicense = true;
        var canDrive = (age >= 18 && hasLicense);
        System.out.println("Can drive: " + canDrive); //AND
        System.out.println("Can drive: " + (age>=18 || hasLicense)); // OR
        System.out.println("==========Assignment operator===========");
        var num = 10;
        System.out.println("NUMBER: " + num);
        num += 5; 
        System.out.println("ADDITION += 5: " + num);
        num *= 2; 
        System.out.println("MULTIPLICATION *= 2: " + num); 
        System.out.println("=============Ternary operator============"); 
        var status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status); // If the condition is true then it execute the first value otherwise the second.
        System.out.println("==============Bitwise operator============");
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        System.out.println("And = " + and); 
        System.out.println("Or = " + or);
        System.out.println("Xor= " + xor);
        System.out.println("======================THE END======================");
        
        

        
    
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
        
    
        
        
    
        
     
     
    }
        
    
}