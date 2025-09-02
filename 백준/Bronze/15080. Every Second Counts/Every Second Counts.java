import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," : ");
        int sum = 24 * 3600;
        int val = (Integer.parseInt(st.nextToken())*3600) + (Integer.parseInt(st.nextToken())*60)+ Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," : ");
        int val2 = (Integer.parseInt(st2.nextToken())*3600) + (Integer.parseInt(st2.nextToken())*60)+ Integer.parseInt(st2.nextToken());
        int answer = 0;
        sum = sum - val;
        if(val > val2){
            answer = sum + val2;
        }else{
            answer = val2 - val;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}