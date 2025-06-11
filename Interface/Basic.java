class Basic{
    public static void main(String[] args){
        Dev a = new Dev();
        a.print();
        a.show();

    }
}

interface Client1{
    void print();
    void show(); 
}

interface Client2{
    void print();
    void show();
}

class Dev implements Client1,Client2{
    public void print(){
        System.out.println("bill");
    }
    public void show(){
        System.out.println("payment");
    }
}