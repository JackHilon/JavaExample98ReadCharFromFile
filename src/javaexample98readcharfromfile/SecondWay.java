
package javaexample98readcharfromfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class SecondWay {
    
    // using InputStreamReader
    
    public static void main() {
        
        // Source file
        String src = "srcFile2.txt";
        
        try{
            
            // create input tool 
            FileInputStream fis = new FileInputStream(src);
            //InputStreamReader isr = new InputStreamReader(fis);
            InputStreamReader isr = new InputStreamReader(fis, "ASCII");
            
            // place for saving char in
            StringBuilder sb = new StringBuilder();
            
            // read char by char till file end
            int i = 0; // place which char is read
            i = isr.read(); // char is as 16 bits long
            
            // (-1) means the end of the file
            while(i != -1)
            {
                // to get the char as corresponding readed-value, 
                // this int-vlue is converted to char.
                sb.append((char) i);
                
                i = isr.read();
            }// end-while
            
            // show read chars
            System.out.println(sb);
            
            
            isr.close();
            fis.close();
            
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}
