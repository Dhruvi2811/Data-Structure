

class linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static void main(String[] args) {
        
        linkedlist llist=new linkedlist();
        llist.push(llist,12);
        llist.push(llist,13);
        llist.push(llist,14);
        llist.push(llist,15);
        llist.show();

    }

    public linkedlist push(linkedlist list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
   
        // Return the list by head 
        return list; 
    } 

    void show()
    {
        Node n=head;
        while(n.next != null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
    
}

