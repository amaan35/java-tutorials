public class Main {
    public static void main(String[] args) {
        //Singly Linked List
//        LL list = new LL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.insertLast(6);
//        list.insert(7, 3);
//        list.display();
//        System.out.println("\n"+list.deleteFirst());
//        list.display();
//        System.out.println("\n"+list.deleteLast());
//        list.display();
//        System.out.println("\n"+list.delete(3));
//        list.display();

        //Doubly Linked List
//        DoublyLL list = new DoublyLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.insert(3, 6);
//        list.display();

        //Circular Linked List
        CircularLL list = new CircularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delete(3);
        list.display();
        list.delete(4);
        list.display();
    }
}
