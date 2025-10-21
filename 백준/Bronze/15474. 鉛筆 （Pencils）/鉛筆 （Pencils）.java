import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long num = Long.parseLong(st.nextToken());
        Long val = Long.parseLong(st.nextToken());
        Long val2 = Long.parseLong(st.nextToken());
        Long val3 = Long.parseLong(st.nextToken());
        Long val4 = Long.parseLong(st.nextToken());
        Long sum = 0L;
        if(num % val != 0){
            sum = 1L;
        }else{
            sum = 0L;
        }
        val = num / val + sum;
        if(num % val3 != 0L){
            sum = 1L;
        }else{
            sum = 0L;
        }
        val3 = num / val3 + sum;
        val = val * val2;
        val3 = val3 * val4;
        if(val <= val3){
            bw.write(""+val);
        }else{
            bw.write(""+val3);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}