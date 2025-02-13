import java.io.*; 
import java.util.*; 
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        minute += num;
        if(minute >= 60){
            hour += minute / 60;
            minute = minute % 60;
        }
        if(hour > 23){
            if(hour ==24){
                hour = 0;
            }else{
                hour = hour % 24;
            }
        }
        bw.write(""+hour+" "+minute);
        br.close();
        bw.flush();
        bw.close();
	} 
}