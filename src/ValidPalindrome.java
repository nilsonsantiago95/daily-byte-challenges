import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine().toLowerCase();

        for(int i = 0; i <= text.length() - 1; i++) {
            if(String.valueOf(text.charAt(i)).matches("\\W")) {
                text = text.replace(String.valueOf(text.charAt(i)), "");
            } 
        }
        
        String newText = "".toLowerCase();
        for(int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }
        
        System.err.println("Is palindrome? " + newText.equals(text));

        sc.close();
    }
}
