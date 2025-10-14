import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long val  = Long.parseLong(st.nextToken());
        Long val2 = Long.parseLong(st.nextToken());
        Long val3 = Long.parseLong(st.nextToken());
        Long temp = 0L;
        if(val > val2){
            temp = val;
            val  = val2;
            val2 = temp;
        }
        if(val2 > val3){
            temp = val2;
            val2  = val3;
            val3 = temp;
        }
        if(val > val2){
            temp = val;
            val  = val2;
            val2 = temp;
        }
        bw.write(""+val2);
        br.close();
        bw.flush();
        bw.close();
	} 
}