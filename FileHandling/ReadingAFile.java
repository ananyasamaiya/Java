import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ReadingAFile{
    public static void main(String[] args){
        try{
        File file = new File("example.txt");
        if(file.exists()){
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }else{
            System.out.println("File does not exist.");
        }
    } catch(IOException e){
        System.out.println("An error occured while reading the file");
        e.printStackTrace();
    }
    }
    
}