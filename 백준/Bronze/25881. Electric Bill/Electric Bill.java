import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int answer = 0;
        for(int i=0;i<num;i++){
            sum = Integer.parseInt(br.readLine());
            if(sum <= 1000){
                answer = sum * val;
            }else if(sum > 1000){
                answer = (val * 1000) + ((sum-1000)*val2);
            }
            bw.write(""+sum+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}