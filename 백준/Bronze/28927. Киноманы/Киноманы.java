import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int val  = (3 * Integer.parseInt(st.nextToken())) + (20 * Integer.parseInt(st.nextToken()))+(120 * Integer.parseInt(st.nextToken()));
        int val2 = (3 * Integer.parseInt(st2.nextToken())) + (20 * Integer.parseInt(st2.nextToken()))+(120 * Integer.parseInt(st2.nextToken()));
        if(val == val2){
            bw.write("Draw");
        }else if(val > val2){
            bw.write("Max");
        }else if(val2 > val){
            bw.write("Mel");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}