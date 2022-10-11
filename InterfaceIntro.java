
interface  features1 {
    int x=5;
    void speedIncrease();
    void speedDecrease();
}

class car implements  features1{

    void info(){
        System.out.println("this is car..");
    }
    // we have to implement methods declare in interface or make
//     that method as abstract
    public void  speedIncrease(){
        System.out.println("speed of car increase");
    }
    public   void speedDecrease(){
        System.out.println("speed of car decrease");
    }
}
public class interfaceIntro {
    public static void main(String[] args) {
        car c1=new car();
        c1.speedIncrease();
        c1.speedDecrease();
//      we can access member declare in interface but
//       can't modify as it declare as final by default
//        c1.x=10;
        System.out.println(c1.x);
    }
}
