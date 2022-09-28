public class ExceptionInJava {

    public static void main(String args[]){
       try {
           try {
               int a = 10;
               int b = a / 0;
           } catch (ArithmeticException e) {
               System.out.println("this is arithmatic exception");
           }
//         null pointer exception
           try {
               String s = null;
               System.out.println(s.length());
           } catch (NullPointerException e) {
               System.out.println("Given string is null." + e);
           }

           // number format exceptions

           try {
               int num = Integer.parseInt("himanshu");
               System.out.println(num);

           } catch (NumberFormatException e) {
               System.out.println(e);
           }
           // arrayIndexOutOfBound exception
           try {
               int arr[] = new int[5];
               for (int i = 0; i < 5; i++) arr[i] = i;
//            for(int i:arr) System.out.println(arr[i]);
               System.out.println(arr[10]);

           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println(e);
           }
       }catch (Exception e){
           System.out.println("All exception is handled");
       }


    }
}
