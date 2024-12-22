import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int [] sum  = new int[4];
        int num = 0;
        int answer = 0;
        while(st.hasMoreTokens()){
            sum[num] = Integer.parseInt(st.nextToken());
            num++;
        }
        Arrays.sort(sum);
        int numA = sum[0] + sum[3];
        int numB = sum[1] + sum[2];
        if(numA >= numB){
            answer = numA - numB;
        }else{
            answer = numB - numA;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}