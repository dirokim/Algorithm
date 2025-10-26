import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int place = Integer.parseInt(br.readLine());
        int walk = Integer.parseInt(br.readLine());
        int answer = place * 10;
        if(place >= 3){
            answer += 20;
        }
        if(place >= 5){
            answer += 50;
        }
        if(walk > 1000){
            answer -= 15;
        }
        if(answer < 0){
            answer = 0;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}