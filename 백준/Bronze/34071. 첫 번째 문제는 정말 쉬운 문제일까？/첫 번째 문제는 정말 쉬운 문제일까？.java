import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int sum = Integer.parseInt(br.readLine());
        int high = sum;
        int row = sum;
        int sum2 = 0;
        String answer = "?";
        while((input = br.readLine()) != null){
            sum2 = Integer.parseInt(input);
            if(high < sum2){
                high = sum2;
            }
            if(row > sum2){
                row = sum2;
            }
        }
        if(sum == row){
            answer = "ez";
        }
        if(sum == high){
            answer = "hard";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}