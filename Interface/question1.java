class question1{
    public static void main(String[] args){
        Human a = new Human();
        a.walk();
        a.run();

    }
}

interface Walkable{
    void walk();
}

interface Runnable{
    void walk();
}

class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("walking");
    }
    public void run(){
        System.out.println("running");
    }
}