import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int temp = 0;
        if(b > a){
            temp = b;
            b = a;
            a = temp;
        }
        if(c > b){
            temp = b;
            b = c;
            c = temp;
        }
        if(b > a){
            temp = b;
            b = a;
            a = temp;
        }
        b = a - b;
        c = a - c;
        temp = b + c;
        bw.write(""+temp);
        br.close();
        bw.flush();
        bw.close();
	} 
}