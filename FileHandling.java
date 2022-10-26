import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {

//        file create
        try{
            File newFile=new File("C:\\Users\\jyotisharma\\IdeaProjects\\hello.java\\src\\newDemo.txt");
            if(newFile.createNewFile()){
                System.out.println("File created"+newFile.getName());
            }else{
                System.out.println("file already exists...");
            }
        }catch (IOException e){
            e.printStackTrace();
        }


//       File writing
        try{
            FileWriter fw=new FileWriter("C:\\Users\\jyotisharma\\IdeaProjects\\hello.java\\src\\demo.txt");
            fw.write("file writing in java is reaally amazing...");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
//        file reading
        try{
            File myFile=new File("C:\\Users\\jyotisharma\\IdeaProjects\\hello.java\\src\\demo.txt");
            Scanner obj=new Scanner(myFile);
            while(obj.hasNextLine()){
                String data=obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }






    }
}
