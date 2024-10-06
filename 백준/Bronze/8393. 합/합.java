import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out)); 
        String input = "";
        int sum = 0;
        int sum2 = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            sum = Integer.parseInt(input);
        }
        for(int i=1;i<=sum;i++){
            sum2 += i;
        }
        answer = ""+sum2;
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
	} 
}