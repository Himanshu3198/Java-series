import java.util.*;


class Arraylist{

    public static void main(String[] args){


        List<String>fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelons");
        fruits.add("pomegrante");
        System.out.println(fruits);
        // ------- adding element to particular index
        // fruits.add(2,"papaya");
        
        
        // System.out.println(fruits);
        //  ---------iterate over ArrayList
        //  for(int i=0;i<fruits.size();i++){
             
        //      System.out.println(fruits.get(i));
        //  }
        // ------ remove element at particular index
        // fruits.remove(1);
        // System.out.println(fruits);
                  
        // clear all element
        //   fruits.clear();
        
        // ----- sorting the ArrayList
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}