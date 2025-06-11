class question4{
    public static void main(String[] args){
        Circle a = new Circle();
        a.area(5);
    }
}

interface Shape{
    void area(int r);
}

class Circle implements Shape{
    public void area(int r){
        double res = 3.14 * r * r;
        System.out.println(res);
    }
}