public class SumOfInteger {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(findSumOfIntegers(Integer.valueOf(args[args.length - 1])));
    }
    public static int findSumOfIntegers(int number) {
        if (number == 0) return 0;
        return (number % 10) + findSumOfIntegers(number / 10);
    }
}