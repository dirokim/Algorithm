import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String sum = "";
        String sum2 = "";
        String answer = "";
        for(int i=0;i<num;i++){
            sum += "@@@@@";
        }
        for(int i=0;i<num;i++){
            sum2 += "@";
        }
        for(int i=0;i<num;i++){
            answer = answer + sum +"\n";
        }
        for(int i=0;i<num;i++){
            answer = answer + sum2 +"\n";
        }
        for(int i=0;i<num;i++){
            answer = answer + sum2 +"\n";
        }
        for(int i=0;i<num;i++){
            answer = answer + sum2 +"\n";
        }
        for(int i=0;i<num;i++){
            answer = answer + sum +"\n";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}