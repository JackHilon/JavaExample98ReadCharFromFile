package javaexample98readcharfromfile;

import java.io.FileReader;
import java.io.IOException;


public class JavaExample98ReadCharFromFile {

    
    public static void main(String[] args) {
        
        // Source file
        String src = "srcFile1.txt";
        
        try{
            
            // create an object which reads a byte from the file and translates
            // it as a char according to the code applied on this computer 
            // and translate this local char to unicode-char 
            /*
            Creates a new FileReader, given the name of the file to read from.
            */
            FileReader fr = new FileReader(src);
            
            // place for saving char in
            StringBuilder sb = new StringBuilder();
            
            // read char by char till file end
            int i = 0; // place which char is read
            i = fr.read(); // char is as 16 bits long
            
            // (-1) means the end of the file
            while(i != -1)
            {
                // to get the char as corresponding readed-value, 
                // this int-vlue is converted to char.
                sb.append((char) i);
                
                i = fr.read();
            }// end-while
            
            // show read chars
            System.out.println(sb);
            
            
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
        
        System.out.println();
        
        SecondWay.main();
        
        System.out.println();
        
        ThirdWay.main();
    }
    
}
