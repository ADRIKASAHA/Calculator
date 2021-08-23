package Calc;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square\n6.Cube\n7.X to the Power Y\nEnter :");
        Scanner i = new Scanner(System.in);
        int k=i.nextInt();
        
        if(k==1)
        {
        Addition ob1 = new Addition();
        String st= ob1.Result();
              
        Buffer_write b1= new Buffer_write();
        b1. Buff(st);
              
        Buffer_read b2= new Buffer_read();
        b2.Answer();
        }
        
        
        else if(k==2){
        Subtraction ob2 = new Subtraction();
        String st2= ob2.Result();
              
        Buffer_write b2= new Buffer_write();
        b2. Buff(st2);
              
        Buffer_read c= new Buffer_read();
        c.Answer();
            
        }
        else if(k==3){
        Multiplication ob3 = new Multiplication();
        String st3= ob3.Result();
              
        Buffer_write b3= new Buffer_write();
        b3. Buff(st3);
              
        Buffer_read c2= new Buffer_read();
        c2.Answer();
        }
        else if(k==4){
        Division ob4 = new Division();
        String st4= ob4.Result();
              
        Buffer_write b4= new Buffer_write();
        b4. Buff(st4);
              
        Buffer_read c3= new Buffer_read();
        c3.Answer();
            
        }
        else if(k==5){
        Squre ob5 = new Squre();
        String st5= ob5.Result();
              
        Buffer_write b5= new Buffer_write();
        b5. Buff(st5);
              
        Buffer_read c4= new Buffer_read();
        c4.Answer();
        }
        else if(k==6){
        Cube ob6 = new Cube();
        String st6= ob6.Result();
              
        Buffer_write b6= new Buffer_write();
        b6. Buff(st6);
              
        Buffer_read c5= new Buffer_read();
        c5.Answer();
        }
        else if(k==7){
        X_to_the_power_Y ob7 = new X_to_the_power_Y();
        String st7= ob7.Result();
              
        Buffer_write b7= new Buffer_write();
        b7. Buff(st7);
              
        Buffer_read c6= new Buffer_read();
        c6.Answer();
        }
        else
        {
            System.out.println("Wrong input");
        }
    }
}
