package Calc;
import java.util.Scanner;

public class Squre {
    
    public String Result()
    {
       String st =null;
       System.out.println("Square");
    
     
           try{
                 Scanner i=new Scanner (System.in);
                 System.out.print("Number:");
                 double num=i.nextDouble();
                 double result=num*num;
                 st = Double.toString(result);
          
                }
           catch(Exception e)
               {
                 System.out.println("Exception :"+e);
                
               }
      
      
         
       return st;
    }
}
