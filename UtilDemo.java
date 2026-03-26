import java.util.*;

public class UtilDemo {

    public static void main(String[] args) {

        /* 1. LIST */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        Vector<String> vector = new Vector<>(arrayList);

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);
        System.out.println("Stack pop(): " + stack.pop());

        /* 2. SET */
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet (Sorted): " + treeSet);

        /* 3. MAP */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);

        Hashtable<Integer, String> hashtable = new Hashtable<>(hashMap);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap (Sorted): " + treeMap);
        System.out.println("Hashtable: " + hashtable);

        /* 4. QUEUE & DEQUE */
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Low");
        queue.add("High");
        queue.add("Medium");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);

        System.out.println("Queue: " + queue);
        System.out.println("Deque: " + deque);

        /* 5. ITERATORS */
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.print("ListIterator (Forward): ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        /* 6. COLLECTIONS UTILITY */
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println("Collections reversed list: " + arrayList);

        /* 7. ARRAYS UTILITY */
        int[] arr = {4, 1, 3, 2};
        Arrays.sort(arr);
        System.out.println("Arrays sort: " + Arrays.toString(arr));

        /* 8. SCANNER */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Age entered: " + age);

        /* 9. RANDOM */
        Random random = new Random();
        System.out.println("Random number: " + random.nextInt(100));

        /* 10. DATE & CALENDAR */
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println("Date: " + date);
        System.out.println("Year: " + cal.get(Calendar.YEAR));

        /* 11. STRING TOKENIZER */
        StringTokenizer st = new StringTokenizer("Java Python C++");
        System.out.print("Tokens: ");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + " ");
        }
        System.out.println();

    }
}
