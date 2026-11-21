public class MTHDS {
    // Methods always live inside a class, outside psvm (unlike C++, nothing exists outside a class)

    public static void main(String[] args) {
        // Method: Reusable block of code inside a class; runs only when called
        // Syntax: <access> <static> <returnType> <name>(<parameters>) { return <val>; }
        // void = returns nothing | returnType = sends a value back

        //1. Calling static method in same class (10, 20 = Actual Arguments)
        System.out.println("main class sum: " + isSum(10, 20));

        //2. Calling static method from another class (ClassName.method())
        System.out.println("Other class multi: " + Helper.multi(10, 20));

        //3. Calling no-param void method (cannot put inside println since it returns nothing)
        sayHi(); //cal here

        //4. Calling no-param return method
        System.out.println("no para, return: " + getTen());
    }

    // Static return method (int a, int b = Formal Parameters)
    public static int isSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // No parameters + void
    public static void sayHi() {
        System.out.println("Hi!"); //calling display using sayHi();
    }
/*
No parameters (): Correct—it takes no outside inputs and just runs whatever is written inside its { ... }.

//void vs return:
void (no return): Executes the code inside and gives nothing back to main (not even an old value).

return: Executes the code inside and sends back whatever value is written after return.
 */
    // No parameters + return
    public static int getTen() {
        return 10;
    }
}

class Helper {
    public static int multi(int a, int b) {
        return a * b;
    }
}

// IMP: Formal Parameters = variables in header (int a, int b) | Actual Arguments = values passed in call (10, 20)


/* STATIC (What / Why / How):
 * WHAT : Belongs to the Class itself (fixed in memory), NOT an object (unlike dynamic/non-static).
 * WHY  : Lets JVM start psvm immediately with 0 objects, and lets utility methods run without 'new'.
 * HOW  : Add 'static' keyword -> call directly inside same class: isSum(10, 20)
 *                               -> call from another class: Helper.multi(10, 20)
 */