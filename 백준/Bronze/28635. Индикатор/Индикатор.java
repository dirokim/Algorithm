import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int val3 = Integer.parseInt(br.readLine());
        int answer = 0;
        if(val2 == val3){
            
        }else if(val2 > val3){
            answer = (val - val2) + val3;
        }else if(val2 < val3){
            answer = val3 - val2;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}