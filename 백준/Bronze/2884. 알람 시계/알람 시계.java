import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        if(minute < 45){
            if(hour < 1){
                hour = 23;
            }else{
                hour--;
            }
            minute = minute - 45 + 60;
        }else{
            minute = minute - 45;
        }
        bw.write(""+hour+" "+minute);
        br.close();
        bw.flush();
        bw.close();
	} 
}