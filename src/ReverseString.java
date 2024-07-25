import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String newText = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }

        System.out.println(newText);

        sc.close();
    }
}
