public class selectionsort
{
        public static void main(String[] args) {
            
            int[] a={5,8,4,7,6,2,3};
            int min;
            for(int i=0;i<a.length;i++)
            {
                min=i;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[j]<a[min])
                    {
                        min=j;
                    }
                }
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
            for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
   

        }
}
