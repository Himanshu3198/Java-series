import java.util.*;


class Shape{

   public void area(){
       System.out.println("display area");
   }
}

class Triangle extends Shape{
          

    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
//  multi level inheritence
class EqiTriangle extends Triangle{
  
    public void area(int l,int h,int b){
        System.out.println(0.5*l*h*b);
    }
} 

// hierarchal inheritence 

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r);
    }
}


class OopsInheritence{

    public static void main(String args[]){

         Triangle t1=new Triangle();

        //   t1.area(10,5);
        EqiTriangle t2=new EqiTriangle();
        // t2.area(5,10,15);
        // 
        Circle c1=new Circle();
        c1.area(5);  
    }
}