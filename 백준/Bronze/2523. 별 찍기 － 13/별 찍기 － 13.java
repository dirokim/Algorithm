import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String answer = "";
        for(int i=1;i<=num;i++){
            answer += "*";
            bw.write(answer+"\n");
        }
        for(int j=num-1;j>0;j--){
            answer = answer.substring(0,j);
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}