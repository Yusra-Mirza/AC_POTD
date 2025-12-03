import java.util.*;
public class prog2{
    public  static void solve(int n){


        int max_x=n/2;
        int max_y=n/4;
        int count=0;
        for(int x=0;x<=max_x;x++){
            for(int y=0;y<=max_y;y++){
                if(2*x + 4*y==n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            solve(n);
            t--;
        }


    }

}