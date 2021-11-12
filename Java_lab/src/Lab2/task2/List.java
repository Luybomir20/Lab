package Lab2.task2;

public class List {

    private Node head;

    public List() {

        head = null;
    }

    public boolean isEmpty() {//empty list

        return head == null;
    }

    public void add(final int data) {//add to list
       final  Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            head = head.next;
        }
    }
}
    //public void printt(){
       // Node temp=head;
       // for(;temp!=null;){
        //    System.out.println(temp.data);
        //    temp=temp.next;
       // }










