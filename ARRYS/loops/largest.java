import java.util.Scanner;
class largest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int[] nums={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        System.out.println("largest number"+max);
        sc.close();
    }
}