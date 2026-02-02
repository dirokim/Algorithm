import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = 0;
        int val = 0;
        int val2 = 0;
        int num = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            if(num > val){
                val = num;
            }
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        while(st2.hasMoreTokens()){
            num = Integer.parseInt(st2.nextToken());
            if(num > val2){
                val2 = num;
            }
        }
        answer = val + val2;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}