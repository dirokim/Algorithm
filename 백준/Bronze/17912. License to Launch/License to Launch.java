import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sum = 1000000;
        int answer = -1;
        int answer2 = 0;
        while(st.hasMoreTokens()){
            answer++;
            num = Integer.parseInt(st.nextToken());
            if(num < sum){
                sum = num;
                answer2 = answer;
            }
        }
        bw.write(""+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}