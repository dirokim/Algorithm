import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        if(val >= val2){
            bw.write(""+val);
        }else{
            bw.write(""+val2);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}