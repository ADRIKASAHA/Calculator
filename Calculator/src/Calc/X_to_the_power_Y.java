package Calc;
import java.util.Scanner;

public class X_to_the_power_Y {
    
    public String Result()
    {
      String st =null;
      System.out.println("X to the Power Y");
     
         try{
               Scanner i=new Scanner (System.in);
               System.out.print("Num1:");
               double b=i.nextDouble();
               System.out.print("Num2:");
               double e=i.nextDouble();
               double result = 1;
               while(e!=0)
                {
                  result*=b;
                  --e;
                }
                st= Double.toString(result);
              
             }
         catch(Exception e)
            {
               System.out.println("Exception :"+e);
              
            }
       
     
         
      return st;
    }
    
}
