import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("date of birth in month:");
        int month = input.nextInt();

        System.out.print("date of birth in day:");
        int day = input.nextInt();

        if (month > 0 && month < 13) {
            if (month == 1) {
                if (day <= 21) {
                    System.out.println("your zodiac sign: capricorn");
                } else {
                    System.out.println("your zodiac sign: aquarius");
                }
            }
            if (month == 2) {
                if (day <= 21) {
                    System.out.println("your zodiac sign:aquarius");
                } else {
                    System.out.println("your zodiac sign: pisces");
                }
            }
            if (month == 3) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :pisces");
                } else {
                    System.out.println("your zodiac sign: aries");
                }
            }
            if (month == 4) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :aries");
                } else {
                    System.out.println("your zodiac sign: taurus");
                }
            }
            if (month == 5) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :taurus");
                } else {
                    System.out.println("your zodiac sign: gemini");
                }
            }
            if (month == 6) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :gemini");
                } else {
                    System.out.println("your zodiac sign: cancer");
                }
            }
            if (month == 7) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :cancer");
                } else {
                    System.out.println("your zodiac sign: leo");
                }
            }
            if (month == 8) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :leo");
                } else {
                    System.out.println("your zodiac sign: virgo");
                }
            }
            if (month == 9) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :virgo");
                } else {
                    System.out.println("your zodiac sign: libra");
                }
            }
            if (month == 10) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :libra");
                } else {
                    System.out.println("your zodiac sign: scorpio");
                }
            }
            if (month == 11) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :scorpio");
                } else {
                    System.out.println("your zodiac sign: sagittarius");
                }
            }
            if (month == 12) {
                if (day <= 21) {
                    System.out.println("your zodiac sign :sagittarius");
                } else {
                    System.out.println("your zodiac sign: capricorn");
                }
            }
        }else {
            System.out.println("you logged in incorrectly ,please try again");
        }
    }
}
