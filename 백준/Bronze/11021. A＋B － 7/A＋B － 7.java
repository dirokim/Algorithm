import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        int a = 0;
        int b = 0;
        int ab = 0;
        int sum = 0;
        for(int i=0;i<num;i++){
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ab = a+b;
            sum = i+1;
            input = "Case #"+sum+": "+ab+"\n";
            bw.write(input);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}