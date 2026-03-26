public class StringBufferDemo {
    public static void main(String[] args) {

        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" Java");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(6, 11, "Programming");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(6, 18);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());


        // StringBuilder

        StringBuilder sa = new StringBuilder("Java");

        // append()
        sa.append(" Programming");
        System.out.println("Append: " + sa);

        // insert()
        sa.insert(4, " Language");
        System.out.println("Insert: " + sa);

        // replace()
        sa.replace(5, 13, "Core");
        System.out.println("Replace: " + sa);

        // delete()
        sa.delete(5, 9);
        System.out.println("Delete: " + sa);

        // reverse()
        sa.reverse();
        System.out.println("Reverse: " + sa);

        // capacity()
        System.out.println("Capacity: " + sa.capacity());

        // length()
        System.out.println("Length: " + sa.length());


    }
}

