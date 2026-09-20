package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End of Program");
    }

    public static void method1() {

        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 End***");
    }

    public static void method2() {

        System.out.println("***METHOD2 START***");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vet = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vet[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error!");
        }

        System.out.println("***METHOD2 End***");
        sc.close();
    }
}
