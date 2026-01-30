import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int there = Integer.parseInt(st.nextToken())-1;
        int now = Integer.parseInt(st.nextToken())-1;
        int walk = Integer.parseInt(st.nextToken());
        int ele = Integer.parseInt(st.nextToken());
        int eanswer = (there + now) * ele;
        int wanswer = there * walk;
        bw.write(""+eanswer+" "+wanswer);
        br.close();
        bw.flush();
        bw.close();
	} 
}