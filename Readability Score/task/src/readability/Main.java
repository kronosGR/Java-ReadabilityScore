package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        if (txt.length() > 100 ) {
            System.out.println("HARD");
        } else if (txt.length() > 0 && txt.length() < 101 ) {
            System.out.println("EASY");
        }

    }
}
