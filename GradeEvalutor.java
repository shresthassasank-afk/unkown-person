
/**
 * Write a description of class GradeEvalutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeEvalutor
{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in); //creating the scanner class object
      System.out.println("enter the grade");
      int grade=sc.nextInt(); 
      String Grade_evalutor=(grade>=40) ? "pass" : "fail"; //Ternary operator
      System.out.println("The grade of the student is:" +Grade_evalutor);

    
    }
}