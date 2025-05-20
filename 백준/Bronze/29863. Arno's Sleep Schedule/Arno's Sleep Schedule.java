import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int hour = Integer.parseInt(br.readLine());
        int hour2 = Integer.parseInt(br.readLine());
        if(hour > 19){
            hour = 24 - hour;
            hour = hour2 + hour;
        }else{
            hour = hour2 - hour;
        }
        bw.write(""+hour);
        br.close();
        bw.flush();
        bw.close();
	} 
}