import java.io.File;

class DeleteAFile{
    public static void main(String[] args){
        File file = new File("new.txt");
        if(file.delete()){
            System.out.println("delete the file " + file.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}