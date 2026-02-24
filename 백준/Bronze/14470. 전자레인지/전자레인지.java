import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int nowtemp = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int frotemp = Integer.parseInt(br.readLine());
        int waketemp = Integer.parseInt(br.readLine());
        int hightemp = Integer.parseInt(br.readLine());
        int answer = 0;
        if(nowtemp == 0){
            answer = waketemp + (target * hightemp);
        }else if(nowtemp > 0){
            answer = target - nowtemp;
            answer = answer * hightemp;
        }else if(nowtemp < 0){
            answer = Math.abs(nowtemp) * frotemp + waketemp;
            answer += (target * hightemp);
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}