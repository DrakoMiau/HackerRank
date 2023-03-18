package day15;

import java.util.Scanner;

class Node{
    Node next;
    int data;
    //constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
}
public class Day15 {
    public static Node insert(Node head, int data){
         Node newNode = new Node(data);
          if (head == null) {
            head = newNode;
        } else{
             Node temp = head;
             while (temp.next != null) {                 
                 temp = temp.next;
             }
             temp.next = newNode;
         }
          return head;
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    } 
}
