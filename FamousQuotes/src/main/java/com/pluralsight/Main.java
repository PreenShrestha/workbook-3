package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] s = {
                "You snooze, you loose",
                "When the going gets tough, the tough get going",
                "God blesses those who hunger and thirst for justice, for they will be satisfied.",
                "No discipline seems pleasant at the time, but painful. Later on, however it produces a harvest of righteousness and peace for those who have been trained by it",
                "Success is not final, failure is not fatal: It is the courage to continue that counts",
                "The only way to do great work is to love what you do",
                "The best way to predict the future is to create it.",
                "I am all about the 4G's God, Goals, Growing & glowing."
        };
        System.out.println("Please select the number from 1-10 to show quotes");
        Scanner scanner = new Scanner(System.in);
        int UserInput = scanner.nextInt();
        try {

            System.out.println(s[UserInput - 1]);
            System.out.println("Do you want to see another quote (Y/N):");
            //"Preen" = charAt(0) P
            char ans = scanner.next().charAt(0); //.charAt(0)
            while (ans == 'Y' || ans == 'y') //  && -> It has to satisfy both  || -> Either one condition has to satisfy
            {
                System.out.println("Please select the number from 1-10 to show quotes");
                UserInput = scanner.nextInt();

                System.out.println(s[UserInput - 1]);
                System.out.println("Do you want to see another quote (Y/N):");
                ans = scanner.next().charAt(0);
            }
        }

        catch(Exception e)
        {

            System.out.println("INVALID INPUT - You have entered invalid input: ");
            System.out.println("Do you want to see another quote (Y/N):");
            char ans = scanner.next().charAt(0);
            while (ans == 'Y' || ans == 'y')
            {
                System.out.println("Please select the number from 1-10 to show quotes");
                UserInput = scanner.nextInt();

                System.out.println(s[UserInput - 1]);
                System.out.println("Do you want to see another quote (Y/N):");
                ans = scanner.next().charAt(0);
            }

        }
    }
}
