import java.util.*;
public class potd6 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n>0){
            String str=sc.nextLine();
            HashMap <Character,Integer> hm= new HashMap<>();
                for (char ch : str.toCharArray()) {

                    hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                }

            int count=0;
            if(hm.size()>=2){
                for(Map.Entry <Character,Integer> e: hm.entrySet()){
                    if(e.getValue()>=2){
                        count++;
                    }
                }
            }
            if(count<2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            n--;

            }

        }
    }

