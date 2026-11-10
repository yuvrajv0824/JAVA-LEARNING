public class STRs {
    public static void main(String[] args) {

        //1.normal str
        String str="yo boi";
        System.out.print(str);
        //String basics + immutability + methods
//2.heap obj str
        String s1 = new String("Hello"); // Forces a brand new object in Heap

    //Comparing Strings (== vs .equals())
        String str2="hello",str1="hello";

         //==
        if(str1==str2)
            System.out.println(" \nyea both str 1,2 are same");

        //.equals()
        System.out.println(str1.equals(str2));
        System.out.println(s1.equals(str2));

        //Immutability (Why Strings Cannot Be Changed) learn tomrow


    }
}
