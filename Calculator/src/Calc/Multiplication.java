package Calc;

import java.util.Scanner;

public class Multiplication {
    public String Result()
    {
       String str =null;
       System.out.println("Multiplication");
      
            try{
                 Scanner input=new Scanner (System.in);
                 System.out.print("Number1:");
                 double n1=input.nextDouble();
                 System.out.print("Nunmber2:");
                 double n2=input.nextDouble();
                 double result=n1*n2;
                 str = Double.toString(result);
               
                }
            catch(Exception e)
                {
                 System.out.println("Exception :"+e);
                
                }
       
         
       return str; }
    
}
