import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = a*b;
        Double num = Double.parseDouble(""+sum);
        num = num/2;
        String answer = ""+num;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}