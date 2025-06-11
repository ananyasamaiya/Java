class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Run()");
    }
}

class UsingRunnable{
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread a = new Thread(r);
        a.start();
        System.out.println("Main()");
    }
}