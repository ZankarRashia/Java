import java.util.*;

class Student {
    String name; 
    static String school;
}

interface Animal {
    int eyes = 2;
    public void walks();
}

interface Herbivore {}

class Horse implements Animal, Herbivore {
   public void walks() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS4 {

    public static void main(String args[]) {
        //Horse horse = new Horse();
        //horse.walks();

        Student.school = "DULLESS HIGH SCHOOL";
        Student std1 = new Student();
        std1.name = "Riddhi";
        System.out.println(std1.school);
    }
}