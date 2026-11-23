public class MTHDS {

    // Methods always live inside a class, outside psvm (unlike C++, nothing exists outside a class)

    public static void main(String[] args) {
        // Method: Reusable block of code inside a class; runs only when called
        // Syntax: <access> <static> <returnType> <name>(<parameters>) { return <val>; }
        // void = returns nothing | returnType = sends a value back

        // 1. Calling static method in same class (10, 20 = Actual Arguments)
        System.out.println("main class sum: " + isSum(10, 20));

        // 2. Calling static method from another class (ClassName.method())
        System.out.println("Other class multi: " + Helper.multi(10, 20));

        // 3. Calling no-param void method (cannot put inside println since it returns nothing)
        sayHi();

        // 4. Calling no-param return method
        System.out.println("no para, return: " + getTen());


        // PASS BY VALUE & PASS BY REFERENCE

        // 1. Primitive Pass by Value
        int x = 10, y = 20;
        System.out.println("add result: " + add(x, y));
        System.out.println("original x: " + x); // 10

        int num = 10;
        change(num);
        System.out.println("original num: " + num); // 10

        // 2. Array reference (copy of reference)
        int[] numbers = {10, 20, 30};
        changeArray(numbers);
        System.out.println(numbers[0]); // 99

        // 3. Reference reassignment
        replaceArray(numbers);
        System.out.println(numbers[0]); // 99


    }

/*
STATIC (What / Why / How):
def:
static means single, fixed location belonging to the Class itself,
rather than creating a fresh copy every time you make a new object.

* WHAT : Belongs to the Class itself, NOT an object.
* WHY  : Lets JVM start psvm immediately with 0 objects.
* HOW  : Same class: isSum(10, 20)
*        Another class: Helper.multi(10, 20)
*/


    // STATIC METHODS

    // Static return method (int a, int b = Formal Parameters)
    public static int isSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // No parameters + void
    public static void sayHi() {
        System.out.println("Hi!");
    }

    // No parameters + return
    public static int getTen() {
        return 10;
    }

    /* COMPLETE NOTES (Static / Non-Static / Instance / Pass-by-Value vs Reference):
     * INSTANCE     : A real object created in memory from a Class blueprint using 'new'.
     * STATIC       : Belongs to the Class (shared).
     * NON-STATIC   : Belongs to an Instance.
     * PASS-BY-VALUE: Java is strictly Pass-by-Value:
     *   1. Primitives -> copies actual value; changing parameter does NOT change original.
     *   2. Objects / Arrays -> copies reference; modifying internal data DOES change original.
     *
     * Pass-by-Value (Primitives) = Sending a Photo
     * Object References = Two references accessing the same object.
     */

    // PASS BY VALUE & PASS BY REFERENCE

    // 1. Primitive Pass by Value
    public static int add(int a, int b) {
        a = 50;
        return a + b;
    }

    public static void change(int a) {
        a = 50;
    }

    // 2. Array reference
    public static void changeArray(int[] arr) {
        arr[0] = 99;
    }

    // 3. Reference reassignment
    public static void replaceArray(int[] arr) {
        arr = new int[]{1, 2, 3};
    }
}

// ANOTHER CLASS

class Helper {
    public static int multi(int a, int b) {
        return a * b;
    }
}


class parameter
{

// IMP: Formal Parameters = variables in header | Actual Arguments = values passed in call

// FORMAL vs ACTUAL PARAMETERS

    // Formal Parameters (a, b)
    public static int add(int a, int b) {
        System.out.println("Formal a: " + a);
        System.out.println("Formal b: " + b);
        return a + b;
    }

    /*
Formal parameters are variables written in the method definition.
They have a data type because they receive the incoming values.

Actual arguments are values or variables passed when calling the method.
They do not need a data type in the call.
     */

    // Actual Arguments (10, 20)
    public static void main(String[] args) {
        System.out.println("actual para:"+add(10, 20)); // 30
    }

}