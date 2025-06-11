import java.io.FileWriter;
import java.io.IOException;
class WritingInFile{
    public static void main(String[] args){
    try{
        FileWriter writer = new FileWriter("example.txt");

        writer.write("Hello World \n");
        writer.write("This is a text file \n");
        writer.write("Writng in java is fun!");

        writer.close();
        System.out.println("Successfully wrote to the file.");
    } catch(IOException e){
        System.out.println("An error occurred while writing to the file.");
        e.printStackTrace();

    }
    }
    
}