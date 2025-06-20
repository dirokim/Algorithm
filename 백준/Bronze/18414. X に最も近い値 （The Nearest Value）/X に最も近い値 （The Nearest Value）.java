import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num  = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int answer = num3;
        int answer2 = num3;
        int val = 0;
        for(int i=num2;i<=num3;i++){
            val = Math.abs(i-num);
            if(val < answer){
                answer = val;
                answer2 = i;
            }
        }
        bw.write(""+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}