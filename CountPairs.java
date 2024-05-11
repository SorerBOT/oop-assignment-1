public class CountPairs {
    public static void main(String[] args) {
        int count = 0;
        int target = Integer.valueOf(args[args.length - 1]);

        if (args.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length - 1; j++) {
                int firstNumber = Integer.valueOf(args[i]);
                int secondNumber = Integer.valueOf(args[j]);
                if (firstNumber + secondNumber < target) count++;
            }
        }
        System.out.println(count);
    }
}