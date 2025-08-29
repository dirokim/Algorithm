import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine());
        sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String answer = "";
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        if(sum == 0){
            answer = "Stay";
        }else if(sum > 0){
            answer = "Right";
        }else if(sum < 0){
            answer = "Left";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}