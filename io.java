package IO;
import java.io.*;


public class io { 

    public static void main(String[] args) throws IOException
    {

        File file=new File("iofile");
        System.out.println(file.exists());

        file.createNewFile();
        System.out.println(file.exists());


        File dir=new File("directory");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());
        
    }

}
