import java.io.File;
import java.io.IOException;

class Create{
    public static void main(String[] args){
        try{
            File obj = new File("D:\\RAJTAMANG\\Git\\Java-Coding\\Day 8(Exception)\\Text.txt");
            if(obj.createNewFile()){
                System.out.println("File has been created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error Occured");
        }
    }
}