
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class linkedlist_palindrome {

    Node head;
    public linkedlist_palindrome push( linkedlist_palindrome list ,int d)
    {
        Node node =new Node(d);
        if (list.head == null)
        {
            list.head=node;
        }
        else{

            Node n=list.head;
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

    public Node reverse(Node node)

    {
        Node curr =node;
        Node prev=null;
        Node nextt=null;

        while(curr !=null)
        {
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        return prev;
        
    }

    public boolean palindrome(Node head)
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        Node slow_ptr=head;
        Node fast_ptr=head;

        while(fast_ptr != null && fast_ptr.next !=null)
        {
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }

        slow_ptr.next=reverse(slow_ptr.next);

        slow_ptr=slow_ptr.next;

        while(slow_ptr!=null)
        {
            if(head.data!=slow_ptr.data)
            {
                return false;
            }
            head=head.next;
            slow_ptr=slow_ptr.next;
            
        }

        return true;
    }

    public static void main(String[] args) {

        linkedlist_palindrome llist=new linkedlist_palindrome();
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        llist.printlist();
        
        boolean p=llist.palindrome(llist.head);
        System.out.println(p);
    }
    
}
