import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class remove_duplicates {
     static Node head;
    public remove_duplicates push( remove_duplicates list ,int d)
    {
        Node node =new Node(d);
        if (head == null)
        {
            head=node;
        }
        else{

            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
        return list;
    }

    public void printlist()
    {
        Node temp=head;
        while(temp.next !=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    static void remove(Node head)
    {
        HashSet <Integer> hs=new HashSet<Integer>();
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            int curr_val=curr.data;
            if(hs.contains(curr_val))
            {
                prev.next=curr.next;
            }
            else{
                hs.add(curr_val);
                prev=curr;
            }
            curr=curr.next;

        }
    }

    public static void main(String[] args) {

        remove_duplicates llist=new remove_duplicates();
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        remove(head);
        llist.printlist();
        
        
    }

}
