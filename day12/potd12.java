import java.util.Scanner;
public class potd12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int m=sc.nextInt();
            balancedArray(m);
            n--;
        }

    }
    public static void balancedArray(int m){
        if(m%4!=0){
            System.out.println("NO");

        }
        else{
            System.out.println("YES");
            int arr[]=new int[m];
            int sume=0;
            int sumo=0;
            for(int i=1;i<=m/2;i++){
                arr[i-1]=i*2;
                sume=sume+arr[i-1];
            }
            for(int i=1;i<m/2;i++){
                arr[i+m/2-1]=2*i-1;
                sumo=sumo+arr[i+m/2-1];
            }
            arr[m-1]=sume-sumo;
            for(int i=0;i<m;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
