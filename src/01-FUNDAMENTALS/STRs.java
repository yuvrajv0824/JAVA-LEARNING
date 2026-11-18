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


        // --- 1. CONVERTING STRINGS (Text <-> Numbers & Chars) ---

        //String.valueOf() -> turns any number into a String
        int code = 200;
        String codeStr = String.valueOf(code); // 200 becomes "200"
        System.out.println("valueOf() text add:" + (codeStr + 50)); // prints "20050" (glues as text)

        //Integer.parseInt() -> turns a String number back into a real int for math
        String numText = "22";
        int realNum = Integer.parseInt(numText); // "22" becomes 22
        System.out.println("parseInt() real math:" + (realNum + 3)); // prints 25 (adds like numbers!)

        //toCharArray() -> breaks a String into individual char boxes so we can edit letters
        char[] letters = size.toCharArray(); // "Hello boi" -> ['H','e','l','l','o',' ','b','o','i']
        System.out.println("toCharArray()[0]:" + letters[0]); // prints 'H'

        letters[0] = 'Y'; // arrays CAN be changed, unlike String!
        String fixedStr = new String(letters); // glues char[] back into a normal String -> "Yello boi"
        System.out.println("back to String:" + fixedStr);

        //String.join() -> opposite of split(), glues an array back into one String
        String joined = String.join("-", words); // ["Hello", "boi"] -> "Hello-boi"
        System.out.println("String.join():" + joined);

        //String.format() -> clean way to put variables inside text (%s = String, %d = int)
        String name = "Yuvraj";
        int level = 1;
        String info = String.format("Player %s is at level %d", name, level);
        System.out.println("String.format():" + info);


        // --- 2. STRINGBUILDER (Editable / Mutable String) ---
        //Normal String creates new objects every time you edit it (slow in loops).
        //StringBuilder lets you edit the SAME object directly in memory!

        StringBuilder sb = new StringBuilder("Java");

        //append() -> adds text at the end (like +)
        sb.append(" is fun");
        System.out.println("sb append():" + sb); // "Java is fun"

        //insert(index, text) -> puts new text in the middle at that index
        sb.insert(5, "really ");
        System.out.println("sb insert():" + sb); // "Java really is fun"

        //replace(start, end, text) -> swaps out characters from start up to end-1
        sb.replace(5, 11, "super");
        System.out.println("sb replace():" + sb); // "Java super is fun"

        //delete(start, end) -> cuts out characters from start up to end-1
        sb.delete(4, 10);
        System.out.println("sb delete():" + sb); // "Java is fun"

        //reverse() -> flips the whole text backwards in 1 line!
        sb.reverse();
        System.out.println("sb reverse():" + sb); // "nuf si avaJ"
        sb.reverse(); // flip it back to normal

        //toString() -> converts StringBuilder back into a normal String when finished
        String finalStr = sb.toString();
        System.out.println("sb toString():" + finalStr);


        // --- 3. STRINGBUFFER (Thread-Safe StringBuilder) ---
        //Has the EXACT same methods as StringBuilder (append, insert, delete, reverse).
        //Difference: StringBuffer is thread-safe (slower, used only when multiple threads share it).
        StringBuffer sbf = new StringBuffer("Safe");
        sbf.append(" Text");
        System.out.println("StringBuffer:" + sbf);

        // --- 4. STRING ARRAY (String[]) ---

        //1. Creating a String array (2 ways)
        String[] langs = {"Java", "Python", "C++"}; // shortcut with values ready
        String[] names = new String[2];             // empty slots (default value is null!)
        names[0] = "Yuvraj";
        names[1] = "Alex";

        //2. Length vs length() -> WATCH OUT!
        //Array uses .length (NO parentheses) | String inside array uses .length() (WITH parentheses)
        System.out.println("Array size:" + langs.length);          // 3 items in array
        System.out.println("First word length:" + langs[0].length()); // 4 letters in "Java"

        //3. Looping through a String array (for-each loop)
        for (String item : langs) {
            System.out.println("Language:" + item.toUpperCase());
        }

        //4. Sorting a String array alphabetically (requires: import java.util.Arrays;)
        java.util.Arrays.sort(langs); // becomes ["C++", "Java", "Python"]
        System.out.println("Sorted array:" + java.util.Arrays.toString(langs));
    }
}
