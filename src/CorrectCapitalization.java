import java.util.Scanner;

public class CorrectCapitalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        boolean isCapitalized = checkCapitalizedText(text);
        System.out.println(isCapitalized);

        sc.close();
    }

    public static boolean checkCapitalizedText(String text) {

        boolean startsUpperCase = false;

        if(Character.isUpperCase(text.charAt(0))) {
            startsUpperCase = true;
            
            for(int i = 1; i < text.length(); i++) {
                if(Character.isUpperCase(text.charAt(i))) {
                    startsUpperCase = false;
                    break;
                }
            }
        }
        
        return startsUpperCase || text.equals(text.toUpperCase()) || text.equals(text.toLowerCase());
    }
}
