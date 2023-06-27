import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int result = 0;
        MathOperator operator;

        out.println("Введите выражение");
        String inputLine = in.nextLine();
        in.close();
        String[] inputLetters = inputLine.split(" ");

        a = ParseNumber(inputLetters[0]);
        b = ParseNumber(inputLetters[2]);

        if (a < 0 || b < 0) {
            out.println("Введенное Вами выражение имеет отрицательные величины, или является некорректным.");
            return;
        }

        switch (inputLetters[1])
        {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        out.printf("Результат вычисления: %d", result);

    }

    private static int ParseNumber(String s) {
        switch (s) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        try {
            return Integer.parseInt(s);
        } catch (Exception e)
        {
            return -1;
        }
    }
}