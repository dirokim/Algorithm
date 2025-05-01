import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = num % 5;
        num = num / 5;
        String answer = "";
        for(int i=0;i<num;i++){
            answer += "V";
        }
        for(int j=0;j<num2;j++){
            answer += "I";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}