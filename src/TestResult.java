package test;
import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String password = scanner.nextLine();
        System.out.println("MD5: " + Exercise.getMd5Hash(password));
    }
}
