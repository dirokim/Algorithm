import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int time = Integer.parseInt(st.nextToken());
        int alcohol = Integer.parseInt(st.nextToken());
        String answer = "280";
        if(time >= 12 && time <= 16){
            if(alcohol < 1){
                answer = "320";
            }
        }else{
            if(alcohol == 1){
                answer = "280";
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}