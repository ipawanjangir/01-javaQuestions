package FileHandling;

import java.io.File;

public class file1 {
    public static void main(String[]args)
    {
        File f = new File("C:\\Users\\Pawan\\Desktop\\java.txt");
        
        if (f.exists())
        {
            System.out.println("file name :"+f.getName());
            System.out.println("file location :"+f.getAbsolutePath());
            System.out.println("file read :"+f.canRead());
            System.out.println("file write :"+f.canWrite());
            System.out.println("file length :"+f.length());
            
        }
        else
        {
            System.out.println("file is not existed");
        }
    }
}
