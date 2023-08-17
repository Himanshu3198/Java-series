import java.util.ArrayList;

public class string_to_dml {
    public static void main(String[] args) {
//        System.out.println("Hello World..");

        String s="aa bbbb acdd aaadddddd         aae       eefefefe";
        String cleanedString = s.replaceAll("\\s+", " ").trim();
        ArrayList<String>lis=new ArrayList<>();
        String curr="";
        for(int i=0;i<cleanedString.length();i++){
            if(cleanedString.charAt(i)==' '){
                lis.add(curr);
                curr="";
                continue;
            }
            if(cleanedString.charAt(i)>='a' && cleanedString.charAt(i)<='z')
             curr+=cleanedString.charAt(i);
        }
        System.out.println(lis.size());
        for(String  x:lis){
            System.out.println(x);
        }

        String v1="Varchar";
        String v2="Varchar(25)";

        if(v2=="Varchar"){
            System.out.println("asci decimal");

        }else{
            String tmp="";
            for(int i=8;i<v2.length();i++){
                if(v2.charAt(i)==')') break;
                tmp+=v2.charAt(i);
            }
//            String bar=""|"";
            System.out.println("ascii decimal(|,maximum_length="+tmp+");");
        }
    }
}
