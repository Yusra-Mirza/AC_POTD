import java.util.Scanner;
public class potd4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int threshold=arr[k-1];
        int count=0;


        for(Integer i:arr){

            if(i>=threshold && i!=0){

                count++;
            }
        }
        System.out.println(count);
    }
}
