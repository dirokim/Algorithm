import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        if(val >= 2) val = val/2;
        int val2 = Integer.parseInt(st.nextToken());
        val += val2;
        if(num / val >= 1){
            answer = val;
        }else{
            answer = num;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}