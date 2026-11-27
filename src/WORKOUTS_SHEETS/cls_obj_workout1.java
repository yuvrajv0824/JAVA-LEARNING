public class cls_obj_workout1 {
    public static void main(String[] args) {
        /*
CLASS & OBJECT WORKOUT — PART A

1. Create a class named Mobile.

2. Mobile class must have two instance variables:
   - String brand
   - int price

3. Create a non-static method named display().
   It should print the mobile's brand and price.

4. In main(), create mobile1 using one-line object creation.

5. Give mobile1 these values:
   brand = "Samsung"
   price = 30000

6. Call mobile1.display().

7. Create mobile2 using two-step object creation:
   - First declare the reference variable.
   - Then create the Mobile object on the next line.

8. Give mobile2 these values:
   brand = "Apple"
   price = 70000

9. Call mobile2.display().

Expected idea:
mobile1 and mobile2 use the same Mobile class,
but each object stores its own brand and price.
*/
     mobile mobile1=new mobile();

     mobile1.brand="Samsung";

     mobile1.price=30000;
     mobile1.Display();

     mobile mobile2; //struggle in this way making of obj more so,rather waste of line so
     mobile2=new mobile();

     mobile2.brand="Apple";
     mobile2.price=70000;
     mobile2.Display();

     add area=new add();
     area.r=5.5;
     area.display_circle();
     area.L=5.5;
     area.B=10.5;
     area.display_rect();

    }
}
class mobile //A1
{
    String brand;
    int price;//A2
    void Display()
    {
        System.out.println("mobile info:"+"brand:"+brand+" & price:"+price); //A3
    }

}
/// private workout of finding area using  not main class(separate class outside the main class.) and methods call using obj in main class and assign values
class add
{ //area of circle=pi*r*r
    // pi=Math.PI (caps)for auto skill of math here in java
    double r;
    //outside method, inside Circle/add class
//because it belongs to the object and is used by methods.
    double L,B;

    //double area_of_circle=Math.PI*r*r;
    void display_circle()
    {
        //display() method only printed the already stored value:
        // put formula or operation in method mainly rather then in class
        double area_of_circle=Math.PI*r*r;
        System.out.println("area of circle:"+area_of_circle);

    }
    void display_rect()
    {
        double area_of_rect=L*B;
        System.out.println("area of rect:"+area_of_rect);

    }

}