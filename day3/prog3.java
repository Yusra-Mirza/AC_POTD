import java.util.*;
public class prog3 {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
     long m=sc.nextLong();
      long n=sc.nextLong();
       long a=sc.nextLong();
      long tiles_along_m=(long)(Math.ceil((double)m/a));
       long tiles_along_n=(long)Math.ceil((double)n/a);

       long res=(tiles_along_m * tiles_along_n);
        System.out.println(res);
    }

}
