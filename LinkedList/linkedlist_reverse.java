public class linkedlist_reverse {

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
    public linkedlist_reverse push( linkedlist_reverse list ,int d)
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
    public static void main(String[] args) {

        linkedlist_reverse llist=new linkedlist_reverse();
        llist.push(llist,1);
        llist.push(llist,2);
        llist.push(llist,3);
        
        head=llist.reverse(head);
        llist.printlist();
    }

    
    
}
