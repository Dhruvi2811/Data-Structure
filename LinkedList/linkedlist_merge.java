public class linkedlist_merge {
    
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
    public linkedlist_merge push( linkedlist_merge list ,int d)
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
    public Node merge(Node l1,Node l2)
    {
        if(l1.data>l2.data)
        {
            int temp=l1.data;
            l1.data=l2.data;
            l2.data=temp;
        }
        Node res=l1;
        
        while(l1 !=null && l2 !=null)
        {
            Node temp=null;
            while(l1 !=null && l1.data<=l2.data)
            {
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;

            Node temp1=l1;
            l1=l2;
            l2=temp1;
        }
        return res;
    }
    public static void main(String[] args) {

        linkedlist_merge llist1=new linkedlist_merge();
        llist1.push(llist1,1);
        llist1.push(llist1,2);
        llist1.push(llist1,3);
        linkedlist_merge llist2=new linkedlist_merge();
        llist2.push(llist2,1);
        llist2.push(llist2,2);
        llist2.push(llist2,3);
        
        llist1.head=llist1.merge(llist1.head,llist2.head);
        llist1.printlist();
    }
}
