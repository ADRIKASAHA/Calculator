package Calc;
import java.io.*;

public class Buffer_write {
    public void Buff(String r1)
    {
        try
     {
        FileWriter f = new FileWriter("CalculatorOutput.txt");
        BufferedWriter bw = new BufferedWriter(f);
    
        bw.write(r1);
        bw.close();
       
     }
     

   catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    
}
