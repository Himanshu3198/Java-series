public class ExceptionHanding2 {
      static void avg(){
        try{
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Exception caught "+e);
        }
    }
    static  void solve() throws ArithmeticException {
          System.out.println("inside solve");
          throw new ArithmeticException();
    }
    public static void main(String args[]){
//       // finally block example
//        try{
//            int num=Integer.parseInt("hello");
//            System.out.println(num);
//        }finally {
//            System.out.println("Finally block always executed..");
//        }

//  throw block example
        avg();
        // throws block example
        try{
            solve();
        }finally {
            System.out.println("After throws..");
        }

    }
}
