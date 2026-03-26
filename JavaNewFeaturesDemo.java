import java.util.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;
import java.util.Base64;

public class JavaNewFeaturesDemo {

    // =========================
    // Enum Example
    // =========================
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // =========================
    // Varargs Example
    // =========================
    static int sum(int... numbers) {
        int total = 0;
        for(int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {

        // =====================================
        // Lambda Expression
        // =====================================
        System.out.println("----- Lambda Expression -----");

        List<String> names = Arrays.asList("Java", "Python", "C++", "JavaScript");

        names.forEach(name -> System.out.println(name));


        // =====================================
        // Base64 Encoding / Decoding
        // =====================================
        System.out.println("\n----- Base64 Encoding -----");

        String text = "Hello Java";

        String encoded = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println("Encoded: " + encoded);

        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println("Decoded: " + decoded);


        // =====================================
        // New Date & Time API
        // =====================================
        System.out.println("\n----- Date & Time -----");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = dateTime.format(format);
        System.out.println("Formatted DateTime: " + formatted);


        // =====================================
        // For-Each Loop
        // =====================================
        System.out.println("\n----- For Each Loop -----");

        int numbers[] = {10,20,30,40,50};

        for(int num : numbers) {
            System.out.println(num);
        }


        // =====================================
        // Varargs
        // =====================================
        System.out.println("\n----- Varargs -----");

        System.out.println("Sum: " + sum(10,20,30,40));


        // =====================================
        // Enum
        // =====================================
        System.out.println("\n----- Enum -----");

        Day today = Day.FRIDAY;

        switch(today) {
            case MONDAY:
                System.out.println("Start of Week");
                break;

            case FRIDAY:
                System.out.println("Weekend Coming");
                break;

            default:
                System.out.println("Normal Day");
        }


        // =====================================
        // Stream API
        // =====================================
        System.out.println("\n----- Stream API -----");

        List<Integer> list = Arrays.asList(10,15,20,25,30,35);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));


        // =====================================
        // Collectors
        // =====================================
        System.out.println("\n----- Collectors -----");

        List<Integer> evenList =
                list.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenList);


        // =====================================
        // Map using Stream
        // =====================================
        System.out.println("\n----- Stream Map -----");

        List<Integer> square =
                list.stream()
                        .map(n -> n*n)
                        .collect(Collectors.toList());

        System.out.println("Squares: " + square);


        // =====================================
        // Fetch First Element
        // =====================================
        System.out.println("\n----- Fetch First -----");

        Optional<Integer> first =
                list.stream()
                        .filter(n -> n > 20)
                        .findFirst();

        first.ifPresent(System.out::println);


        // =====================================
        // Sorting using Stream
        // =====================================
        System.out.println("\n----- Stream Sorting -----");

        list.stream()
                .sorted()
                .forEach(System.out::println);


        // =====================================
        // Count using Stream
        // =====================================
        System.out.println("\n----- Stream Count -----");

        long count =
                list.stream()
                        .filter(n -> n > 20)
                        .count();

        System.out.println("Count > 20: " + count);

    }
}
