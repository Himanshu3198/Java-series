import java.util.*;
import java.io.*;
import java.lang.*;


class Stack{

    public static void main(String args[]){
        Stack<Integer>stack=new Stack<Integer>();
        for(int i=5;i<=20;i+=5){
       
        stack.push(i);
        }
        // System.out.println(p);
        // System.out.println(stack);
        // System.out.println(stack.peek());
        System.out.println(stack.size());
        
        // while(!stack.empty()){
            
        //     int x=stack.peek();
        //     stack.pop();
        //     System.out.println(x);
        // } 
        
        for(int x:stack){
            System.out.println(x);
        } 
    }
}