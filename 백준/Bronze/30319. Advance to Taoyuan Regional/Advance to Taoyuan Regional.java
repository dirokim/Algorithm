import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());
        String answer = "TOO LATE";
        if(year <= 2023){
            if(month == 9){
                if(date <= 16){
                    answer = "GOOD";
                }
            }else if(month < 9){
                answer = "GOOD";
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}