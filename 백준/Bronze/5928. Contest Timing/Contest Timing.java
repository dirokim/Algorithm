import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int date = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int answer = date*24 + hour;
        answer = answer * 60 + minute;
        if(answer < 16511){ 
            bw.write("-1");
        }else{
            answer = answer - 16511;
            bw.write(""+answer);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}