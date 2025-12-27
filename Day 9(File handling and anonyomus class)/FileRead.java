import java.io.*;
class FileRead{
    public static void main(String[] args){
        String filepath ="D:\\RAJTAMANG\\Git\\Java-Coding\\Day 9(File handling and anonyomus class)\\Text.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e ){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something when Wrong");
        }
    }
}
