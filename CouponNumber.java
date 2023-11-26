import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    public static int generateRandom(int max) {
        Random random = new Random();
        int random_number = random.nextInt(max) + 1; // Adding 1 to ensure it's in the range [1, max]
        return random_number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupon numbers you want to generate");
        int N = sc.nextInt();
        int total_count = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the coupon number: ");
            int coupon_number = sc.nextInt();
            int count = 0;
            int digit_count=0;
            int holder=coupon_number;
            while (holder != 0) 
            { 
              holder = holder / 10; 
              ++digit_count; 
           } 
            while (coupon_number != generateRandom(digit_count)) {
                count++;
                if(count > 100)
                {
                    System.out.println("Too many random numbers generated.");
                    return;
                }
            }

            System.out.println("The number of random numbers generated to match the given coupon number: " + count);
            total_count = total_count + count;
        }

        System.out.println("The number of random numbers generated to match all the coupon numbers: " + total_count);
    }
}
