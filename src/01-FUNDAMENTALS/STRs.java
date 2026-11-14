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
        //Immutability means that once a String object is created in memory,
        // its actual contents can never be altered.



        String ss1 = "Cat";
        String s2 = "Cat";
// adding letter to str
        ss1 = ss1 + "s";  // allow overloading of str values
        // You want ss1 to be "Cats"
        System.out.println(ss1);

        //str foundation methods
        //length()
        String size="Hello boi"; //0-n so adds space too so
        System.out.println("strname.length():"+size.length());

        //.charAt(int index) — Grabs a single char at a specific position.
        System.out.println("strname.charAt(index):"+size.charAt(4));// display o from hello


        //.substring(start, end) — Cuts out a piece of the String.
        System.out.println("sub string:"+size.substring(1,5));

        //indexof() use to find index of str ,solo only(if group gives 1st letter index only)
        System.out.println("str indexof():"+size.indexOf("l"));

        //.lastIndexOf(str) same but gives last repeated letter index
        System.out.println("str lastindexof():"+size.lastIndexOf("l"));

        //.startsWith(str) / .endsWith(str) use to find str with start/end with T/F only
        System.out.println("startwith():"+size.startsWith("hello"));
        System.out.println("endwith():"+size.endsWith("boi"));

        //operation str methods
        System.out.println("to upper case str:"+size.toUpperCase());
        System.out.println("to lower case str:"+size.toLowerCase());

        //cleaning & checking str methods (backend input validation) imp
        String raw = "   hello boi   ";
        System.out.println("trim() twice:" + raw.trim()); // removes extra spaces at start and end only

        String emptyStr = "";
        String spaceStr = "   ";
        System.out.println("isEmpty() on empty:" + emptyStr.isEmpty());   // true (length is 0)
        System.out.println("isEmpty() on spaces:" + spaceStr.isEmpty());  // false (spaces count as chars!)
        System.out.println("isBlank() on spaces:" + spaceStr.isBlank());  // true (ignores spaces, checks real text)

        //searching & replacing str methods
        System.out.println("contains():" + size.contains("boi"));         // true if word/letter exists anywhere
        System.out.println("replace():" + size.replace("boi", "java"));   // replaces matching text -> "Hello java"

        //splitting & converting str methods
        String[] words = size.split(" "); // breaks str at space into array: ["Hello", "boi"]
        System.out.println("split()[0]:" + words[0]);
        System.out.println("split()[1]:" + words[1]);

        //System.out.println(size.chars());

    }
}
