import java.util.*;



class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age,String name){
        System.out.println(age+","+name);
    }

}
class OopsPolymorphism{

    public static void main(String args[]){


         Student s1=new Student();
        
         s1.printInfo(24);
         s1.printInfo("himanshu");
         s1.printInfo(24,"himanshu");
    }
}