import  java.util.*;


class Pen{
    String color;
    String type;
    public void printPen(){
        System.out.println(color+" "+type);
    }
    Pen(){
        System.out.println("construction called while object creatd");
    }
}
class  ClassObject{

    public static void main(String args[]){
       
        Pen p1=new Pen();
        p1.color="black";
        p1.type="gel";
        p1.printPen();
        Pen p2=new Pen();
        p2.color="red";
        p2.type="BallPoint";
        p2.printPen();
    }
}