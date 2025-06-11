class question5{
    public static void main(String[] args){
        Car a = new Car();
        a.start();
    }
}
    


interface Vehicle{
    void start();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}