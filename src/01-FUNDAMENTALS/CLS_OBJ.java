import java.util.Scanner;
public class CLS_OBJ {
    public static void main(String[] args) {
/*
CLASS:
A class is a blueprint or template used to define objects.
It describes what data an object can store and what actions it can perform.

A class can contain:
1. Instance variables  -> data for each object, such as name and age.
2. Methods             -> actions an object can perform, such as study().
3. Constructors        -> initialize an object when it is created.
4. Static members      -> belong to the class and are shared.

Example:
Student is a class. It defines that every Student object can have
a name, age, and methods such as introduce() or study().

OBJECT:
An object is a real instance created from a class at runtime.
Each object gets its own separate copy of non-static instance variables.

Example:
Student stud1 = new Student();

Student        -> Class name / blueprint.
stud1          -> Reference variable that refers to the object.
new Student()  -> Creates a new Student object in memory.
stud1          -> Gives access to that object's variables and methods.

One class can create many objects:
stud1 and stud2 are both Student objects, but each can store
different name and age values.

Example idea:
stud1.name = "Aarav";
stud2.name = "Diya";

Both use the same Student blueprint, but hold separate data.
*/
Scanner sc=new Scanner(System.in);
        // Create an object from Student class.
        Student stud1 = new Student();
        // Take input and store it directly in this object's variables.
        System.out.println("Enter student age:");
        stud1.age = sc.nextInt();   //assigned a normal var for method var with class

        System.out.println("Enter student name:");
        stud1.name = sc.next();
        stud1.introduce(); //method call using obj
        sc.close();

        Student stud2; // only reference variable; no object yet
        stud2 = new Student(); //2nd obj
        stud2.age=22;
        stud2.name="yuvraj";
        stud2.introduce();
        /*
1. Declare and create object in one line
Student stud1 = new Student();
- Student → class/data type
- stud1 → reference variable
- new Student() → creates the object


2. Declare first, create later
Student stud2;            // only reference variable; no object yet
stud2 = new Student();    // object is created here
       */

    }
}
/*
Student is a separate class.
It is a blueprint, not an object.
*/
class Student {
    // Instance variables: every Student object gets separate copies.
    String name;
    int age;

    // Non-static method: called using an object.
    void introduce() {
        System.out.println("Name: " + name + ", Age: " + age);


        //this.name = name;
        //│           │
        //│           └─ parameter value coming into constructor
        //└─ name variable of the current object

    }
}