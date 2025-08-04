import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine()," ");
        int val3 = Integer.parseInt(st.nextToken());
        int val4 = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(val2 >= val){
            answer = (val2 - val) * val4 + (val * val3);
        }else{
            answer = val2 * val3;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}