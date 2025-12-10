import java.util.Scanner;
public class potd1 {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int k=sc.nextInt();
      int n=sc.nextInt();
      int w=sc.nextInt();
      int res=k*((w*(w+1))/2);
      int borrow=0;
      if(res>n){
        borrow=res-n;}
      System.out.println(borrow);

    }
}
