package Retake;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String input = scanner.nextLine();


        while (!input.equals("Reveal")) {

            String[] tokens = input.split(":\\|:");

            switch (tokens[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    String toAppend = " ";
                    String newString = string.substring(0, index) + toAppend + string.substring(index);
                    string = newString;
                    System.out.println(newString);
                    break;
                case "Reverse":
                    String toReverse = tokens[1];

                    if (string.contains(toReverse)) {
                        string = string.replace(toReverse, "");
                        StringBuilder builder = new StringBuilder(toReverse);
                        builder.reverse();
                        string = string + builder;
//                                StringBuilder newSB = new StringBuilder(string);
//                        newSB.append(builder);

                        System.out.println(string);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":

                    String substring = tokens[1];
                    String replacement = tokens[2];
                    if (string.contains(substring)) {

                        string = string.replaceAll(substring, replacement);
                        System.out.println(string);
                    }
                    break;
                default: {
                    System.out.println("error");
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(String.format("You have a new text message: %s", string));
    }
}
