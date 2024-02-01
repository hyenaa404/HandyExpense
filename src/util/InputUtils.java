package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 84822
 */
public class InputUtils {

    private static Scanner sc = new Scanner(System.in);

    public static int inputOption(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }

   

    public static int inputInt() {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }

    public static String inputString() {
        String str;
        while (true) {
            try {
                str = sc.nextLine();

                if (str.length() > 25 || str.isBlank()) {
                    throw new IllegalArgumentException("Require to input string and no more than 25 words.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return str;
    }

    public static Date inputDate() {
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String inputDateStr = sc.nextLine();
        while (true) {
            try {
                date = sdf.parse(inputDateStr);
                break;
            } catch (ParseException e) {
                System.out.println("Please input a valid date with format dd-mm-yyyy");
            }
        }
        return date;
    }
    
    public static double inputDouble() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if (db <= 0){
                throw new ArithmeticException("Valid number is possitive.");
            }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid double number.");
            } catch (ArithmeticException e2){
                System.out.println(e2.getMessage());
            }
        }
        return db;
    }
}
