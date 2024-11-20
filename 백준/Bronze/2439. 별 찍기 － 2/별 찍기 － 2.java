import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
		String answer = ""; 
		int sum = num-1;
		for(int i=0;i<num;i++) {
			answer = "";
			for(int j=sum;j>0;j--) {
				answer += " ";
			}
			for(int k=0;k<=i;k++) {
				answer += "*";
			}
			sum--;
            bw.write(answer+"\n");
		}
        br.close();
        bw.flush();
        bw.close();
	} 
}