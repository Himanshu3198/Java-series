import java.util.*;
// import java.io.*;
// import java.lang.*;
import java.util.LinkedList;
// import java.util.Queue;

class Queue{

     public static void main(String args[]){
        Queue<Integer>q=new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        
        // while(q.size()>0){
            
        //     int x=q.poll();
        //     System.out.println(x);
            
        // }
        
        for(int x:q){
            System.out.println(x);
        }
     }
}