class quicksort{
    public static void main(String[] args) {
        int[] a={5,8,4,7,6,2,3};
        int n=a.length;
        quicksort q=new quicksort();
        q.quicksortrecursion(a,0,n-1);
        q.print(a);
       
    }


    void quicksortrecursion(int[] a,int low,int high)
    {
        int partition=partition(a,low,high);

        if(low<partition-1)
        {
            quicksortrecursion(a,low,partition-1);
        }
        if(partition<high)
        {
            quicksortrecursion(a,partition,high);
        }
    }

    int partition(int[] a,int low,int high)
    {
        int pivot=a[low+high/2];
        while(low<=high)
        {
            while(a[low]<pivot)
            {
                low++;
            }
            while(a[high]>pivot)
            {
                high--;
            }
        }
        return low;

    }
    void print(int[] a)
    {
        for(int i : a)
        {
            System.out.print(i +" ");
        }
    }

    
}
