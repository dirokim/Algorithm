import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long num = Long.parseLong(st.nextToken());
        Long num2 = Long.parseLong(st.nextToken());
        Long answer = 0L;
        if(num >= 0 && num2 >= 0){
            if(num >= num2){
               answer = num - num2; 
            }else{
               answer = num2 - num;
            }
        }else if(num < 0 && num2 < 0){
            if(num <= num2){
                answer = num - num2;
            }else{
                answer = num2 - num;
            }
        }else if(num < 0 && num2 >= 0){
            answer = num2 - num;
        }else if(num >= 0 && num2 < 0){
            answer = num - num2;
        }
        answer = Math.abs(answer);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}