import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String answer = "";
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            answer = "";
            for(int j=0;j<num2;j++){
                answer += "*";
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}