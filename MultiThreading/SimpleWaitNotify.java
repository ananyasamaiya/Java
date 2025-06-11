class SimpleWaitNotify{
    private boolean flag = false;

    public synchronized void sendSignal(){
        flag = true;
        System.out.println("Producer: sending signal");
        notify();
    }
    public synchronized void waitForSignal(){
        while(!flag){
            try{
                System.out.println("Consumer waiting for signal");
                wait();
            } catch(InterruptedException e){

            }
        }
        System.out.println("Consumer got the signal");
    }
    public static void main(String[] args){
        SimpleWaitNotify obj = new SimpleWaitNotify();
        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
}
}