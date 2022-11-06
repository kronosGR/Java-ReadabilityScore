package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        //String pattern = "^ *\\w+(?: +\\w+){1,10}$";
        double sentencesL = txt.split("[!.//?]+").length;
        double wordsL = txt.split(" ").length;

        System.out.println((wordsL / sentencesL <= 10.0 ) ? "EASY" : "HARD");

    }
}
