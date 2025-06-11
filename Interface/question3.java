class question3{
    public static void main(String[] args){
        Animal a = new Dog();
        a.makeSound();
    }
}

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}