import java.util.* ;
import java.io.*; 
public class Queue 
{
    int arr[];
    int qfront;
    int rear;
    int size;

    Queue() 
    {
        size=100001;
        arr= new int[size];
        qfront=0;
        rear=0;
    }

    boolean isEmpty() 
    {
       if(qfront==rear)
       return true;
       else
       return false;
    }

    void enqueue(int data)
    {
       if(rear==size)
       System.out.println("Queue is full");
       else
       {
           arr[rear]=data;
           rear++; 
       }
    }

    int dequeue() 
    {
       if(qfront==rear)
       return -1;

       else
       {
           int ans=arr[qfront];
           arr[qfront]=-1;
           qfront++;
           if(qfront==rear)
           {
               qfront=0;
               rear=0;

           }
           return ans;
       }
    }

    int front() 
    {
     if(qfront==rear)
     return -1;   
   
    else
    {
        return arr[qfront];
    }
    }
}
