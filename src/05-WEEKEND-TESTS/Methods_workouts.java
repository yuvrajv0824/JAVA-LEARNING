public class Methods_workouts {
    /*
    Methods workout — Part A
Create a class named MethodWorkout.
1. Write a static void method named welcome() that prints:
Welcome to Java methods!
2. Call welcome() from main().
3. Write a static method named multiply:
   - Takes two int formal parameters: a and b
   - Returns their multiplication
4. Call it with actual arguments 5 and 4, then print:
Multiplication: 20
5. Write a static method named isEven:
   - Takes one int parameter
   - Returns true if the number is even; otherwise returns false
6. Call it with 7 and print:
Is 7 even? false
     */
    public static void main(String[] args) {
        //2
        welcome();
        //4
        System.out.println("mutli method call:" + multiply(5, 4));
        System.out.println("bool method int para:" + isEven(7));//6\


        //b 1
        System.out.println(findmax(10, 20) );
        //b 2
        //System.out.println(printTable(4));   oh so as sop is in method so we only call so
        printTable(4);
        System.out.println(ispositive(-5)); // b 3



    }


    public static void welcome() {//1
        System.out.println("welcome to methods workout sheet");
    }

    static int multiply(int a, int b) {//3
        return a * b;
    }

    static boolean isEven(int n) {//5
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double findmax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;

    }

    // void = method prints only; it returns no value.
// int number = method receives an integer value.
    public static void printTable(int number) {

        // Best for a known number of repetitions.
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    /*
    // Same logic using while:
    int i = 1;
    while (i <= 5) {
        System.out.println(number + " x " + i + " = " + (number * i));
        i++;
    }

    // Same logic using do-while:
    int i = 1;
    do {
        System.out.println(number + " x " + i + " = " + (number * i));
        i++;
    } while (i <= 5);
    */
    }
    public static boolean ispositive(int number) {
        if (number >0)
            return true;
        else
            return false;
    }


    //took some thinking and issues but cleared after full code
    /*
    shortcut tips
    static boolean isEven(int n) {
    return n % 2 == 0;  } */

    /* Methods workout — Part B
    1. Create findMax(int a, int b) that returns the larger number. Use if / else.
    2. Create printTable(int number) that prints the multiplication table of that number from 1 to 5.
    Expected for printTable(4):
    4 x 1 = 4
    4 x 2 = 8
    4 x 3 = 12
    4 x 4 = 16
    4 x 5 = 20
    3. Create isPositive(int number) that returns true for a number greater than 0; otherwise returns false.
        Call all methods from main() with:
findMax(12, 8)
    printTable(4)
    isPositive(-5)
    Use your own labels in the printed output. */


}
