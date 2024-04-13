public class homework9 {

    public static void main(String[] args) {
        int numDivisors = 0;
        int triangleNumber = 1;
        int i = 2;

        while (numDivisors <= 100) {
            triangleNumber += i;
            numDivisors = countDivisors(triangleNumber);
            i++;
        }

        System.out.println("The first triangle number to have over one hundred divisors is: " + triangleNumber);
    }

    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}

