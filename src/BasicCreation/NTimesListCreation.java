package BasicCreation;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class NTimesListCreation {

    //Creating List
    public static Node1 ListCreation(Node1 head, int data){
        Node1 nn=new Node1(data);
        if(head==null){
            return nn;
        }
        Node1 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    //Printing List
    public static void printList(Node1 head){
        Node1 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of List :- ");
        int n=sc.nextInt();
        Node1 head=null;
        for(int i=1;i<=n;i++){
            System.out.print("Enter "+i+"th Data :- ");
            int data=sc.nextInt();
            head=ListCreation(head,data);
        }
        printList(head);
    }
}
