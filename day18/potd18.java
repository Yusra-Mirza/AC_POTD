import java.util.*;
public class potd18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //input number of test cases
        int n = sc.nextInt();
        while (n > 0) {
            decipher(sc);
            n--;
        }
    }
    public static void decipher(Scanner sc){

        int w=sc.nextInt();//number of wheels
        int arr[]= new int[w];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int noMoves[]=new int[w];
        String moves[]=new String[w];
        for(int i=0;i<arr.length;i++){
            noMoves[i]=sc.nextInt();
//            sc.nextLine();
            moves[i]=sc.next();

        }

        for(int i=0;i<w;i++){
            for(int j=0;j<noMoves[i];j++){
                if(moves[i].charAt(j)=='U'){
                    if(arr[i]==0){
                        arr[i]=9;
                    }
                    else {
                        arr[i]--;
                    }
                }
                else{
                    if(arr[i]==9){
                        arr[i]=0;
                    }
                    else{
                        arr[i]++;
                    }

                }
            }
        }
        for(int i=0;i<w;i++){
            System.out.println(arr[i]);
        }

    }

}
