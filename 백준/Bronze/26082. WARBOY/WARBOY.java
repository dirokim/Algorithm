import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out)); 
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int price       = Integer.parseInt(st.nextToken()); 
        int performance = Integer.parseInt(st.nextToken());
        price           = performance / price * 3 * Integer.parseInt(st.nextToken()); 
        bw.write(""+price);
        br.close();
        bw.flush();
        bw.close();
	} 
}