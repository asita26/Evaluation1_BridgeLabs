import java.util.*;
public class CouponNumber
{

   public static int generateRandom()
    {
        Random random = new Random();
        int random_number =random.nextInt();
        return random_number;
    }
   public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of coupon numbers you want to generate");
      int N=sc.nextInt();
      int total_count=0;
      for(int i=1; i<=N; i++)
     {
         System.out.println("Enter the coupon number: ");
         int coupon_number=sc.nextInt();
         int x=generateRandom();
         int count=0;
         while(coupon_number != x)
           {
                 count++;
                 x=generateRandom();
            }
        System.out.println("The number of random numbers generated to match the given coupon number" +count);
        total_count= total_count+count;
     }
     
    System.out.println("The number of random numbers generated to match all the coupon numbers" +total_count);
   }
}
