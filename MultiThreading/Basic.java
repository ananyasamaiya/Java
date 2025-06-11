class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
    }
}

class Basic {
    public static void main(String[] args){
        MyThread x = new MyThread();
        x.start();

        System.out.println("hi");
    }
}