import java.io.*;

class Write {
    public static void main(String[] args){
        try{
            FileWriter wr = new FileWriter("Text.txt");
            wr.write("I am a java developer and a cyber expert");
            wr.close();
            System.out.println("The File has been written successfully");
        }
        catch(IOException e){
            System.out.println("Error Occured");
        }
    }
}