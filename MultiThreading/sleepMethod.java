class AThread extends Thread{
    public void run(){
        try{
            AThread.sleep(2000);
        }catch(InterruptedException e){

        }
        System.out.println("hello");
    }
}

class sleepMethod{
    public static void main(String[] args){
        AThread x = new AThread();
        x.start();

        System.out.println("hi");
    }
}