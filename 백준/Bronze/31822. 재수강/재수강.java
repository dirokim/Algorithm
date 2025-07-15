import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = input.substring(0,5);
        int length = Integer.parseInt(br.readLine());
        String sum = "";
        int answer = 0;
        for(int i=0;i<length;i++){
            sum = br.readLine();
            sum = sum.substring(0,5);
            if(input.equals(sum)){
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}

