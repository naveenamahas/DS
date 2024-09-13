
import java.util.Scanner;

public class linkedlist {
  Node head;
          class Node {
            int data;
            Node next;
          Node(int val)    //constructor//
          {            
          data = val;
          }
  }
public boolean insertData(int data)
 {
      Node newNode = new Node(data);
      if (head == null) 
      {
          head = newNode;
      } 
      else if (head.data >= newNode.data)      //head data value  big new data newnode head  then newnextnext prev head//
      {
          if (head.data == newNode.data)
           {
              System.out.println("Duplicate value: " + newNode.data);
              return false;
           }
          newNode.next = head;
          head = newNode;
      }
      else 
      {
          Node temp = head;

          while (temp.next != null && temp.next.data <= newNode.data)
           {
              if (temp.next.data == newNode.data)
               {
                  System.out.println("Duplicate value: " + newNode.data);
                  return false;
               }
              temp = temp.next;
          }

          newNode.next = temp.next;
          temp.next = newNode;
      }
      return  true;
  }

  public void delete(int data) 
  {
      if (head == null) 
      {
          System.out.println("List is empty");
          return;
      }

      if (head.data == data) 
      {
          head = head.next;
          return;
      }

      Node temp = head;

      while (temp.next != null && temp.next.data != data)    // check for empty then newnode include && temp value is not null so condition true//
      {
          temp = temp.next;
      }

      if (temp.next == null)                   // temp next null so next value not define//
      {                                
          System.out.println("Value is not in the list");
      }
      else 
      {
          temp.next = temp.next.next;             //head next next looping method//
      }
  }

  public void update(int oldval, int newval) 
  {  
    if(oldval==newval)
    {
        System.out.println("same value not update");
    }
    delete(oldval);
    // insertData(newval); 
    if(!insertData(newval))
        insertData(oldval); 

    }
  
        

  public void display() 
  {
      Node temp = head;                         //not for change in head data so its using temp //
      while (temp != null) 
      {
          System.out.print(temp.data + " ");
          temp = temp.next;                    //next data store the temp value//
      }
      System.out.println();
  }
  public static void main(String[] args) 
  {   
      linkedlist n = new linkedlist();
        Scanner scanner = new Scanner(System.in);
        int userinput;

        do {
            System.err.println("-----------linkedlist---------------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter the option: ");
            userinput = scanner.nextInt();

            switch (userinput) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int insert = scanner.nextInt();
                    n.insertData(insert);
                    break;
                case 2:
                    System.out.print("Enter the value to delete: ");
                    int del = scanner.nextInt();
                    n.delete(del);
                    break;
                case 3:
                    System.out.print("Enter the value to update: ");
                    int oldval = scanner.nextInt();
                    System.out.print("Enter the new value: ");
                    int newval = scanner.nextInt();
                    n.update(oldval, newval);
                    break;
                case 4:
                    n.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                     System.out.println("Invalid option! Please try again.");
            }
        } while (userinput != 5);

        scanner.close();




   }

 }




























