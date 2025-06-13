public class LargestAndSmallest
{
    private static void largeAndSmall(int[] a)
    {
        int small=a[0];
        int large=a[0];
        for (int i:a)
        {
         if(i>large) large=i;
         if(i<small) small=i;
        }
        System.out.println("small:"+small+"\n"+"large:"+large);
    }


    public static void main(String[] args) {
        int[]a={50,20,66,45,2,1,7};
        largeAndSmall(a);
    }


}
