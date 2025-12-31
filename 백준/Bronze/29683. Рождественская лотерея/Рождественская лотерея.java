import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        val = Integer.parseInt(st.nextToken());
        int num = 0;
        int answer =0;
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        while(st2.hasMoreTokens()){
            num = Integer.parseInt(st2.nextToken());
            if(num >= val){
                num = num / val;
                answer += num;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}