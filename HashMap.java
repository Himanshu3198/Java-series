import java.util.*;

class Hashmap{
    public static void main(String arg[]){
//      map of integer
        //  Scanner sc=new Scanner(System.in);
       
        //  int arr[]=new int[5];
        //  int n=arr.length;
        //  for(int i=0;i<n;i++){

        //     int x=sc.nextInt();
        //     arr[i]=x;
        //  }
        //  HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
        //  for(int i=0;i<n;i++){

        //     if(hash.containsKey(arr[i])){
        //          hash.put(arr[i],hash.get(arr[i])+1);
        //     }else{
        //         hash.put(arr[i],1);
        //     }
        //  }
         
        //  for(Map.Entry it:hash.entrySet()){
        //      System.out.println(it.getKey() + " " + it.getValue());
        //  }

        // map of string 

        String s="abcaacaadedfd";

        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){

            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
 

        for(Map.Entry it:hm.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        // function
        hm.remove('a');
        System.out.println(hm.size());

        for(Map.Entry it:hm.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }
     
    }
}
