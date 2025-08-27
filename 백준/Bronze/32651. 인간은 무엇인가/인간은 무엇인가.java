import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String answer = "";
        if(num % 2024 == 0){
            answer = "Yes";
        }else{
            answer = "No";
        }
        if(num > 100000){
            answer = "No";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}