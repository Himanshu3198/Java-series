import java.util.*;
// import java.lang.*;
// import java.io.*;
import java.util.HashSet;

class Hashset{

    public static void main (String[] args)throws java.lang.Exception{


        HashSet<Integer> myset = new HashSet<>();
 
        // Add some elements to the set
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(4);
        myset.add(5);
        myset.add(6);
        myset.add(5);
        
        // remove
        myset.remove(2);
        // contains have type of boolean
        if(myset.contains(5))
          System.out.println("yes");
          //clear 
          // myset.clear();
          //  size 
          System.out.println(myset.size());
          
   
 
        // Adding a duplicate element has no effect
          myset.add(5);
   
        System.out.println(myset);
        Iterator<Integer>itr=myset.iterator();
        
        while(itr.hasNext()){
         
         int val=itr.next();
         System.out.println(val);
        }
      

    }
}
