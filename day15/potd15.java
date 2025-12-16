import java.util.*;
public class potd15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n =sc.nextLong();
        String num=String.valueOf(n);
        long res=0;

        for(int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0';
            if(ch==9 && i==0){
                ch=9;
            }
            else if(ch>=5){
                ch=9-ch;
            }
            res=res*10+ch;
        }
        System.out.println(res);
    }
}
