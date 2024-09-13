
import java.util.Scanner;

public class stack {
    Node head;
 class Node
 {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
        }
        //  int Array[]=  data;

    }
    public  void push(int data)
    {
        Node newnode= new Node(data);
        if(head==null)
        {
            head=newnode;
           
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    public void peek()
    {

        if(head!=null)
        {
        System.out.println(head.data + "");
        }
        else
        {
            System.out.println("stack is empty");
        }
    }
    public  void  pop()
    {
        // Node newnode= new Node();
        if(head==null)
        {
            System.out.println("stack is empty");
        }
        else
        {  
            System.out.println("pop successfully");
            
             head =head.next;
        }
        
    }
    public  void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        stack n= new stack();
        Scanner scanner=new Scanner(System.in);
        int input;
        do{
        System.out.println("--------stack-------");
        System.out.println("1.push");
        System.out.println("2.peek");
        System.out.println("3.pop");
        System.err.println("4.Display");
        System.out.print("enter the option");
         input= scanner.nextInt();
         switch (input) {
             case 1:
                 System.out.print("Enter push value");
                 int push=scanner.nextInt();
                 n.push(push);
                 break;
             case 2:
                 n.peek();
                 break;
             case 3:
                //  System.out.print("Enter pop value");
                //  int pop=scanner.nextInt();
                 n.pop();
                 break;
            case 4:
                n.display();
                break;
            default:
                System.out.println("Invalid option");
             
         }
        }while (input != 5);
            
            
        
    }

}
