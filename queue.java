
import java.util.Scanner;

public class queue {
    Node head;
    class Node
    {
        int data;
        Node next;

        public Node(int val) 
        {
            data= val;
        }

        
    }
    public void enqueue(int data)
    {
        Node newval=new Node(data);
        if(head==null)
        {
            head=newval;
        }
        else 
        {
            // head.next=newval;
            // head=newval;

            Node temp=head;
            while(temp.next!=null)
            {
               temp = temp.next;
            }
            newval.next=temp.next;
            temp.next=newval;

            
        }
    }
        public void dequeue()
        {
            if(head==null)
            {
                System.out.println("Queue is empty");
            }
            else
            {
                head=head.next;
                System.out.println("Dequeue successfuly");
            }
        }
        

        

    
    public void display()
    {
        Node temp=head;
        while (temp!=null) 
        { 
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) 
    {
        queue n=new queue();
        int user ;
       do {
        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------Queue--------------");
        System.out.println("1.ENQUEUE");
        System.out.println("2.DEQUEUE");
        System.out.println("3.DISPLAY");
        System.out.print("Enter your option");
        user=scanner.nextInt();
        switch (user) 
        {
            case 1:
                System.out.print("Enter the data");
                int enqueue= scanner.nextInt();
                n.enqueue(enqueue);
                break;
            case 2:
                n.dequeue();
                break;
            case 3:
                n.display();
                break;
            default:
                System.out.println("Invalid option");
       }
      }while (user!=4); 
          
      
        
    }

    }

    

