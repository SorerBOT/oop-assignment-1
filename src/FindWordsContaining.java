// 216872374 Alon Filler
/**
 * @author Alon Filler
 */
public class FindWordsContaining {
    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        String letter = args[args.length - 1];

        if (letter.length() > 1) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            String currentWord = args[i];
            if (currentWord.contains(letter)) {
                System.out.println(currentWord);
            }
        }
    }
}