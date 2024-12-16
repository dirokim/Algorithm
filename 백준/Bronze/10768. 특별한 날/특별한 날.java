import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int month = Integer.parseInt(br.readLine());
        int date = Integer.parseInt(br.readLine());
        String answer = "";
        if(month < 2){
           answer = "Before";
        }else if(month == 2){
            if(date == 18){
                answer = "Special";
            }else if(date > 18){
                answer = "After";
            }else if(date < 18){
                answer = "Before";
            }
        }else if(month > 2){
            answer = "After";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}