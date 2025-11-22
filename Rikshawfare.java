
/**
 * Write a description of class Rikshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Rikshawfare
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base_fare=25.0;
        double per_km=10.0;
        double per_time=10.0;
        double disount=10.0;
        double night_charge=10.0;
        System.out.println("enter distance you want to travel:");
        int distance=sc.nextInt();
        System.out.println("enter time taken:");
        int time=sc.nextInt();
        System.out.println("are they local of this area:");
        String Is_local=sc.nextLine();
        sc.nextLine();
        System.out.println("Is it  night time:");
        String Is_night=sc.nextLine();
        double total_fare=(base_fare+(distance*per_km)+(time*per_time));
        double final_fare=Is_local.equals("yes") && (distance>=10) && Is_night.equals("no") ? final_fare=(total_fare-(total_fare*10/100)):(total_fare+(10*distance));
        System.out.println(" -----Fare details-------");
        System.out.println("total fare: RS" +total_fare);
        System.out.println("final fare: RS" +final_fare);
        
        
        
        
        
        
        
        
    
        
        
    }
}