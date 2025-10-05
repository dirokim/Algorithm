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
        String answer = "3";
        if(a == b*c || b == a*c || c == a*b){
            answer = "2";    
        }
        if(a == b+c || b == a+c || c == a+b){
            answer = "1";    
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}