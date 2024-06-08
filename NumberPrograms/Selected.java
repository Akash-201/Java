import java.util.Scanner;

public class Selected {
    public static String display(char ch) {
        if (ch == 'A') {
            return "A selected";
        } else if (ch == 'B') {
            return "B  selected";
        }

        else if (ch == 'C') {
            return "C  selected";

        } else if (ch == 'D') {
            return "D  selected";
        } else {
            return "invalid input";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a input");
        char ch = sc.next().charAt(0);

        System.out.println(display(ch));
        sc.close();
    }

}
