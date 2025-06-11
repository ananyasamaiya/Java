class downloadFile{
    public static void file(String fileName) {
        for (int i = 0; i<=5 ; i++) {
            System.out.println("Downloading "+fileName + (" " + i*20) + "% complete...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }       
        }
        System.out.println(fileName+" Downloaded completely");
    }
}

public class withoutMultiThreading {
    public static void main(String[] args) {
        downloadFile file1 = new downloadFile();
        downloadFile file2 = new downloadFile();
        file1.file("File1.txt");
        file2.file("File2.txt");
    }
}
