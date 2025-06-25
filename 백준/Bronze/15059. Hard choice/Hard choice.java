import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num  = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int val  = Integer.parseInt(st2.nextToken());
        int val2 = Integer.parseInt(st2.nextToken());
        int val3 = Integer.parseInt(st2.nextToken());
        int answer = 0;
        if(num < val){
            answer += val - num;
        }
        if(num2 < val2){
            answer += val2 - num2;
        }
        if(num3 < val3){
            answer += val3 - num3;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}