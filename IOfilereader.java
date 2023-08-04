package IO;
import java.io.*;

public class IOfilereader {

    public static void main(String[] args) throws IOException
    {

       try{
        FileReader r=new FileReader("you file location or file name");

        try

          {
                  int i=r.read();
                  while(i!= -1)
                  {
                    System.out.print((char)i);
                    i=r.read();
                  }
          }

          finally{
            r.close();

          }

       }
       catch(EOFException e)
       {
         System.out.println("there is some erroe in prog.....!");
       }
       

    }
    
}
