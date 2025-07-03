import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val  = 0;
        val += (6 * Integer.parseInt(st.nextToken()));
        val += (3 * Integer.parseInt(st.nextToken()));
        val += (2 * Integer.parseInt(st.nextToken()));
        val += (1 * Integer.parseInt(st.nextToken()));
        val += (2 * Integer.parseInt(st.nextToken()));
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int val2 = 0;
        val2 += (6 * Integer.parseInt(st2.nextToken()));
        val2 += (3 * Integer.parseInt(st2.nextToken()));
        val2 += (2 * Integer.parseInt(st2.nextToken()));
        val2 += (1 * Integer.parseInt(st2.nextToken()));
        val2 += (2 * Integer.parseInt(st2.nextToken()));
        bw.write(""+val+" "+val2);
        br.close();
        bw.flush();
        bw.close();
	} 
}