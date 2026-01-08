


    import java.util.Scanner;

    public class potd37 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int cnt =0;
            while(n>=1){
                cnt++;
                n=(n&(n-1));

            }
            System.out.println(cnt);
        }
    }



