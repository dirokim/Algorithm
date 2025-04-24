import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String answer = "";
        if(b < a && b >= n){
            answer = "Subway";
        }else if(a == b && b >= n){
            answer = "Anything";
        }else{
            answer = "Bus";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}