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
        System.out.println("mutli method call:"+multiply(5,4));
        System.out.println("bool method int para:"+isEven(7));//6

    }


public  static void welcome()
{//1
    System.out.println("welcome to methods workout sheet");
}
static int multiply(int a,int b)
{//3
    return a*b;
}
static boolean isEven(int n)
{//5
    if(n%2==0)
    {return true;}
    else
    {return false;}
    //took some thinking and issues but cleared after full code
    /*
    shortcut tips
    static boolean isEven(int n) {
    return n % 2 == 0;  } */
}
}
