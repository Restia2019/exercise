import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
  
public class openfile {
  
    public static void main(String[] args) {
          
        File f= new File("C:/Users/86178/Desktop/GA的社会实践表.docx");
          
        try{
            System.out.println("试图打开");
            new FileInputStream(f);
            System.out.println(f.toString());
            System.out.println("成功打开");
        }
         
        catch(Exception e){
            System.out.println("C:/Users/86178/Desktop/timg2.jpg不存在");
            e.printStackTrace();
        }
          
    }
}