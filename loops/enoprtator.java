class enoprtator
{
    public static void main(String[]args)
    {
        int[] numbers={3,5,7,5};
        int target=3;
        System.out.println("Checkeng numbers equal or not equal to"+target+":");
        for(int num: numbers){
            if(num==target){
                System.out.println(num+"=="+target+"Equal");
            }
            else if(num!=target)
            {
                System.out.println(num+"!="+target+" not equal" );
            }
        }
    }
}