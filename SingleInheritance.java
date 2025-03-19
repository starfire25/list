class Person {
    String per = "Laxmi";
    
    void PersonInfo() {
        System.out.println("Person name is " + per);
    }
}

class Student extends Person {
    int rollNumber = 59;
    
    void StudentInfo() {
        System.out.println("Person " + per + " is a student");
        System.out.println("whose Roll Number: " + rollNumber);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.PersonInfo();
        stu.StudentInfo();
    }
}
