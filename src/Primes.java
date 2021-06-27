
public class Primes {
    public static void main(String[] args) {
        System.out.print("2 3 ");
        for (int i = 5; i <= 100;i += 2)
        {
            boolean prime = true;
            if (i % 2 == 0) prime = false;
            for (int j = 3; j <= i / 2; j += 2)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)  System.out.printf("%d ", i);
        }
    }
}
