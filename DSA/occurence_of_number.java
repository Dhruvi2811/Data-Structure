import java.io.*;
import java.util.*;
public class occurence_of_number {

    public static void main(String[] args) {
        int a[]={1,2,3,1,2,2,2,2,3,4,5,6};

        HashMap <Integer,Integer> hm=new HashMap <Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i] ,hm.get(a[i]));
            }
            else
            {
                hm.put(a[i],1);
            }
        }
        if(hm.containsKey(2))
        {
            System.out.println(hm.get(2));
        }

    }
    
}
