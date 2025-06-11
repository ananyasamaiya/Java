class question2{
    public static void main(String[] args){
        Demo a = new Demo();
        a.display();
    }
}

interface A{
    void display();
}

interface B{
    void display();
}

class Demo implements A,B{
    public void display(){
        System.out.println("Display()");
    }
}