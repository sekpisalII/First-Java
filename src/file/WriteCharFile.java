package file;
import java.io.*;
public class WriteCharFile
{
    public static void main (String args[])
    {
        try
        {
            File inFile = new File ("ReadCharFile.java");
            File outFile = new File ("Test.txt");
            FileReader in = new FileReader(inFile);
            FileWriter out = new FileWriter (outFile,true);
            int c;
            while ((c=in.read())!= -1)
            {
                out.write(c);
            }
            in.close();
            out.close();
        }
        catch(IOException e)
        {
            System.out.println ("Error");
        }
    }
}