import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;
class queue {
    static Queue<Integer> q = new LinkedList<>(); 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            switch(a[i])
            {
                case 1:
                    Enqueue(sc.nextInt());
                    break;
                case 2:
                    Dequeue();
                    break;
                case 3:
                    Display();
                    break;
            }
        }
    }
    static void Enqueue(int n)
    {
        q.add(n);
    }
    static void Dequeue()
    {
        q.remove();
    }
    static void Display()
    {
        int head=q.peek();
        System.out.println(head);
    }
	
}

