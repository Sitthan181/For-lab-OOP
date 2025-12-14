import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder allChars = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        char ch = '\0';

        while (ch != 'z') {
            System.out.print("Enter a character: ");
            String input = sc.nextLine();
            ch = input.charAt(0);
            if (input.length() != 1 || ch < 'a' || ch > 'z') {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
                continue;
            }

            if (ch == 'z') break;

            allChars.append(ch);

            if ("aeiou".indexOf(ch) == -1) {
                consonants.append(ch);
            }
        }

        System.out.println("\nAll characters entered: " + allChars);
        System.out.println("Consonants only: " + consonants);
    }
}
