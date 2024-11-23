import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = num;
        String answer = "";
        for(int i=0;i<num;i++){
            answer = "";
            for(int j=0;j<sum;j++){
                answer += "*";
            }
            bw.write(answer+"\n");
            sum--;
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}