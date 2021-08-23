package Calc;
import java.io.*;

public class Buffer_read {
    void Answer() throws IOException
   {
      File f = new File("CalculatorOutput.txt");
      BufferedReader br = new BufferedReader(new FileReader(f));
      String str;
     
         while ((str = br.readLine()) != null)
      {
        
       System.out.println("Answer :"+str);
      }
 
      br.close();
    }
   
}
