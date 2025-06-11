import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Student{
    int age;
    String name;
    int rollNumber;
    public Student(int age, String name, int rollNumber){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String toString(){
        return age + " " + name + " " + rollNumber;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByRollNumber implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.rollNumber.compareTo(s2.rollNumber);
    }
}

class ComparatorClass{
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12, "rahul", 55));
        list.add(new Student(11, "raju", 52));
        list.add(new Student(15, "mohit", 32));
        list.add(new Student(16, "Ananya", 05));

        // Collections.sort(list, new SortByName());
        Collections.sort(list, new SortByRollNumber());
        for(Student s : list){
            System.out.println(s);
        }
    }
}