class downloadFile extends Thread{
    public void run() {
        Thread a = Thread.currentThread();
        for (int i = 0; i<=5 ; i++) {
            System.out.println("Downloading "+a.getName() + (" " + i*20) + "% complete...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Download interrupted");
            }       
        }
        System.out.println(a.getName()+" Downloaded completely");
    }
}

public class withMultiThreading {
    public static void main(String[] args) {
        downloadFile file1 = new downloadFile();
        file1.setName("File1.txt");
        downloadFile file2 = new downloadFile();
        file2.setName("File2.txt");

        file1.start();
        file2.start();
    }
}
