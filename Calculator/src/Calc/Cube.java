package Calc;
import java.util.Scanner;

public class Cube {
     public String Result()
    {
      String st =null;
      System.out.println("Cube");
  
    
        try{
             Scanner input=new Scanner (System.in);
             System.out.print("Number:");
             double d=input.nextDouble();
             double result=d*d*d;
             st = Double.toString(result);
           
            }
        catch(Exception e)
           {
             System.out.println("Exception :"+e);
          
            }
     
         
      return st;
    }
    
}
