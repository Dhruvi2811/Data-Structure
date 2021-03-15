public class insertionsort {

    public static void main(String[] args) {
        
        int[] a={5,8,4,7,6,2,3};
        int j;
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }



        
    }
    
}
