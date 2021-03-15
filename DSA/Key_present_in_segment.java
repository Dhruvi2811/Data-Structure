public class Key_present_in_segment {

    public static void main(String[] args) {
        int a[]={3,5,4,2,4,9,3,1,7,3,11,12};
        int i;
        int k=3;
        int x=3;
        for(i=0;i<a.length;i=i+k)
        {
            for(int j=0;j<k;j++)
            {
                if(a[i+j]==x)
                {
                    break;
                }
            }
            if(j==k)
            {
                return false;
            }
        }
    }
    
}
