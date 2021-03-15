public class linkedlist_delete {

    static Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public linkedlist_delete push( linkedlist_delete list ,int d)
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

    public Node delete(int position)

    {
        int count=0;
        Node prev=head;
        while(count<position-1)
        {
            prev=prev.next;
            count++;
        }
        Node curr=prev.next;
        prev.next=curr.next;
        curr.next=null;
        return curr;
    }
    public static void main(String[] args) {

        linkedlist_delete llist=new linkedlist_delete();
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        
        llist.delete(1);
        llist.printlist();
    }
    
}
