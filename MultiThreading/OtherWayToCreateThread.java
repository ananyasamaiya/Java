class OtherWayToCreateThread{
    public static void main(String[] args){
        System.out.println("start");
        Thread t1 = new Thread( () -> {
            System.out.println("hello");
        });
        Thread t2 = new Thread( () ->{
            System.out.println("hiii");
        });

        t1.start();
        t2.start();
    }
}