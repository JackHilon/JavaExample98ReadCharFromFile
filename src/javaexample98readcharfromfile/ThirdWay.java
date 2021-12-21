
package javaexample98readcharfromfile;

import java.io.FileReader;
import java.io.IOException;


public class ThirdWay {
    
    
    // read chars from the file and save them as char[]
    // It must be large char-array enough
    
    
    public static void main() {
        // Source file
        String src = "srcFile3.txt";
        
        try{
            
            // create an object which reads a byte from the file and translates
            // it as a char according to the code applied on this computer 
            // and translate this local char to unicode-char 
            /*
            Creates a new FileReader, given the name of the file to read from.
            */
            FileReader fr = new FileReader(src);
            
            
            char[] charArray = new char[1000];
            
            
            
            /*
            Reads characters into an array. This method will block until some
            input is available, an I/O error occurs, or the end of the
            stream is reached.
            
            Parameters:
            cbuf - Destination buffer
            Returns:
            The number of characters read, or -1 if the end of the stream 
            has been reached
            */
            int amountRead = fr.read(charArray);
            System.out.println("Char array length: "+ amountRead);
            // show read chars
            for (int i = 0; i < amountRead; i++) {
                System.out.print(charArray[i]);
            }
            
            // close
            fr.close();
            
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
