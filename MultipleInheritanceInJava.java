import java.util.*;

interface  eat{
     void canEat();
}
interface walk{
    void canWalk();
}

class man implements eat,walk{
   public void canEat(){
        System.out.println("A man can eat..");
    }
   public  void canWalk(){
        System.out.println("A man can walk..");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
       man m1=new man();
       m1.canEat();
       m1.canWalk();
    }
}
