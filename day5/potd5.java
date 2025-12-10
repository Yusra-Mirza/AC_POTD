import java.util.Scanner;
public class potd5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            for(int j=0;j<3;j++){
                if(str.charAt(j)=='+'){
                    x++;
                    break;
                }
                if(str.charAt(j)=='-'){
                    x--;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}
