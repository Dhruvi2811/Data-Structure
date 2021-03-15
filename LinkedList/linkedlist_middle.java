public class linkedlist_middle {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    void printmiddle()
    {
        Node slow_ptr=head;
        Node fast_ptr=head;

        while(fast_ptr != null && fast_ptr.next !=null)
        {
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }

        System.out.println(slow_ptr.data);

    }

    public linkedlist_middle push( linkedlist_middle list ,int d)
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
        
    }
    public static void main(String[] args) {

        linkedlist_middle llist=new linkedlist_middle();
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        //llist.printlist();
        llist.printmiddle();
        //llist.printlist();
        
    }



    
}
