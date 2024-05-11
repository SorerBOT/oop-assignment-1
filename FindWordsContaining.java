public class FindWordsContaining {
    public static void main(String[] args) {
        String letter = args[args.length - 1];

        if (args.length < 2 || letter.length() > 1) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < args.length - 1; i++) {
            String currentWord = args[i];
            if (currentWord.contains(letter)) System.out.println(currentWord);
        }
    }    
}