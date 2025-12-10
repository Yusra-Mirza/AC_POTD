import java.util.*;
public class potd8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int m=sc.nextInt();
            int arr[]=new int[m];
            int sum=0;
            for(int i=0;i<m;i++){
                arr[i]=sc.nextInt();
                sum=sum+Math.abs(arr[i]);
            }
            System.out.println(sum+" "+minOp(arr,m));
            n--;
        }

    }
    public static int minOp(int arr[],int m){
        int count=0;

        for(int i=0;i<m;i++){
            if(arr[i]<0) {
                int j = i + 1;
                while (j <= m - 1 && arr[j] <= 0) {
                    j++;
                }
                count++;
                i = j;
            }
        }
        return count;
    }
}
