import  java.util.Scanner;
class Node{
    int info;
    Node next;
}
public class q2LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;
        int choice, x;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter the element to insert:");
                    x = sc.nextInt();
                    front = insert(rear, front, x);
                    if (rear == null) {
                        rear = front;
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) {
                        rear = null;
                    }
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
    public static Node insert (Node rear, Node front, int x){
        Node newNode = new Node();
        newNode.info = x;
        newNode.next=null;
        if(rear == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        return front;
    }
    public static Node delete (Node rear, Node front){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
            if(front == null){
                rear = null;
            }
        }
        return front;
    }
    public static void display (Node rear, Node front){
        if (front == null) {
            System.out.println("Queue is empty");
        }
        else{
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
