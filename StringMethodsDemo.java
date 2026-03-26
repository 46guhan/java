public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "  Hello Java World  ";
        String str2 = "hello java world";
        String str3 = "Programming";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("charAt(4): " + str.charAt(4));

        // substring()
        System.out.println("Substring(2,7): " + str.substring(2,7));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // equals()
        System.out.println("Equals: " + str.equals(str2));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trim: '" + str.trim() + "'");

        // startsWith()
        System.out.println("Starts with 'Hello': " + str.trim().startsWith("Hello"));

        // endsWith()
        System.out.println("Ends with 'World': " + str.trim().endsWith("World"));

        // indexOf()
        System.out.println("IndexOf 'Java': " + str.indexOf("Java"));

        // lastIndexOf()
        System.out.println("LastIndexOf 'o': " + str.lastIndexOf('o'));

        // replace()
        System.out.println("Replace Java with Python: " + str.replace("Java","Python"));

        // replaceAll()
        System.out.println("ReplaceAll vowels: " + str.replaceAll("[aeiouAEIOU]", "*"));

        // replaceFirst()
        System.out.println("ReplaceFirst: " + str.replaceFirst("o", "X"));

        // concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // compareTo()
        System.out.println("CompareTo: " + str.compareTo(str2));

        // compareToIgnoreCase()
        System.out.println("CompareToIgnoreCase: " + str.compareToIgnoreCase(str2));

        // isEmpty()
        String emptyStr = "";
        System.out.println("IsEmpty: " + emptyStr.isEmpty());

        // valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        // split()
        String sentence = "Java,Python,C++";
        String[] languages = sentence.split(",");
        System.out.println("Split result:");
        for(String lang : languages){
            System.out.println(lang);
        }

        // toCharArray()
        char[] chars = str3.toCharArray();
        System.out.println("toCharArray:");
        for(char c : chars){
            System.out.print(c + " ");
        }
        System.out.println();

        // join()
        String joined = String.join("-", "Java","Python","C++");
        System.out.println("Join: " + joined);

        // matches()
        System.out.println("Matches '.*Java.*': " + str.matches(".*Java.*"));

        // intern()
        String a = new String("Java");
        String b = a.intern();
        System.out.println("Intern: " + (b == "Java"));

        // repeat()
        String rep = "Hi ".repeat(3);
        System.out.println("Repeat: " + rep);

        // strip()
        System.out.println("Strip: '" + str.strip() + "'");

        // stripLeading()
        System.out.println("StripLeading: '" + str.stripLeading() + "'");

        // stripTrailing()
        System.out.println("StripTrailing: '" + str.stripTrailing() + "'");
    }
}

