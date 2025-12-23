import java.util.Scanner;

public class potd22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {

            int arr[] = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();

            }
            solve(arr);
            n--;
        }
    }
    public static void solve(int arr[]){
        int max=0;
        int index=-1;

        for(int i=0;i<3;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }

        }
        int indexmin=index;
        int count=0;
        for(int i=0;i<3;i++){
            if(arr[i]==max){
            count++;}
            if(arr[i]<max){
                indexmin=i;
            }
        }
        if(count<2){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            System.out.println(arr[index]+" "+(arr[indexmin])+" "+arr[indexmin]);
        }

    }
}
