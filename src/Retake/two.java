package Retake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class two {
    private Matcher matcher;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(([@#][A-Za-z]{3,}[@#][@#])([A-Za-z]{3,}[@#]))");
        Matcher matcher = pattern.matcher(text);


        System.out.println(String.format("%d word pairs found!", matcher.groupCount()));

        if (matcher.find()) {

            String fullWord = matcher.group(1);
            int counts = matcher.groupCount();



            String word = (matcher.group(2));
            String reverseWord = matcher.group(3);

            StringBuilder sb = new StringBuilder(reverseWord);
            sb.reverse();
            String reverse = sb.toString();

            if (word.equals(reverse)) {

                int validCounts = matcher.groupCount();

                System.out.println(String.format("%d word pairs found!", validCounts));

                System.out.println("The mirror words are:");

                System.out.println(String.join(",", "%s <==> %s", word, reverse));
            } else {
                System.out.println("No mirror words!");
            }

        } else{
            System.out.println("No mirror words!");

        }

    }
        }





