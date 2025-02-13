import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String [] sum = input.split(" ");
        int answer = 0;
        for(int i=0;i<num;i++){
            if(i+1 == Integer.parseInt(sum[i])){
            }else{
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}