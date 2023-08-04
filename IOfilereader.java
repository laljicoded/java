package IO;
import java.io.*;

public class IOfilereader {

    public static void main(String[] args) throws IOException
    {

       try{
        FileReader r=new FileReader("C:\\Users\\Hp\\Desktop\\lalji.txt");

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
