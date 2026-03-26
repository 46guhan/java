import java.util.*;

class ExceptionDemo {
    static void Try(){
        try {
            int a = 10;
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    static void Catch2(){
        try {
            int[] a = {1,2,3,4};
            a[4] = 10;
            System.out.println(Arrays.toString(a));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }

    static void Finally(){
        try {
            int a = 10 / 2;
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    static void checkAge(int age) throws Exception{
        if (age < 18)
            throw new ArithmeticException("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args){
        Try();
        Catch2();
        Finally();
        checkAge(16);
    }
}
