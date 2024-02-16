package FileHandling;

import java.io.File;
import java.io.IOException;

class file {
    public static void main(String[]args)
    {
        try {
             File f = new File("C:\\Users\\Pawan\\Desktop\\java.txt");

             if (f.createNewFile()) {
                System.out.println("file is creating");
             }
             else{
                System.out.println("file is already created");
             }
        } 
        catch (IOException i) {
           System.out.println(i);
        }
       
    }
}
