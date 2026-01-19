import java.io.*;
import java.util.*;

public class E_Trip_Spoiler {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    static class FastWriter {
        BufferedWriter bw;
        FastWriter() { bw = new BufferedWriter(new OutputStreamWriter(System.out)); }
        void print(Object obj) throws IOException { bw.append(String.valueOf(obj)); }
        void println(Object obj) throws IOException { print(obj); bw.append("\n"); }
        void close() throws IOException { bw.flush(); bw.close(); }
    }

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n=in.nextInt();
        int k=in.nextInt();
        int mark[]=new int[n+1];
        
        while(k>0){
            int a=in.nextInt();
            int b=in.nextInt();
            int l,s;
            if(a>b){
                 l=a;
                 s=b;
            }
            else{
                l=b;
                s=a;
            }
            mark[l]=Math.max(mark[l],s);
            k--;
        }
        int j=1;
        int i=1;
        long cnt=0;
        while(j<=n){
            if(mark[j]!=0){
                if(i<=mark[j]){
                i=mark[j]+1;}
            }
            cnt+=j-i+1;
            j++;
        }
        System.out.println(cnt);

        out.close();
    }
}