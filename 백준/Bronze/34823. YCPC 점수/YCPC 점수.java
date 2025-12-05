import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()) / 2;
        int c = Integer.parseInt(st.nextToken());
        int temp = 0;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        bw.write(""+a);
        br.close();
        bw.flush();
        bw.close();
	} 
}