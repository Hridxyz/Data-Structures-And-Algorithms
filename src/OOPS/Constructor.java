package OOPS;

public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Hriday");
        Student S3 = new Student(123);
        //System.out.println(s1.name);
        s2.roll=12;
        //Student s4 = new Student(s2); //copy
       // System.out.println(s4.name);
    }


}
class Student {
    String name;
    int roll;


//    Student (Student s1){ //Shallow Copy Constructor
//        this.name = s1.name;
//        this.roll = s1.roll;
//    }
    Student() {
        System.out.println("This is a constructor"); //Non-Paramarized
    }
    Student(String name) {
        this.name = name; //Paramarized constructor
        //System.out.print("This is a constructor");
    }
    Student(int roll){
        this.roll = roll;
    }
}

