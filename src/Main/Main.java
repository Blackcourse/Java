package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: I like Java!!!");
        String check1 = input.nextLine();
        boolean start1;
        boolean end2;
        String Case1;
        String Case2;
        if (check1.contains("Java")) {
            System.out.println("Step1: It's contains Java");
        }
        if (start1 = check1.startsWith("I like")) {
            System.out.println("Step2: It's contains I'like");
        }
        if (end2 = check1.endsWith("!!!")) {
            System.out.println("Step3: It's contains !!!");
        } else {
            System.out.println("Sentence is not contains 'Java','!!!' or 'I like' ");
        }
        if (start1 & end2 & check1.contains("Java") == true) {
            Case1 = check1.toUpperCase();
            System.out.println(Case1);

            Case2 = check1.replace('a', 'o');

            System.out.println(Case2.substring(6, 11));

        }
    }
}
