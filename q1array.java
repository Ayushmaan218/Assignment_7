import java.util.Scanner;

public class q1array {
    public static  final  int MAX = 100;
    public static int front = -1;
    public static int rear = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void insert(int Q[]){
        Scanner sc = new Scanner(System.in);
        if(is_full()){
            System.out.println("Queue is full. Insertion not possible.");
            return;
        }
        else{
            System.out.println("Enter the element to insert:");
            int element = sc.nextInt();
            if(front == -1){
                front = 0;
            }
            rear++;
            Q[rear] = element;
            System.out.println("Element inserted successfully.");
        }
    }
    public static void delete(int Q[]){
        if(is_empty()){
            System.out.println("Queue is empty. Deletion not possible.");
            return;
        }
        int element = Q[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        System.out.println("Deleted element: " + element);
    }
    public static void display(int Q[]){
        if(is_empty()){
            System.out.println("Queue is empty. Nothing to display.");
            return;
        }
        System.out.println("Elements in the queue:");
        for(int i= front;i<=rear;i++){
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }
    public static boolean is_full(){
        return rear == MAX - 1;
    }
    public static boolean is_empty(){
        return front == -1;
    }
}
